package Main;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.awt.FlowLayout;

public class Billing extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Billing frame = new Billing();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Billing() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1440, 752);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(240, 238, 226));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Sidebar panel
        JPanel sidebarPanel = new JPanel();
        sidebarPanel.setBackground(new Color(255, 255, 255)); // White background color
        sidebarPanel.setBounds(0, 124, 251, 600); // Adjusted height to fit content
        sidebarPanel.setLayout(null);
        contentPane.add(sidebarPanel);

        // Buttons in the sidebar
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

        // Changed variable name to btnBilling
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

        // Header panel
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(183, 183, 47)); // Set header color
        headerPanel.setBounds(0, 0, 1451, 122); // Set position and size for header
        contentPane.add(headerPanel);

        // Main panel for the billing form
        JPanel billingPanel = new JPanel();
        billingPanel.setLayout(new GridLayout(7, 2, 10, 10)); // 7 rows, 2 columns, spacing of 10px
        billingPanel.setBounds(285, 184, 400, 430); // Position on the left side
        billingPanel.setBackground(new Color(255, 255, 255)); // White background color
        billingPanel.setBorder(BorderFactory.createTitledBorder("Billing Details")); // Change border title
        contentPane.add(billingPanel);

        // Add form fields for Billing Information (Right-aligned)
        JLabel lblBillingID = new JLabel("Billing ID:");
        lblBillingID.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        JTextField txtBillingID = new JTextField();
        txtBillingID.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        billingPanel.add(lblBillingID);
        billingPanel.add(txtBillingID);

        JLabel lblName = new JLabel("Name:");
        lblName.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        JTextField txtName = new JTextField();
        txtName.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        billingPanel.add(lblName);
        billingPanel.add(txtName);

        JLabel lblDate = new JLabel("Billing Date:");
        lblDate.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        JTextField txtDate = new JTextField();
        txtDate.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        billingPanel.add(lblDate);
        billingPanel.add(txtDate);

        JLabel lblAmount = new JLabel("Amount:");
        lblAmount.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        JTextField txtAmount = new JTextField();
        txtAmount.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        billingPanel.add(lblAmount);
        billingPanel.add(txtAmount);

        JLabel lblDueDate = new JLabel("Due Date:");
        lblDueDate.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        JTextField txtDueDate = new JTextField();
        txtDueDate.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        billingPanel.add(lblDueDate);
        billingPanel.add(txtDueDate);

        JLabel lblStatus = new JLabel("Status:");
        lblStatus.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        JTextField txtStatus = new JTextField();
        txtStatus.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        billingPanel.add(lblStatus);
        billingPanel.add(txtStatus);
        billingPanel.add(new JLabel());

        // Main panel for the table and title
        JPanel tablePanel = new JPanel();
        tablePanel.setBackground(new Color(255, 255, 255)); // White background for the main content panel
        tablePanel.setBounds(714, 190, 636, 426); // Position on the right side (smaller width)
        contentPane.add(tablePanel);
        tablePanel.setLayout(null);

        // Add the icon next to the table title
        ImageIcon icon = new ImageIcon("resources/icon.png"); // Path to your icon file
        JLabel tableTitleLabel = new JLabel("Table Billing Information", icon, SwingConstants.CENTER);
        tableTitleLabel.setBounds(0, 0, 636, 40);
        tablePanel.add(tableTitleLabel);
        tableTitleLabel.setFont(new Font("Segoe UI", Font.BOLD, 16)); // Set the font to Segoe UI
        tableTitleLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        // Column names for the table
        String[] columnNames = {"ID", "Name", "Date", "Amount", "Due Date", "Status"};

        // Empty data for the table (blank object array)
        Object[][] data = {}; // Empty data array, no rows initially

        // DefaultTableModel to bind data to the JTable
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
        scrollPane.setBounds(0, 40, 636, 380); // Resize the scroll pane (make it smaller)
        tablePanel.add(scrollPane);

        // Add the pagination buttons with small size at bottom right
        JPanel paginationPanel = new JPanel();
        paginationPanel.setBackground(new Color(255, 255, 255));
        paginationPanel.setBounds(714, 635, 636, 60); // Adjust the position at the bottom
        paginationPanel.setLayout(new FlowLayout(FlowLayout.RIGHT)); // Align to the right
        contentPane.add(paginationPanel);

        // Set small button size and font size
        JButton btnPrevious = new JButton("Previous");
        btnPrevious.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        btnPrevious.setBackground(new Color(183, 183, 47));
        btnPrevious.setForeground(Color.WHITE);
        btnPrevious.setPreferredSize(new java.awt.Dimension(80, 30)); // Set small button size
        paginationPanel.add(btnPrevious);

        JButton btnPage1 = new JButton("1");
        btnPage1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        btnPage1.setBackground(new Color(183, 183, 47));
        btnPage1.setForeground(Color.WHITE);
        btnPage1.setPreferredSize(new java.awt.Dimension(40, 30)); // Set small button size
        paginationPanel.add(btnPage1);

        JButton btnPage2 = new JButton("2");
        btnPage2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        btnPage2.setBackground(new Color(183, 183, 47));
        btnPage2.setForeground(Color.WHITE);
        btnPage2.setPreferredSize(new java.awt.Dimension(40, 30)); // Set small button size
        paginationPanel.add(btnPage2);

        JButton btnNext = new JButton("Next");
        btnNext.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        btnNext.setBackground(new Color(183, 183, 47));
        btnNext.setForeground(Color.WHITE);
        btnNext.setPreferredSize(new java.awt.Dimension(80, 30)); // Set small button size
        paginationPanel.add(btnNext);
    }
}
