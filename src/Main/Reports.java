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
    private JTextField tenantNameField, apartmentField, rentAmountField;
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
        JPanel sidebarPanel = new JPanel(); // Renamed to 'sidebarPanel' to avoid class name conflict
        sidebarPanel.setBackground(new Color(255, 255, 255)); // White background color
        sidebarPanel.setBounds(0, 124, 251, 600); // Adjusted height to fit content
        sidebarPanel.setLayout(null);
        contentPane.add(sidebarPanel);

        // Buttons in the sidebar
        JButton btnHomepage = new JButton("Homepage");
        btnHomepage.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnHomepage.setBounds(0, 58, 251, 58);
        sidebarPanel.add(btnHomepage);

        JButton btnApartment = new JButton("Apartment");
        btnApartment.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnApartment.setBounds(0, 114, 251, 58);
        sidebarPanel.add(btnApartment);

        JButton btnTenants = new JButton("Tenants");
        btnTenants.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnTenants.setBounds(0, 171, 251, 58);
        sidebarPanel.add(btnTenants);

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
        ImageIcon logoIcon = new ImageIcon("src/images/logo.png"); // Adjust the path as necessary
        logoLabel.setIcon(logoIcon);
        logoLabel.setBounds(1050, 10, 100, 100);
        headerPanel.add(logoLabel);

        // Filters Panel
        JPanel filtersPanel = new JPanel();
        filtersPanel.setBounds(260, 140, 1150, 63);
        filtersPanel.setBackground(new Color(247, 247, 231));
        filtersPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        contentPane.add(filtersPanel);

        JLabel filterTitle = new JLabel("Filter By:");
        filterTitle.setFont(new Font("Segoe UI", Font.BOLD, 18));
        filtersPanel.add(filterTitle);

        JLabel tenantLabel = new JLabel("Tenant Name:");
        tenantLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        filtersPanel.add(tenantLabel);

        tenantNameField = new JTextField();
        tenantNameField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        tenantNameField.setColumns(15);
        filtersPanel.add(tenantNameField);

        JLabel apartmentLabel = new JLabel("Apartment No:");
        apartmentLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        filtersPanel.add(apartmentLabel);

        apartmentField = new JTextField();
        apartmentField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        apartmentField.setColumns(10);
        filtersPanel.add(apartmentField);

        JLabel paymentStatusLabel = new JLabel("Payment Status:");
        paymentStatusLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        filtersPanel.add(paymentStatusLabel);

        paymentStatusDropdown = new JComboBox<>(new String[]{"All", "Paid", "Pending"});
        paymentStatusDropdown.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        filtersPanel.add(paymentStatusDropdown);

        JButton btnGenerate = new JButton("Filter");
        btnGenerate.setFont(new Font("Segoe UI", Font.BOLD, 16));
        btnGenerate.setBackground(new Color(183, 183, 47));
        btnGenerate.setForeground(Color.WHITE);
        filtersPanel.add(btnGenerate);

        // Input Fields Panel (Above the table)
        JPanel inputFieldsPanel = new JPanel();
        inputFieldsPanel.setBounds(260, 200, 1000, 120); // Positioned above the table
        inputFieldsPanel.setBackground(new Color(247, 247, 231));
        inputFieldsPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        contentPane.add(inputFieldsPanel);

        JLabel tenantNameLabel = new JLabel("Tenant Name:");
        tenantNameLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        inputFieldsPanel.add(tenantNameLabel);

        tenantNameField = new JTextField();
        tenantNameField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        tenantNameField.setColumns(15);
        inputFieldsPanel.add(tenantNameField);

        JLabel apartmentNumberLabel = new JLabel("Apartment No:");
        apartmentNumberLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        inputFieldsPanel.add(apartmentNumberLabel);

        apartmentField = new JTextField();
        apartmentField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        apartmentField.setColumns(10);
        inputFieldsPanel.add(apartmentField);

        JLabel rentAmountLabel = new JLabel("Rent Amount:");
        rentAmountLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        inputFieldsPanel.add(rentAmountLabel);

        rentAmountField = new JTextField();
        rentAmountField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        rentAmountField.setColumns(10);
        inputFieldsPanel.add(rentAmountField);

        JLabel paymentStatusLabelAbove = new JLabel("Payment Status:");
        paymentStatusLabelAbove.setFont(new Font("Segoe UI", Font.BOLD, 16));
        inputFieldsPanel.add(paymentStatusLabelAbove);

        paymentStatusDropdown = new JComboBox<>(new String[]{"Paid", "Unpaid", "Overdue"});
        paymentStatusDropdown.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        inputFieldsPanel.add(paymentStatusDropdown);

        // Table Panel
        JPanel tablePanel = new JPanel();
        tablePanel.setBounds(260, 330, 1000, 300); // Positioned below the input fields panel
        tablePanel.setBackground(Color.WHITE);
        tablePanel.setLayout(new BorderLayout());
        tablePanel.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
        contentPane.add(tablePanel);

        String[] columnNames = {"Tenant Name", "Apartment Number", "Rent Amount", "Payment Status"};
        Object[][] data = new Object[10][4]; // Adjust as necessary

        tableModel = new DefaultTableModel(data, columnNames);
        JTable reportTable = new JTable(tableModel);
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

        // Pagination Controls Panel
        JPanel paginationPanel = new JPanel();
        paginationPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 5));
        paginationPanel.setBounds(260, 630, 1000, 40);
        paginationPanel.setBackground(Color.WHITE);
        contentPane.add(paginationPanel);

        JButton btnPrevious = new JButton("Previous");
        btnPrevious.addActionListener(e -> {
            if (currentPage > 0) {
                currentPage--;
                updateTableData();
            }
        });
        btnPrevious.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        btnPrevious.setBackground(new Color(183, 183, 47));
        btnPrevious.setForeground(Color.WHITE);
        paginationPanel.add(btnPrevious);

        // Page numbers
        JButton btnPage1 = new JButton("1");
        btnPage1.addActionListener(e -> {
            currentPage = 0;
            updateTableData();
        });
        btnPage1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        btnPage1.setBackground(new Color(183, 183, 47));
        btnPage1.setForeground(Color.WHITE);
        paginationPanel.add(btnPage1);

        JButton btnPage2 = new JButton("2");
        btnPage2.addActionListener(e -> {
            currentPage = 1;
            updateTableData();
        });
        btnPage2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        btnPage2.setBackground(new Color(183, 183, 47));
        btnPage2.setForeground(Color.WHITE);
        paginationPanel.add(btnPage2);

        JButton btnNext = new JButton("Next");
        btnNext.addActionListener(e -> {
            currentPage++;
            updateTableData();
        });
        btnNext.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        btnNext.setBackground(new Color(183, 183, 47));
        btnNext.setForeground(Color.WHITE);
        paginationPanel.add(btnNext);
    }

    private void updateTableData() {
        // Implement table data update logic here
    }
}
