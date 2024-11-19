package Main;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.JTableHeader;

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
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 255, 255));
        panel_1.setBounds(0, 124, 251, 785);
        contentPane.add(panel_1);
        panel_1.setLayout(null);
        
        // Sidebar buttons
        JButton btnHomepage = new JButton("Homepage");
        btnHomepage.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnHomepage.setBounds(0, 58, 251, 58);
        panel_1.add(btnHomepage);
        
        JButton btnApartment = new JButton("Apartment");
        btnApartment.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnApartment.setBounds(0, 114, 251, 58);
        panel_1.add(btnApartment);
        
        JButton btnTenants = new JButton("Tenants");
        btnTenants.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnTenants.setBounds(0, 171, 251, 58);
        panel_1.add(btnTenants);
        
        JButton btnBilling = new JButton("Billing");
        btnBilling.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnBilling.setBounds(0, 227, 251, 58);
        panel_1.add(btnBilling);
        
        JButton btnReservation = new JButton("Reservation");
        btnReservation.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnReservation.setBounds(0, 280, 251, 58);
        panel_1.add(btnReservation);
        
        JButton btnReports = new JButton("Reports");
        btnReports.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnReports.setBounds(0, 335, 251, 58);
        panel_1.add(btnReports);
        
        JButton btnSettings = new JButton("Settings");
        btnSettings.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnSettings.setBounds(0, 390, 251, 58);
        panel_1.add(btnSettings);
        
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
        JLabel titleLabel = new JLabel("Overview", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 16)); // Set the font to Segoe UI
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0)); // Add padding to the label
        tablePanel.add(titleLabel, BorderLayout.NORTH);

        // Column names for the table
        String[] columnNames = {"ID", "Name", "Date", "Amount", "Due Date", "Status"};

        // Empty data for the table (all fields are blank)
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
