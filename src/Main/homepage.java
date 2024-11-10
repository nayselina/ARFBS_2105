package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class homepage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage frame = new homepage();
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
	public homepage() {
		setTitle("Apartment Rental and Billing System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1440, 752);

		// Content panel setup
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 238, 226));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Left sidebar panel
		JPanel sidebarPanel = new JPanel();
		sidebarPanel.setBackground(new Color(255, 255, 255));
		sidebarPanel.setBounds(0, 124, 251, 785);
		contentPane.add(sidebarPanel);
		sidebarPanel.setLayout(null);

		// Navigation buttons in the sidebar
		JButton btnHomepage = new JButton("Homepage");
		btnHomepage.setFont(new Font("Segoe UI", Font.BOLD, 25));
		btnHomepage.setBounds(0, 58, 251, 58);
		btnHomepage.setBackground(new Color(128, 128, 0));
		btnHomepage.setForeground(new Color(0, 0, 0));
		btnHomepage.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        dispose();
		        homepage homepageFrame = new homepage();
		        homepageFrame.setVisible(true);
		    }
		});
		sidebarPanel.add(btnHomepage);

		JButton btnApartments = new JButton("Apartments");
		btnApartments.setFont(new Font("Segoe UI", Font.BOLD, 25));
		btnApartments.setBounds(0, 114, 251, 58);
		btnApartments.setBackground(new Color(128, 128, 0));
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
		sidebarPanel.add(btnTenants);

		JButton btnBilling = new JButton("Billing");
		btnBilling.setFont(new Font("Segoe UI", Font.BOLD, 25));
		btnBilling.setBounds(0, 226, 251, 58);
		sidebarPanel.add(btnBilling);

		JButton btnReservation = new JButton("Reservations");
    	btnReservation.setFont(new Font("Segoe UI", Font.BOLD, 25));
    	btnReservation.setBounds(0, 283, 251, 58);
    	btnReservation.setBackground(new Color(128, 128, 0));
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
		btnReports.setBounds(0, 340, 251, 58);
		sidebarPanel.add(btnReports);

		JButton btnSettings = new JButton("Settings");
		btnSettings.setFont(new Font("Segoe UI", Font.BOLD, 25));
		btnSettings.setBounds(0, 396, 251, 58);
		sidebarPanel.add(btnSettings);
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(183, 183, 47));
		panel_1.setBounds(0, 0, 1443, 121);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, -16, 209, 162);
		panel_1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\63906\\OneDrive\\Documents\\oop_project\\my_application\\src\\login\\1-removebg-preview.png"));
		
		textField = new JTextField();
		textField.setBounds(513, 50, 512, 33);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(1254, 32, 48, 61);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\63906\\Downloads\\bell.png"));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(1301, 44, 45, 39);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\63906\\Downloads\\user.png"));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(313, 191, 375, 169);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Available Apartments");
		lblNewLabel_3.setBounds(47, 14, 260, 27);
		panel_2.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 20));
		
		JLabel lblNewLabel_3_1 = new JLabel("Occupied");
		lblNewLabel_3_1.setBounds(178, 51, 116, 27);
		panel_2.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Vacant");
		lblNewLabel_3_1_1.setBounds(178, 88, 97, 27);
		panel_2.add(lblNewLabel_3_1_1);
		lblNewLabel_3_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(95, 63, 45, 13);
		panel_2.add(lblNewLabel_4);
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\63906\\Downloads\\minus.png"));
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon("C:\\Users\\63906\\Downloads\\minus.png"));
		lblNewLabel_4_1.setBounds(95, 100, 45, 13);
		panel_2.add(lblNewLabel_4_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(918, 185, 391, 227);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Recent Paid Status");
		lblNewLabel_5.setBounds(29, 26, 195, 27);
		panel_3.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		
		JLabel lblNewLabel_5_1 = new JLabel("This Month");
		lblNewLabel_5_1.setForeground(Color.BLACK);
		lblNewLabel_5_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_5_1.setBounds(401, 26, 195, 27);
		panel_3.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(29, 86, 65, 63);
		panel_3.add(lblNewLabel_6);
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\63906\\Downloads\\pay.png"));
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(29, 176, 99, 75);
		panel_3.add(lblNewLabel_7);
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\63906\\Downloads\\money.png"));
		
		JLabel lblNewLabel_8 = new JLabel("Total Paid");
		lblNewLabel_8.setBounds(1017, 248, 76, 17);
		panel_3.add(lblNewLabel_8);
		lblNewLabel_8.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_8.setForeground(new Color(0, 0, 0));
		
		JLabel lblNewLabel_8_1 = new JLabel("Total unpaid");
		lblNewLabel_8_1.setForeground(Color.BLACK);
		lblNewLabel_8_1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_8_1.setBounds(957, 209, 194, 28);
		panel_3.add(lblNewLabel_8_1);
	}
}
