package Main;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException; // Add this import
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

import Model.BillingModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/apartmentrentalsdb";
    private static final String DB_USER = "root"; // Replace with your DB username
    private static final String DB_PASSWORD = ""; // Replace with your DB password

    // Singleton instance
    private static DatabaseConnection instance = null;
    private static Connection connection = null;

    // Private constructor to prevent instantiation
    public DatabaseConnection() {
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Database connection established.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to create database connection.");
        }
    }

    // Method to get the singleton instance
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Method to get the connection
    public Connection getConnection() {
        return connection;
    }
    

    // Method to close the connection
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
                System.out.println("Database connection closed.");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Failed to close database connection.");
            }
        }
    }
    
    public String saveUserDetails(String strBillingID, String name, String strBillingDate, String strAmount, String strDueDate, String status) {
        String query = "INSERT INTO billing (billingID, name, billingDate, amount, dueDate, status) VALUES (?, ?, ?, ?, ?, ?)";
        
        try {
            
            int billingID = Integer.parseInt(strBillingID);  // This will throw a NumberFormatException if not a valid integer
            double amount = Double.parseDouble(strAmount);

            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as needed
            Date billingDate = null;
            Date dueDate = null;
            try {
                billingDate = sdf.parse(strBillingDate); // May throw ParseException
                dueDate = sdf.parse(strDueDate);
            } catch (ParseException e) {
                return "Invalid date format. Please enter a valid date (yyyy-MM-dd)."; // Handle the exception
            }
            
            
            
            try (PreparedStatement stmt = connection.prepareStatement(query)) {
                stmt.setInt(1, billingID);
                stmt.setString(2, name);
                stmt.setDate(3, new java.sql.Date(billingDate.getTime())); 
                stmt.setDouble(4, amount);
                stmt.setDate(5, new java.sql.Date(dueDate.getTime())); 
                stmt.setString(6, status);
                
                int rowsAffected = stmt.executeUpdate();
                if (rowsAffected > 0) {
                    return "Billing details saved successfully.";
                }
            }
        } catch (NumberFormatException e) {
          //  return "Invalid age entered. Please enter a valid number.";
         // Handle invalid number format for billingID or amount
            if (e.getMessage().contains("For input string")) {
                return "Invalid billing ID entered. Please enter a valid number for billing ID.";
            } else {
                return "Invalid amount entered. Please enter a valid number for the amount.";
            }
            
        } catch (SQLException e) {
        	// Handle any SQL related issues
            e.printStackTrace();
            return "Database error occurred while saving billing details: ";
        }
        
        return "Failed to save billing details. Please try again.";
    }
    
    
    public String saveUserData(String strBillingID, String name, String strBillingDate, String strAmount, String strDueDate, String status) {
        return getInstance().saveUserDetails(strBillingID, name, strBillingDate, strAmount, strDueDate, status);
    }
    
    public List<BillingModel> getBillingData() {
        List<BillingModel> billingList = new ArrayList<>();
        String query = "SELECT billingID, name, billingDate, amount, dueDate, status FROM billing";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                BillingModel billing = new BillingModel(); // Create an instance of Student without a constructor
                billing.setBillingID(rs.getInt("billingID"));
                billing.setName(rs.getString("name"));
                billing.setBillingDate(rs.getString("billingDate"));
                billing.setAmount(rs.getDouble("amount"));
                billing.setDueDate(rs.getString("dueDate"));
                billing.setStatus(rs.getString("status"));

                billingList.add(billing);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return billingList;
    }
    

	
}
