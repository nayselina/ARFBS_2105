package Main;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;

public class Tenant extends JFrame {
    
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                Tenant frame = new Tenant();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Tenant() {
        setTitle("Tenant Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1440, 752); // Set size of the window
        setLocationRelativeTo(null); // Center the window

        // Initialize the content panel
        contentPane = new JPanel();
        contentPane.setBackground(new Color(240, 238, 226));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        // Sidebar panel
        JPanel sidebarPanel = new JPanel();
        sidebarPanel.setBackground(new Color(255, 255, 255)); // White background color
        sidebarPanel.setBounds(0, 124, 251, 785); // Set position and size of sidebar
        sidebarPanel.setLayout(null);
        contentPane.add(sidebarPanel);
        
        JButton btnNewButton = new JButton("Homepage");
        btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnNewButton.setBounds(0, 58, 251, 58);
        sidebarPanel.add(btnNewButton);
        
        JButton btnApartment = new JButton("Apartment");
        btnApartment.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnApartment.setBounds(0, 114, 251, 58);
        sidebarPanel.add(btnApartment);
        
        JButton btnTenants = new JButton("Tenants");
        btnTenants.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnTenants.setBounds(0, 171, 251, 58);
        sidebarPanel.add(btnTenants);
        
        JButton btnBilling = new JButton("Billing");
        btnBilling.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnBilling.setBounds(0, 227, 251, 58);
        sidebarPanel.add(btnBilling);
        
        JButton btnReservation = new JButton("Reservation");
        btnReservation.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnReservation.setBounds(0, 280, 251, 58);
        sidebarPanel.add(btnReservation);
        
        JButton btnReports = new JButton("Reports");
        btnReports.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnReports.setBounds(0, 335, 251, 58);
        sidebarPanel.add(btnReports);
        
        JButton btnSettings = new JButton("Settings");
        btnSettings.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnSettings.setBounds(0, 390, 251, 58);
        sidebarPanel.add(btnSettings);

        // Sidebar buttons with Segoe UI font
        String[] menuItems = {"Homepage", "Apartments", "Tenants", "Billing", "Reservation", "Reports", "Settings"};
        int yPosition = 100;
        for (String item : menuItems) {
            JButton menuButton = new JButton(item);
            menuButton.setBounds(10, yPosition, 200, 50); // Set button position and size
            menuButton.setFont(new Font("Segoe UI", Font.BOLD, 16)); // Set font to Segoe UI
            menuButton.setFocusPainted(false);
            menuButton.setBackground(new Color(255, 255, 255)); // White background for buttons
            menuButton.setForeground(new Color(0, 0, 0)); // Black text color
            if (item.equals("Tenants")) {
                menuButton.setBackground(new Color(154, 154, 76)); // Highlight color for 'Tenants'
            }
            sidebarPanel.add(menuButton);
            yPosition += 70; // Increase yPosition for next button
        }

     // Header panel
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(183, 183, 47)); // Set header color
        headerPanel.setBounds(0, 0, 1451, 122); // Set position and size for header
        contentPane.add(headerPanel);

        // Main panel for the table and title
        JPanel tablePanel = new JPanel(new BorderLayout());
        tablePanel.setBackground(new Color(255, 255, 255)); // White background for the main content panel
        tablePanel.setBounds(333, 186, 1055, 469); // Set position and size for the table panel
        contentPane.add(tablePanel);

        // Title label for the table section
        JLabel titleLabel = new JLabel("Tenant Information", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 16)); // Set the font to Segoe UI
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0)); // Add padding to the label
        tablePanel.add(titleLabel, BorderLayout.NORTH);

        // Column names for the table
        String[] columnNames = {"ID", "Name", "Contact Number", "Email", "Unit", "Other Info"};

        // Empty data for the table (all fields are blank
        Object[][] data = {
            {"", "", "", "", "", ""},
            {"", "", "", "", "", ""},
            {"", "", "", "", "", ""},
            {"", "", "", "", "", ""},
            {"", "", "", "", "", ""},
            {"", "", "", "", "", ""},
            {"", "", "", "", "", ""},
            {"", "", "", "", "", ""},
            {"", "", "", "", "", ""},
            {"", "", "", "", "", ""},
            {"", "", "", "", "", ""},
            {"", "", "", "", "", ""},
            {"", "", "", "", "", ""}
        };

        // Use DefaultTableModel to bind data to the JTable
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);

        // Increase font size for the entire table
        table.setFont(new Font("Segoe UI", Font.PLAIN, 18));  // Set font size to 18

        // Set row height for better appearance
        table.setRowHeight(30);

        // Adjust the font size for the table header
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("Segoe UI", Font.BOLD, 18)); // Set header font size

        // Create a scroll pane to hold the table
        JScrollPane scrollPane = new JScrollPane(table);
        tablePanel.add(scrollPane, BorderLayout.CENTER); // Add the scrollPane with table to the panel
    }
}
