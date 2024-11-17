package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Tenant extends JFrame {
    
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtOverview;
    private JTextField txtId;
    private JTextField txtName;
    private JTextField txtContactNumber;
    private JTextField txtEmail;
    private JTextField txtUnit;
    private JTextField txtOtherInfos;

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
        setSize(1440, 752);
        setLocationRelativeTo(null);
        
        contentPane = new JPanel();
        contentPane.setBackground(new Color(240, 238, 226));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        // Sidebar panel
        JPanel sidebarPanel = new JPanel();
        sidebarPanel.setBackground(new Color(255, 255, 255)); // Olive green background color
        sidebarPanel.setBounds(0, 124, 251, 785);
        sidebarPanel.setLayout(null);
        contentPane.add(sidebarPanel);
        
        JButton btnNewButton = new JButton("Homepage");
        btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnNewButton.setBounds(0, 58, 251, 58);
        sidebarPanel.add(btnNewButton);
        
        JButton btnApartments = new JButton("Apartments");
        btnApartments.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnApartments.setBounds(0, 114, 251, 58);
        sidebarPanel.add(btnApartments);
        
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
        btnReservation.setBounds(0, 283, 251, 58);
        sidebarPanel.add(btnReservation);
        
        JButton btnReports = new JButton("Reports");
        btnReports.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnReports.setBounds(0, 340, 251, 58);
        sidebarPanel.add(btnReports);
        
        JButton btnSettings = new JButton("Settings");
        btnSettings.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnSettings.setBounds(0, 395, 251, 58);
        sidebarPanel.add(btnSettings);

        // Sidebar buttons
        String[] menuItems = {"Dashboard", "Apartments", "Tenants", "Billing", "Reservation", "Reports", "Settings"};
        int yPosition = 100;
        for (String item : menuItems) {
            JButton menuButton = new JButton(item);
            menuButton.setBounds(10, yPosition, 200, 50);
            menuButton.setFont(new Font("Arial", Font.BOLD, 16));
            menuButton.setFocusPainted(false);
            menuButton.setBackground(new Color(255, 255, 255));
            menuButton.setForeground(new Color(0, 0, 0));
            if (item.equals("Tenants")) {
                menuButton.setBackground(new Color(154, 154, 76)); // Highlighted color for 'Tenants'
            }
            sidebarPanel.add(menuButton);
            yPosition += 70;
        }

        // Header panel
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(183, 183, 47));
        headerPanel.setBounds(0, 0, 1451, 122);
        contentPane.add(headerPanel);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setBounds(333, 186, 1055, 469);
        contentPane.add(panel);
        panel.setLayout(null);
        
        txtOverview = new JTextField();
        txtOverview.setFont(new Font("Segoe UI", Font.BOLD, 18));
        txtOverview.setText("  Overview");
        txtOverview.setBounds(38, 30, 115, 31);
        panel.add(txtOverview);
        txtOverview.setColumns(10);
        
        txtId = new JTextField();
        txtId.setText(" ID");
        txtId.setFont(new Font("Segoe UI", Font.BOLD, 18));
        txtId.setColumns(10);
        txtId.setBounds(89, 92, 35, 25);
        panel.add(txtId);
        
        txtName = new JTextField();
        txtName.setText("  Name");
        txtName.setFont(new Font("Segoe UI", Font.BOLD, 18));
        txtName.setColumns(10);
        txtName.setBounds(199, 92, 76, 25);
        panel.add(txtName);
        
        txtContactNumber = new JTextField();
        txtContactNumber.setText(" Contact Number");
        txtContactNumber.setFont(new Font("Segoe UI", Font.BOLD, 18));
        txtContactNumber.setColumns(10);
        txtContactNumber.setBounds(337, 92, 158, 25);
        panel.add(txtContactNumber);
        
        txtEmail = new JTextField();
        txtEmail.setText(" Email");
        txtEmail.setFont(new Font("Segoe UI", Font.BOLD, 18));
        txtEmail.setColumns(10);
        txtEmail.setBounds(552, 92, 65, 25);
        panel.add(txtEmail);
        
        txtUnit = new JTextField();
        txtUnit.setText(" Unit");
        txtUnit.setFont(new Font("Segoe UI", Font.BOLD, 18));
        txtUnit.setColumns(10);
        txtUnit.setBounds(704, 92, 59, 25);
        panel.add(txtUnit);
        
        txtOtherInfos = new JTextField();
        txtOtherInfos.setText(" Other Infos");
        txtOtherInfos.setFont(new Font("Segoe UI", Font.BOLD, 18));
        txtOtherInfos.setColumns(10);
        txtOtherInfos.setBounds(839, 92, 107, 25);
        panel.add(txtOtherInfos);

        // Tenant details table
        String[] columnNames = {"ID", "Name", "Contact Number", "Email", "Unit", "Other Infos"};
        Object[][] data = {
            {"0101", "John Doe", "32-13-23", "@gmail", "Studio", "▶"},
            {"0102", "Kamala", "42-5-23", "@gmail", "Loft", "▶"},
            {"0103", "Tom", "23-58", "@yahoo", "Penthouse", "▶"},
            {"0104", "Jerry", "75-22", "@gmail", "Solo Suite", "▶"},
            {"0105", "James", "89-56", "@yahoo", "Dual Deluxe", "▶"},
            {"0106", "Trump", "73-43", "@gmail", "Solo Suite", "▶"},
            {"0107", "John Doe", "05-23", "@yahoo", "Solo Suite", "▶"},
            {"0108", "Lany", "36-543", "@yahoo", "Duo Deluxe", "▶"}
        };
        for (int i = 1; i <= 5; i++) {
            JButton pageButton = new JButton(String.valueOf(i));
            pageButton.setPreferredSize(new Dimension(30, 30));
            paginationPanel.add(pageButton);
        }
    }
}
