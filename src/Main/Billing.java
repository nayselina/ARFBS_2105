package Main;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;

import javax.swing.JScrollPane;

import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import com.toedter.calendar.JDateChooser;  // Import JDateChooser
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import model.BillingModel;

public class Billing extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;

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
        billingPanel.setBounds(285, 184, 400, 430); // Position on the left side
        billingPanel.setBackground(new Color(255, 255, 255)); // White background color
        billingPanel.setBorder(BorderFactory.createTitledBorder("Billing Details")); // Change border title
        contentPane.add(billingPanel);

        // Add form fields for Billing Information (Right-aligned)
        JLabel lblBillingID = new JLabel("Billing ID:");
        lblBillingID.setBounds(6, 18, 189, 49);
        lblBillingID.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        JTextField txtBillingID = new JTextField();
        txtBillingID.setBounds(205, 18, 189, 49);
        txtBillingID.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        billingPanel.setLayout(null);
        billingPanel.add(lblBillingID);
        billingPanel.add(txtBillingID);

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(6, 77, 189, 49);
        lblName.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        JTextField txtName = new JTextField();
        txtName.setBounds(205, 77, 189, 49);
        txtName.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        billingPanel.add(lblName);
        billingPanel.add(txtName);

        JLabel lblDate = new JLabel("Billing Date:");
        lblDate.setBounds(6, 136, 189, 49);
        lblDate.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        billingPanel.add(lblDate);
        
     /* JTextField txtDate = new JTextField();
        txtDate.setBounds(205, 136, 189, 49);
        txtDate.setFont(new Font("Segoe UI", Font.PLAIN, 18));  
        billingPanel.add(txtDate);*/
        
        JDateChooser billingDateChooser = new JDateChooser();  // Create a JDateChooser for Billing Date
        billingDateChooser.setBounds(205, 136, 189, 49);  // Set the bounds
        billingDateChooser.setFont(new Font("Segoe UI", Font.PLAIN, 16));  // Set font
        billingPanel.add(billingDateChooser);
        
        
     
       

        JLabel lblAmount = new JLabel("Amount:");
        lblAmount.setBounds(6, 195, 189, 49);
        lblAmount.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        JTextField txtAmount = new JTextField();
        txtAmount.setBounds(205, 195, 189, 49);
        txtAmount.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        billingPanel.add(lblAmount);
        billingPanel.add(txtAmount);

        JLabel lblDueDate = new JLabel("Due Date:");
        lblDueDate.setBounds(6, 254, 189, 49);
        lblDueDate.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        billingPanel.add(lblDueDate);
        
        JDateChooser dueDateChooser = new JDateChooser();
        dueDateChooser.setBounds(205, 254, 189, 49);
        dueDateChooser.setFont(new Font("Segoe UI", Font.PLAIN, 16));;
        billingPanel.add(dueDateChooser);
        
    /*    JTextField txtDueDate = new JTextField();
        txtDueDate.setBounds(205, 254, 189, 49);
        txtDueDate.setFont(new Font("Segoe UI", Font.PLAIN, 18));;
        billingPanel.add(txtDueDate);    */

        JLabel lblStatus = new JLabel("Status:");
        lblStatus.setBounds(6, 313, 189, 49);
        lblStatus.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        billingPanel.add(lblStatus);
        
        JComboBox comboBoxStatus = new JComboBox();
        comboBoxStatus.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        comboBoxStatus.setModel(new DefaultComboBoxModel(new String[] {"", "Paid", "Unpaid", "Partially Paid"}));
        comboBoxStatus.setBounds(205, 313, 189, 49);
        billingPanel.add(comboBoxStatus);
        JLabel label = new JLabel();
        label.setBounds(6, 372, 189, 49);
        billingPanel.add(label);
        
        
        
        JButton btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String strBillingID = txtBillingID.getText();
        		String name = txtName.getText();
        		String strAmount = txtAmount.getText();
                String status = comboBoxStatus.getSelectedItem().toString();


                Date billingDate = billingDateChooser.getDate();
                String strBillingDate = null;

                if (billingDate != null) {
                    // Format the date to yyyy-MM-dd
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    strBillingDate = sdf.format(billingDate);  // Converts the Date object to a string in the desired format
                }
                
                Date dueDate = dueDateChooser.getDate();
                String strDueDate = null;

                if (dueDate != null) {
                    // Format the date to yyyy-MM-dd
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    strDueDate = sdf.format(dueDate);  // Converts the Date object to a string in the desired format
                }
                
                DatabaseConnection logic = new DatabaseConnection();
                String result = logic.saveUserData(strBillingID, name, strBillingDate, strAmount, strDueDate, status);  // Pass the birthday

                // Display success or error message based on result
                if (result.equals("Billing details saved successfully.")) {
                    JOptionPane.showMessageDialog(Billing.this,
                            result,  // Success message
                            "Success", JOptionPane.INFORMATION_MESSAGE); // Show as Information
                } else {
                    JOptionPane.showMessageDialog(Billing.this,
                            result,  // Error or failure message
                            "Error", JOptionPane.ERROR_MESSAGE);  // Show as Error
                }

          
            }
        });
        btnSubmit.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        btnSubmit.setBounds(284, 385, 110, 36);
        billingPanel.add(btnSubmit);
        

        // Main panel for the table and title
        JPanel tablePanel = new JPanel();
        tablePanel.setBackground(new Color(255, 255, 255)); // White background for the main content panel
        tablePanel.setBounds(714, 190, 636, 426); // Position on the right side (smaller width)
        contentPane.add(tablePanel);
        tablePanel.setLayout(null);

        // Add the icon next to the table title
        ImageIcon icon = new ImageIcon("resources/icon.png"); // Path to your icon file
        JLabel tableTitleLabel = new JLabel("Table Billing Information", icon, SwingConstants.CENTER);
        tableTitleLabel.setBounds(209, 0, 233, 42);
        tablePanel.add(tableTitleLabel);
        tableTitleLabel.setFont(new Font("Segoe UI", Font.BOLD, 16)); // Set the font to Segoe UI
        tableTitleLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 51, 636, 375);
        tablePanel.add(scrollPane);
        
        table = new JTable();
        table.setModel(new DefaultTableModel(
        	new Object[][] {},
        	new String[] {
        		"Billing ID", "Name", "Billing Date", "Amount", "Due Date", "Status"
        	}
        ));
        scrollPane.setViewportView(table);
        
        JButton btnRefresh = new JButton("REFRESH\r\n");
        btnRefresh.setBackground(new Color(183, 183, 47));
        btnRefresh.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		loadBillingData();
        	}
        });
        btnRefresh.setBounds(537, 8, 89, 32);
        tablePanel.add(btnRefresh);
  

        // Add the pagination buttons with small size at bottom right
        JPanel paginationPanel = new JPanel();
        paginationPanel.setBackground(new Color(255, 255, 255));
        paginationPanel.setBounds(714, 635, 636, 60); // Adjust the position at the bottom
        paginationPanel.setLayout(new FlowLayout(FlowLayout.RIGHT)); // Align to the right
        contentPane.add(paginationPanel);
        
        

        // Set small button size and font size
        JButton btnPrevious = new JButton("Previous");
        btnPrevious.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
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
        
        loadBillingData();
        
    }
    
    private void loadBillingData() {
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        List<BillingModel> billingList = dbConnection.getBillingData();
        
        // Create a model for the table
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        model.setRowCount(0);
        
        // Add student data to the table
        for (BillingModel billing : billingList) {
            model.addRow(new Object[] {
                billing.getBillingID(),
                billing.getName(),
                billing.getBillingDate(),
                billing.getAmount(),
                billing.getDueDate(),
                billing.getStatus()
            });
        }
    }   
}
