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
        JButton btnDashboard = new JButton("Homepage");
        btnDashboard.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnDashboard.setBounds(0, 58, 251, 58);
        btnDashboard.setBackground(new Color(255, 255, 255));
        btnDashboard.setForeground(new Color(0, 0, 0));
        btnDashboard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                homepage homepageFrame = new homepage();
                homepageFrame.setVisible(true);
            }
        });
        sidebarPanel.add(btnDashboard);

        JButton btnApartments = new JButton("Apartments");
        btnApartments.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnApartments.setBounds(0, 114, 251, 58);
        btnApartments.setBackground(new Color(255, 255, 255));
        btnApartments.setForeground(new Color(0, 0, 0));
        btnApartments.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Apartments apartmentsFrame = new Apartments();
                apartmentsFrame.setVisible(true);
            }
        });
        sidebarPanel.add(btnApartments);

        JButton btnTenants = new JButton("Tenants");
		btnTenants.setFont(new Font("Segoe UI", Font.BOLD, 25));
		btnTenants.setBounds(0, 170, 251, 58);
		btnTenants.setBackground(new Color(255, 255, 255));
		btnTenants.setForeground(new Color(0, 0, 0));
		btnTenants.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        dispose();
		        Tenants tenantsFrame = new Tenants();
		        tenantsFrame.setVisible(true);
		    }
		});
		sidebarPanel.add(btnTenants);

		JButton btnBilling = new JButton("Billing");
		btnBilling.setFont(new Font("Segoe UI", Font.BOLD, 25));
		btnBilling.setBounds(0, 226, 251, 58); // Position on the sidebar
		btnBilling.setBackground(new Color(255, 255, 255)); // White background
		btnBilling.setForeground(new Color(0, 0, 0)); // Black text
		btnBilling.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        dispose(); // Close the current frame
		        Billing billingFrame = new Billing(); // Create an instance of the Billing frame
		        billingFrame.setVisible(true); // Open the Billing frame
		    }
		});
		sidebarPanel.add(btnBilling);


        JButton btnReservation = new JButton("Reservations");
    	btnReservation.setFont(new Font("Segoe UI", Font.BOLD, 25));
    	btnReservation.setBounds(0, 283, 251, 58);
    	btnReservation.setBackground(new Color(255, 255, 255));
    	btnReservation.setForeground(new Color(0, 0, 0));
    	btnReservation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the current Transactions frame
                reservation reservationFrame = new reservation(); // Open the Customers frame
                reservationFrame.setVisible(true); // Set the Customers frame visible
            }
        });
    	sidebarPanel.add(btnReservation);

    	JButton btnReports = new JButton("Reports");
    	btnReports.setFont(new Font("Segoe UI", Font.BOLD, 25));
    	btnReports.setBounds(0, 335, 251, 58); // Adjusting position in the sidebar
    	btnReports.setBackground(new Color(255, 255, 255)); // White background
    	btnReports.setForeground(new Color(0, 0, 0)); // Black text
    	btnReports.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        dispose(); // Close the current frame
    	        Reports reportsFrame = new Reports(); // Create an instance of the Reports frame
    	        reportsFrame.setVisible(true); // Display the Reports frame
    	    }
    	});
    	sidebarPanel.add(btnReports);

    	JButton btnSettings = new JButton("Settings");
        btnSettings.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnSettings.setBounds(0, 390, 251, 58);
        btnSettings.setBackground(new Color(255, 255, 255)); // White background
    	btnSettings.setForeground(new Color(0, 0, 0)); // Black text
    	btnSettings.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        dispose(); // Close the current frame
    	        Settings settingsFrame = new Settings(); // Create an instance of the Reports frame
    	        settingsFrame.setVisible(true); // Display the Reports frame
    	    }
    	});
    	sidebarPanel.add(btnSettings);



        // Header panel
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(183, 183, 47)); // Set header color
        headerPanel.setBounds(0, 0, 1451, 122); // Set position and size for header
        contentPane.add(headerPanel);
        headerPanel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(20, 10, 190, 100);
        ImageIcon logoIcon = new ImageIcon("C:/Users/YOJ/git/2105_ARAFBS/src/images/logo.png"); // Provide the correct path to your logo image
        lblNewLabel.setIcon(logoIcon);
        headerPanel.add(lblNewLabel);

        // Main panel for the table and title
        JPanel tablePanel = new JPanel();
        tablePanel.setBackground(new Color(255, 255, 255)); // White background for the main content panel
        tablePanel.setBounds(314, 176, 1055, 469); // Set position and size for the table panel
        contentPane.add(tablePanel);
        tablePanel.setLayout(null);

        // Title label for the table section
        JLabel titleLabel = new JLabel("Overview", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 16)); // Set the font to Segoe UI
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0)); // Add padding to the label
        titleLabel.setBounds(0, 11, 1055, 40); // Set position and size for title label
        tablePanel.add(titleLabel);

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
        scrollPane.setBounds(10, 40, 1035, 380); // Set position and size for the scroll pane
        tablePanel.add(scrollPane);

        // Add a "Refresh" button to reload the data
        JButton btnRefresh = new JButton("Refresh");
        btnRefresh.setFont(new Font("Segoe UI", Font.BOLD, 18));
        btnRefresh.setBounds(10, 430, 150, 40);
        btnRefresh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code to refresh or reload the data (currently just a placeholder)
                System.out.println("Data refreshed");
            }
        });
        tablePanel.add(btnRefresh);
    }

    // Method to create a button in the sidebar
    private void createSidebarButton(JPanel panel, String text, int yPos) {
        JButton button = new JButton(text);
        button.setFont(new Font("Segoe UI", Font.BOLD, 25));
        button.setBounds(0, yPos, 251, 58);
        panel.add(button);
    }
}
