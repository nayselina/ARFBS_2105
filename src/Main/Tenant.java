package Main;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
        setSize(1440, 752);
        setLocationRelativeTo(null);

        // Main Content Panel
        contentPane = new JPanel();
        contentPane.setBackground(new Color(240, 238, 226));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
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

        // Changed variable name from btnTenants to Tenants
        JButton Tenants = new JButton("Tenants");
        Tenants.setFont(new Font("Segoe UI", Font.BOLD, 25));
        Tenants.setBounds(0, 171, 251, 58);
        sidebarPanel.add(Tenants);

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
        headerPanel.setBounds(0, 0, 1450, 122);
        headerPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 40));
        contentPane.add(headerPanel);

        // Table Panel (Smaller Table on the Right)
        JPanel tablePanel = new JPanel(new BorderLayout());
        tablePanel.setBounds(800, 134, 580, 580); // Reduced width and positioned on the right side
        tablePanel.setBackground(new Color(255, 255, 255));
        tablePanel.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 2, true)); // Rounded border
        contentPane.add(tablePanel);

        JLabel titleLabel = new JLabel("  🏠 Tenant Information", SwingConstants.LEFT);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 28));
        titleLabel.setForeground(new Color(64, 64, 64));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 0));
        tablePanel.add(titleLabel, BorderLayout.NORTH);

        // Table Data
        String[] columnNames = {"ID", "Name", "Contact Number", "Email", "Unit", "Other Info"};
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
            {"", "", "", "", "", ""}
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);

        // Table Style
        table.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        table.setRowHeight(40);
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
        table.setSelectionBackground(new Color(255, 230, 150));
        table.setSelectionForeground(Color.BLACK);

        // Alternating Row Colors
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (!isSelected) {
                    c.setBackground(row % 2 == 0 ? new Color(245, 245, 245) : Color.WHITE);
                }
                setHorizontalAlignment(SwingConstants.CENTER); // Center align text
                return c;
            }
        });

        // Table Header Style
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("Segoe UI", Font.BOLD, 20));
        header.setBackground(new Color(64, 64, 64));
        header.setForeground(Color.WHITE);
        header.setReorderingAllowed(false);

        // Scroll Pane
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        tablePanel.add(scrollPane, BorderLayout.CENTER);

        // Pagination Panel (for Previous, 1, 2, Next)
        JPanel paginationPanel = new JPanel();
        paginationPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 10));
        paginationPanel.setBackground(new Color(255, 255, 255));
        paginationPanel.setPreferredSize(new Dimension(120, 60));

        JButton btnPrevious = new JButton("Previous");
        btnPrevious.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnPrevious.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        btnPrevious.setBackground(new Color(183, 183, 47));
        btnPrevious.setForeground(Color.WHITE);
        paginationPanel.add(btnPrevious);

        JButton btnPage1 = new JButton("1");
        btnPage1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        btnPage1.setBackground(new Color(183, 183, 47));
        btnPage1.setForeground(Color.WHITE);
        paginationPanel.add(btnPage1);

        JButton btnPage2 = new JButton("2");
        btnPage2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        btnPage2.setBackground(new Color(183, 183, 47));
        btnPage2.setForeground(Color.WHITE);
        paginationPanel.add(btnPage2);

        JButton btnNext = new JButton("Next");
        btnNext.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        btnNext.setBackground(new Color(183, 183, 47));
        btnNext.setForeground(Color.WHITE);
        paginationPanel.add(btnNext);

        // Add pagination panel next to the table
        tablePanel.add(paginationPanel, BorderLayout.SOUTH);

        // Form Panel for Tenant Details
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(7, 2, 10, 10)); // 7 rows, 2 columns, spacing of 10px
        formPanel.setBounds(260, 134, 500, 580); // Adjusted position and width of the form
        formPanel.setBackground(new Color(255, 255, 255)); // White background color
        formPanel.setBorder(BorderFactory.createTitledBorder("Tenant Details")); // Add a border with a title
        contentPane.add(formPanel);

        // Add form fields
        JLabel lblID = new JLabel("SEARCH ID:");
        lblID.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        JTextField txtID = new JTextField();
        txtID.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        formPanel.add(lblID);
        formPanel.add(txtID);

        JLabel lblName = new JLabel("Name:");
        lblName.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        JTextField txtName = new JTextField();
        txtName.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        formPanel.add(lblName);
        formPanel.add(txtName);

        JLabel lblContact = new JLabel("Contact Number:");
        lblContact.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        JTextField txtContact = new JTextField();
        txtContact.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        formPanel.add(lblContact);
        formPanel.add(txtContact);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        JTextField txtEmail = new JTextField();
        txtEmail.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        formPanel.add(lblEmail);
        formPanel.add(txtEmail);

        JLabel lblUnit = new JLabel("Unit:");
        lblUnit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        JTextField txtUnit = new JTextField();
        txtUnit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        formPanel.add(lblUnit);
        formPanel.add(txtUnit);

        JLabel lblOtherInfo = new JLabel("Other Info:");
        lblOtherInfo.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        JTextField txtOtherInfo = new JTextField();
        txtOtherInfo.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        formPanel.add(lblOtherInfo);
        formPanel.add(txtOtherInfo);

        // Add Save Button
        JButton btnSave = new JButton("Save");
        btnSave.setFont(new Font("Segoe UI", Font.BOLD, 18));
        btnSave.setBackground(new Color(183, 183, 47));
        btnSave.setForeground(Color.WHITE);
        formPanel.add(new JLabel()); // Placeholder to center the button
        formPanel.add(btnSave);
    }
}
