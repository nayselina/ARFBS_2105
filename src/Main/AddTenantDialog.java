package Main;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.SystemColor;

public class AddTenantDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtLname;
	private JTextField txtFname;
	private JTextField txtContactNo;
	private JTextField txtEmail;
	private JTextField txtUnit;
	private JTextField txtOccupants;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddTenantDialog dialog = new AddTenantDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddTenantDialog() {
		setBounds(100, 100, 466, 750);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null); // Center the window
		
		
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel headerPanel = new JPanel();
		headerPanel.setBackground(new Color(183, 183, 47));
		headerPanel.setBounds(0, 0, 450, 26);
		contentPanel.add(headerPanel);
		headerPanel.setLayout(null);
		
		JLabel lblAptmanagerByAvahome_1 = new JLabel("AptManager");
        lblAptmanagerByAvahome_1.setForeground(Color.WHITE);
        lblAptmanagerByAvahome_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        lblAptmanagerByAvahome_1.setBounds(184, 4, 77, 18);
        headerPanel.add(lblAptmanagerByAvahome_1);
        
        	JPanel mainPanel = new JPanel();
        	mainPanel.setBackground(new Color(240, 238, 226));
        	mainPanel.setBounds(0, 85, 450, 593);
        	contentPanel.add(mainPanel);
        	mainPanel.setLayout(null);
        	
        	JLabel lblFname = new JLabel("First Name:");
        	lblFname.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        	lblFname.setBounds(34, 30, 69, 19);
        	mainPanel.add(lblFname);
        	
        	txtLname = new JTextField();
        	txtLname.setBounds(183, 80, 215, 26);
        	mainPanel.add(txtLname);
        	txtLname.setColumns(10);
        	
        	txtFname = new JTextField();
        	txtFname.setColumns(10);
        	txtFname.setBounds(183, 30, 215, 26);
        	mainPanel.add(txtFname);
        	
        	JLabel lblLname = new JLabel("Last Name:");
        	lblLname.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        	lblLname.setBounds(34, 80, 69, 19);
        	mainPanel.add(lblLname);
        	
        	txtContactNo = new JTextField();
        	txtContactNo.setColumns(10);
        	txtContactNo.setBounds(183, 142, 215, 26);
        	mainPanel.add(txtContactNo);
        	
        	txtEmail = new JTextField();
        	txtEmail.setColumns(10);
        	txtEmail.setBounds(183, 188, 215, 26);
        	mainPanel.add(txtEmail);
        	
        	txtUnit = new JTextField();
        	txtUnit.setColumns(10);
        	txtUnit.setBounds(183, 240, 215, 26);
        	mainPanel.add(txtUnit);
        	
        	JTextArea txtAreaAdditional = new JTextArea();
        	txtAreaAdditional.setBounds(183, 334, 215, 94);
        	mainPanel.add(txtAreaAdditional);
        	
        	txtOccupants = new JTextField();
        	txtOccupants.setColumns(10);
        	txtOccupants.setBounds(183, 288, 215, 26);
        	mainPanel.add(txtOccupants);
        	
        	JLabel lblContact = new JLabel("Contact No.");
        	lblContact.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        	lblContact.setBounds(34, 132, 79, 19);
        	mainPanel.add(lblContact);
        	
        	JLabel lblEmail = new JLabel("Email:");
        	lblEmail.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        	lblEmail.setBounds(34, 188, 69, 19);
        	mainPanel.add(lblEmail);
        	
        	JLabel lblUnitCode = new JLabel("Unit Code:");
        	lblUnitCode.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        	lblUnitCode.setBounds(34, 240, 69, 19);
        	mainPanel.add(lblUnitCode);
        	
        	JLabel lblOccupants = new JLabel("No. Of Occupants:");
        	lblOccupants.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        	lblOccupants.setBounds(34, 288, 119, 19);
        	mainPanel.add(lblOccupants);
        	
        	JLabel lblAdditional = new JLabel("Additional Info:");
        	lblAdditional.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        	lblAdditional.setBounds(34, 339, 109, 19);
        	mainPanel.add(lblAdditional);
        	
        	JDateChooser dateRentedChooser = new JDateChooser();
            dateRentedChooser.setBounds(183, 457, 215, 26);
            mainPanel.add(dateRentedChooser);
            
            // Replace textField_7 (Rent End) with JDateChooser
            JDateChooser rentEndChooser = new JDateChooser();
            rentEndChooser.setBounds(183, 509, 215, 26);
            mainPanel.add(rentEndChooser);
        	
        	JLabel lblDateRented = new JLabel("Date Rented:");
        	lblDateRented.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        	lblDateRented.setBounds(34, 457, 109, 19);
        	mainPanel.add(lblDateRented);
        	
        	JLabel lblRentEnd = new JLabel("Rent End:");
        	lblRentEnd.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        	lblRentEnd.setBounds(34, 509, 109, 19);
        	mainPanel.add(lblRentEnd);
        
        
        JLabel lblAddTenant = new JLabel("ADD TENANT");
        lblAddTenant.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        lblAddTenant.setBounds(14, 37, 167, 35);
        contentPanel.add(lblAddTenant);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.WHITE);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
