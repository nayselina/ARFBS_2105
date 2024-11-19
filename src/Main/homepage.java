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
import javax.swing.JComboBox;

public class homepage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField paid;
	private JTextField unpaid;
	private JTextField sunday;
	private JTextField monday;
	private JTextField tuesday;
	private JTextField wednesday;
	private JTextField thursday;
	private JTextField friday;
	private JTextField saturday;

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
		btnHomepage.setBackground(new Color(255, 255, 255));
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
		btnBilling.setBounds(0, 226, 251, 58);
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
		
		JLabel availapartments = new JLabel("Available Apartments");
		availapartments.setBounds(47, 14, 260, 27);
		panel_2.add(availapartments);
		availapartments.setFont(new Font("Segoe UI", Font.BOLD, 20));
		
		JLabel lblNewLabel_3_1 = new JLabel("Occupied");
		lblNewLabel_3_1.setBounds(178, 62, 116, 27);
		panel_2.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Vacant");
		lblNewLabel_3_1_1.setBounds(178, 100, 97, 27);
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
		panel_3.setBounds(892, 191, 391, 227);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel status = new JLabel("Recent Paid Status");
		status.setBounds(29, 26, 195, 27);
		panel_3.add(status);
		status.setFont(new Font("Segoe UI", Font.BOLD, 20));
		status.setForeground(new Color(0, 0, 0));
		
		JLabel lblNewLabel_5_1 = new JLabel("This Month");
		lblNewLabel_5_1.setForeground(Color.BLACK);
		lblNewLabel_5_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_5_1.setBounds(401, 26, 195, 27);
		panel_3.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(29, 75, 65, 63);
		panel_3.add(lblNewLabel_6);
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\63906\\Downloads\\pay.png"));
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(29, 142, 65, 63);
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(259, 34, 98, 21);
		panel_3.add(comboBox);
		
		paid = new JTextField();
		paid.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		paid.setText("Total paid");
		paid.setBounds(80, 93, 98, 27);
		panel_3.add(paid);
		paid.setColumns(10);
		
		unpaid = new JTextField();
		unpaid.setText("Total unpaid");
		unpaid.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		unpaid.setColumns(10);
		unpaid.setBounds(80, 156, 98, 27);
		panel_3.add(unpaid);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(323, 445, 474, 260);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(306, 39, 128, 21);
		panel.add(comboBox_1);
		
		sunday = new JTextField();
		sunday.setFont(new Font("Segoe UI", Font.BOLD, 15));
		sunday.setText(" SUN");
		sunday.setBounds(41, 88, 39, 19);
		panel.add(sunday);
		sunday.setColumns(10);
		
		monday = new JTextField();
		monday.setText(" MON");
		monday.setFont(new Font("Segoe UI", Font.BOLD, 15));
		monday.setColumns(10);
		monday.setBounds(90, 88, 45, 19);
		panel.add(monday);
		
		tuesday = new JTextField();
		tuesday.setText(" TUE");
		tuesday.setFont(new Font("Segoe UI", Font.BOLD, 15));
		tuesday.setColumns(10);
		tuesday.setBounds(145, 88, 45, 19);
		panel.add(tuesday);
		
		wednesday = new JTextField();
		wednesday.setText(" WED");
		wednesday.setFont(new Font("Segoe UI", Font.BOLD, 15));
		wednesday.setColumns(10);
		wednesday.setBounds(200, 88, 45, 19);
		panel.add(wednesday);
		
		thursday = new JTextField();
		thursday.setText(" THU");
		thursday.setFont(new Font("Segoe UI", Font.BOLD, 15));
		thursday.setColumns(10);
		thursday.setBounds(255, 88, 45, 19);
		panel.add(thursday);
		
		friday = new JTextField();
		friday.setText(" FRI");
		friday.setFont(new Font("Segoe UI", Font.BOLD, 15));
		friday.setColumns(10);
		friday.setBounds(319, 88, 45, 19);
		panel.add(friday);
		
		saturday = new JTextField();
		saturday.setBounds(374, 88, 45, 19);
		panel.add(saturday);
		saturday.setText(" SAT");
		saturday.setFont(new Font("Segoe UI", Font.BOLD, 15));
		saturday.setColumns(10);
		
		JLabel calendar = new JLabel("  CALENDAR");
		calendar.setForeground(Color.BLACK);
		calendar.setFont(new Font("Segoe UI", Font.BOLD, 20));
		calendar.setBounds(27, 33, 195, 27);
		panel.add(calendar);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(937, 482, 444, 210);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_5_2 = new JLabel("  Record of Payment");
		lblNewLabel_5_2.setForeground(Color.BLACK);
		lblNewLabel_5_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_5_2.setBounds(21, 22, 195, 27);
		panel_4.add(lblNewLabel_5_2);
	}
}