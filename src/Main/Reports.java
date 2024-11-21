package Main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Reports extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField tenantNameField, apartmentField;
    private JComboBox<String> paymentStatusDropdown;
    private DefaultTableModel tableModel;
    private int currentPage = 0; // Track the current page
    private int rowsPerPage = 5; // Number of rows per page

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Reports frame = new Reports();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Reports() {
        setTitle("Reports - Tenant Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1440, 800); // Increased height for better spacing
        setLocationRelativeTo(null);

        // Main content pane
        contentPane = new JPanel();
        contentPane.setBackground(new Color(240, 238, 226));
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        contentPane.setLayout(null);
        setContentPane(contentPane);

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

        // Changed variable name from Tenants to Reports
        JButton Reports = new JButton("Tenants");
        Reports.setFont(new Font("Segoe UI", Font.BOLD, 25));
        Reports.setBounds(0, 171, 251, 58);
        sidebarPanel.add(Reports);

        // Changed variable name for Billing button
        JButton btnInvoice = new JButton("Billing");
        btnInvoice.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnInvoice.setBounds(0, 227, 251, 58);
        sidebarPanel.add(btnInvoice);

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

        // Header Panel
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(183, 183, 47));
        headerPanel.setBounds(0, 0, 1440, 120);
        headerPanel.setLayout(null);
        contentPane.add(headerPanel);

        JLabel logoLabel = new JLabel();
        ImageIcon logoIcon = new ImageIcon("C:/Users/YOJ/git/2105_ARAFBS/src/images/logo.png"); // Adjust the path
        logoLabel.setIcon(logoIcon);
        logoLabel.setBounds(1050, 10, 100, 100);
        headerPanel.add(logoLabel);

        // Filters Panel
        JPanel filtersPanel = new JPanel();
        filtersPanel.setBounds(260, 140, 1150, 63);
        filtersPanel.setBackground(new Color(247, 247, 231));
        filtersPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        contentPane.add(filtersPanel);

        // Title for Filter Section
        JLabel filterTitle = new JLabel("Filter By:", SwingConstants.LEFT);
        filterTitle.setFont(new Font("Segoe UI", Font.BOLD, 18));
        filtersPanel.add(filterTitle);

        // Tenant Name Filter
        JLabel tenantLabel = new JLabel("Tenant Name:");
        tenantLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        filtersPanel.add(tenantLabel);

        tenantNameField = new JTextField();
        tenantNameField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        tenantNameField.setColumns(15);
        filtersPanel.add(tenantNameField);

        // Apartment Number Filter
        JLabel apartmentLabel = new JLabel("Apartment No:");
        apartmentLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        filtersPanel.add(apartmentLabel);

        apartmentField = new JTextField();
        apartmentField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        apartmentField.setColumns(10);
        filtersPanel.add(apartmentField);

        // Payment Status Filter
        JLabel paymentStatusLabel = new JLabel("Payment Status:");
        paymentStatusLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        filtersPanel.add(paymentStatusLabel);

        paymentStatusDropdown = new JComboBox<>(new String[]{"All", "Paid", "Pending"});
        paymentStatusDropdown.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        filtersPanel.add(paymentStatusDropdown);

        // Filter Button
        JButton btnGenerate = new JButton("Filter");
        btnGenerate.setFont(new Font("Segoe UI", Font.BOLD, 16));
        btnGenerate.setBackground(new Color(183, 183, 47));
        btnGenerate.setForeground(Color.WHITE);
        filtersPanel.add(btnGenerate);

        // Table Panel
        JPanel tablePanel = new JPanel();
        tablePanel.setBounds(260, 200, 1000, 300);
        tablePanel.setBackground(Color.WHITE);
        tablePanel.setLayout(new BorderLayout());
        tablePanel.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
        contentPane.add(tablePanel);

        // Table
        String[] columnNames = {"Tenant Name", "Apartment Number", "Rent Amount", "Payment Status"};
        Object[][] data = {
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""}
        };

        tableModel = new DefaultTableModel(data, columnNames);
        JTable reportTable = new JTable(tableModel);

        // Table Styling
        reportTable.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        reportTable.setRowHeight(30);
        reportTable.setGridColor(new Color(200, 200, 200));
        reportTable.setShowGrid(true);
        reportTable.setSelectionBackground(new Color(183, 183, 47));
        reportTable.setSelectionForeground(Color.WHITE);

        JTableHeader tableHeader = reportTable.getTableHeader();
        tableHeader.setFont(new Font("Segoe UI", Font.BOLD, 18));
        tableHeader.setBackground(new Color(183, 183, 47));
        tableHeader.setForeground(Color.WHITE);

        JScrollPane scrollPane = new JScrollPane(reportTable);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        tablePanel.add(scrollPane, BorderLayout.CENTER);

        // Billing Info Panel
        JPanel billingInfoPanel = new JPanel();
        billingInfoPanel.setBounds(260, 510, 1000, 120);
        billingInfoPanel.setBackground(Color.WHITE);
        billingInfoPanel.setLayout(new GridLayout(2, 6, 20, 10));
        billingInfoPanel.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
        contentPane.add(billingInfoPanel);

        // Billing ID Field
        JLabel billingIDLabel = new JLabel("Billing ID:");
        billingIDLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        billingInfoPanel.add(billingIDLabel);
        JTextField billingIDField = new JTextField();
        billingIDField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        billingInfoPanel.add(billingIDField);

        // Name Field
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        billingInfoPanel.add(nameLabel);
        JTextField nameField = new JTextField();
        nameField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        billingInfoPanel.add(nameField);

        // Date Field
        JLabel dateLabel = new JLabel("Date:");
        dateLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        billingInfoPanel.add(dateLabel);
        JTextField dateField = new JTextField();
        dateField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        billingInfoPanel.add(dateField);

        // Amount Field
        JLabel amountLabel = new JLabel("Amount:");
        amountLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        billingInfoPanel.add(amountLabel);
        JTextField amountField = new JTextField();
        amountField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        billingInfoPanel.add(amountField);

        // Current Page Display and Pagination Buttons
        JPanel paginationPanel = new JPanel();
        paginationPanel.setBackground(new Color(240, 238, 226));
        paginationPanel.setBounds(260, 635, 1000, 60);
        paginationPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        contentPane.add(paginationPanel);

        JLabel pageNumberLabel = new JLabel("Page: " + (currentPage + 1));
        pageNumberLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        paginationPanel.add(pageNumberLabel);

        JButton previousButton = new JButton("Previous");
        previousButton.setFont(new Font("Segoe UI", Font.BOLD, 16));
        previousButton.setBackground(new Color(183, 183, 47));
        previousButton.setForeground(Color.WHITE);
        paginationPanel.add(previousButton);

        JButton nextButton = new JButton("Next");
        nextButton.setFont(new Font("Segoe UI", Font.BOLD, 16));
        nextButton.setBackground(new Color(183, 183, 47));
        nextButton.setForeground(Color.WHITE);
        paginationPanel.add(nextButton);

        // Add listeners for the pagination buttons
        previousButton.addActionListener(e -> {
            if (currentPage > 0) {
                currentPage--;
                updateTableData();
                pageNumberLabel.setText("Page: " + (currentPage + 1));
            }
        });

        nextButton.addActionListener(e -> {
            currentPage++;
            updateTableData();
            pageNumberLabel.setText("Page: " + (currentPage + 1));
        });
    }

    // Method to create sidebar buttons
    private JButton createSidebarButton(String text, int yPos) {
        JButton button = new JButton(text);
        button.setFont(new Font("Segoe UI", Font.BOLD, 18));
        button.setBackground(new Color(240, 238, 226));
        button.setForeground(new Color(183, 183, 47));
        button.setBounds(0, yPos, 250, 55);
        return button;
    }

    // Method to update table data based on current page
    private void updateTableData() {
        // Simulate the change of data for pagination with blank rows
        Object[][] data = {
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""}
        };

        // Clear the table before updating
        tableModel.setRowCount(0);

        // Calculate the rows to display based on the current page
        int startIndex = currentPage * rowsPerPage;
        int endIndex = Math.min(startIndex + rowsPerPage, data.length);

        // Add the rows for the current page
        for (int i = startIndex; i < endIndex; i++) {
            tableModel.addRow(data[i]);
        }
    }
}
