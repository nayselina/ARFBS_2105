package Main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class Tenants extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tenants frame = new Tenants();
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
	public Tenants() {
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

		// Panel at the top
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(183, 183, 47));
		panel_1.setBounds(0, 0, 1443, 121);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, -16, 209, 162);
		panel_1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\63906\\OneDrive\\Documents\\oop_project\\my_application\\src\\login\\1-removebg-preview.png"));

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(1254, 32, 48, 61);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\63906\\Downloads\\bell.png"));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(1301, 44, 45, 39);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\63906\\Downloads\\user.png"));
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(309, 173, 1065, 517);
		contentPane.add(panel_3);
		
		JLabel lblOverview = new JLabel("Overview");
		lblOverview.setHorizontalAlignment(SwingConstants.CENTER);
		lblOverview.setForeground(Color.BLACK);
		lblOverview.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblOverview.setBounds(10, 11, 130, 30);
		panel_3.add(lblOverview);
		
		JLabel lblId = new JLabel("ID");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setForeground(Color.BLACK);
		lblId.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblId.setBounds(68, 78, 80, 20);
		panel_3.add(lblId);
		
		JLabel lblName = new JLabel("Name");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setForeground(Color.BLACK);
		lblName.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblName.setBounds(196, 73, 130, 30);
		panel_3.add(lblName);
		
		JLabel lblContactNumber = new JLabel("Contact number");
		lblContactNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblContactNumber.setForeground(Color.BLACK);
		lblContactNumber.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblContactNumber.setBounds(390, 73, 152, 30);
		panel_3.add(lblContactNumber);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblEmail.setBounds(595, 73, 130, 30);
		panel_3.add(lblEmail);
		
		JLabel lblUnit = new JLabel("Unit");
		lblUnit.setHorizontalAlignment(SwingConstants.CENTER);
		lblUnit.setForeground(Color.BLACK);
		lblUnit.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblUnit.setBounds(735, 73, 130, 30);
		panel_3.add(lblUnit);
		
		JLabel lblOthers = new JLabel("Others");
		lblOthers.setHorizontalAlignment(SwingConstants.CENTER);
		lblOthers.setForeground(Color.BLACK);
		lblOthers.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblOthers.setBounds(875, 73, 130, 30);
		panel_3.add(lblOthers);
	}
}