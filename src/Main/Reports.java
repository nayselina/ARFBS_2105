import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class Reports extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Reports frame = new Reports();
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
    public Reports() {
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

        JButton btnInvoice = new JButton("Billing");
        btnInvoice.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnInvoice.setBounds(0, 227, 251, 58);
        sidebarPanel.add(btnInvoice);

        JButton btnReservation = new JButton("Reservation");
        btnReservation.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnReservation.setBounds(0, 280, 251, 58);
        sidebarPanel.add(btnReservation);

        JButton btnAnalytics = new JButton("Reports");
        btnAnalytics.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnAnalytics.setBounds(0, 335, 251, 58);
        sidebarPanel.add(btnAnalytics);

        JButton btnSettings = new JButton("Settings");
        btnSettings.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnSettings.setBounds(0, 390, 251, 58);
        sidebarPanel.add(btnSettings);

        // Top panel
        JPanel panel = new JPanel();
        panel.setBackground(new Color(183, 183, 47));
        panel.setBounds(0, 0, 1436, 126);
        contentPane.add(panel);
        panel.setLayout(null);

        // Main content area
        JPanel mainContent = new JPanel();
        mainContent.setLayout(new BorderLayout(0, 20));  // Added vertical gap for spacing
        mainContent.setBackground(new Color(247, 247, 231));
        mainContent.setBounds(251, 126, 1189, 626); // Adjusted position and size
        contentPane.add(mainContent);

        // Filters panel with larger font size for labels and dropdown
        JPanel filtersPanel = new JPanel();
        filtersPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        filtersPanel.setBackground(new Color(247, 247, 231));

        JLabel reportTypeLabel = new JLabel("Report Type:");
        reportTypeLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
        JComboBox<String> reportTypeDropdown = new JComboBox<>(new String[]{"Monthly Billing", "Pending Payments"});
        reportTypeDropdown.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        JLabel dateRangeLabel = new JLabel("Date Range:");
        dateRangeLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
        JComboBox<String> dateRangeDropdown = new JComboBox<>(new String[]{"This Month", "Last Month", "Custom Range"});
        dateRangeDropdown.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        filtersPanel.add(reportTypeLabel);
        filtersPanel.add(reportTypeDropdown);
        filtersPanel.add(dateRangeLabel);
        filtersPanel.add(dateRangeDropdown);
        mainContent.add(filtersPanel, BorderLayout.NORTH);

        // Section Title
        JPanel sectionTitlePanel = new JPanel();
        sectionTitlePanel.setBackground(new Color(183, 183, 47));
        sectionTitlePanel.setLayout(null);
        JLabel sectionTitle = new JLabel("REPORT DATA");
        sectionTitle.setBounds(511, 30, 164, 32);
        sectionTitle.setFont(new Font("Segoe UI", Font.BOLD, 24));
        sectionTitle.setForeground(Color.WHITE);
        sectionTitlePanel.add(sectionTitle);
        mainContent.add(sectionTitlePanel, BorderLayout.CENTER);

        // Table panel
        JPanel tablePanel = new JPanel();
        tablePanel.setLayout(new BorderLayout());
        String[] columnNames = {"Tenant Name", "Apartment Number", "Rent Amount", "Payment Status"};
        Object[][] data = {}; // Empty data array
        JTable reportTable = new JTable(new DefaultTableModel(data, columnNames));

        // Adjust font size for table data (cells) to 30px
        reportTable.setFont(new Font("Segoe UI", Font.PLAIN, 30));  // Increased font size for table content

        // Adjust font size for column headers
        JTableHeader header = reportTable.getTableHeader();
        header.setFont(new Font("Segoe UI", Font.BOLD, 30));  // Set font for headers to make them larger and bolder

        // Adjust column widths
        TableColumn column;
        for (int i = 0; i < reportTable.getColumnCount(); i++) {
            column = reportTable.getColumnModel().getColumn(i);
            column.setPreferredWidth(300); // Set width for all columns to better accommodate the text
        }

        // Create scroll pane for table
        JScrollPane scrollPane = new JScrollPane(reportTable);
        tablePanel.add(scrollPane, BorderLayout.CENTER);
        mainContent.add(tablePanel, BorderLayout.SOUTH);
    }
}
