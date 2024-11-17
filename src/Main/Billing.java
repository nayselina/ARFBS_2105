package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;

public class Billing extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtOverview;
	private JTextField txtId;
	private JTextField txtName;
	private JTextField txtDate;
	private JTextField txtAmount;
	private JTextField txtDueDate;
	private JTextField txtStatus;

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
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(183, 183, 47));
		panel.setBounds(3, 0, 1440, 122);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 124, 251, 785);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Homepage");
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 25));
		btnNewButton.setBounds(0, 58, 251, 58);
		panel_1.add(btnNewButton);
		
		JButton btnApartment = new JButton("Apartment");
		btnApartment.setFont(new Font("Segoe UI", Font.BOLD, 25));
		btnApartment.setBounds(0, 114, 251, 58);
		panel_1.add(btnApartment);
		
		JButton btnNewButton_1 = new JButton("Tenants");
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		btnNewButton_1.setBounds(0, 171, 251, 58);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Billing");
		btnNewButton_2.setFont(new Font("Segoe UI", Font.BOLD, 25));
		btnNewButton_2.setBounds(0, 227, 251, 58);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Reservation");
		btnNewButton_3.setFont(new Font("Segoe UI", Font.BOLD, 25));
		btnNewButton_3.setBounds(0, 280, 251, 58);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Reports");
		btnNewButton_4.setFont(new Font("Segoe UI", Font.BOLD, 25));
		btnNewButton_4.setBounds(0, 335, 251, 58);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Settings");
		btnNewButton_5.setFont(new Font("Segoe UI", Font.BOLD, 25));
		btnNewButton_5.setBounds(0, 390, 251, 58);
		panel_1.add(btnNewButton_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(333, 186, 1055, 469);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		txtOverview = new JTextField();
		txtOverview.setFont(new Font("Segoe UI", Font.BOLD, 18));
		txtOverview.setText("  Overview");
		txtOverview.setBounds(38, 30, 115, 31);
		panel_2.add(txtOverview);
		txtOverview.setColumns(10);
		
		txtId = new JTextField();
		txtId.setText("  ID");
		txtId.setFont(new Font("Segoe UI", Font.BOLD, 18));
		txtId.setColumns(10);
		txtId.setBounds(62, 97, 51, 31);
		panel_2.add(txtId);
		
		txtName = new JTextField();
		txtName.setText(" Name");
		txtName.setFont(new Font("Segoe UI", Font.BOLD, 18));
		txtName.setColumns(10);
		txtName.setBounds(204, 97, 68, 31);
		panel_2.add(txtName);
		
		txtDate = new JTextField();
		txtDate.setText("  Date");
		txtDate.setFont(new Font("Segoe UI", Font.BOLD, 18));
		txtDate.setColumns(10);
		txtDate.setBounds(368, 97, 68, 31);
		panel_2.add(txtDate);
		
		txtAmount = new JTextField();
		txtAmount.setText(" Amount");
		txtAmount.setFont(new Font("Segoe UI", Font.BOLD, 18));
		txtAmount.setColumns(10);
		txtAmount.setBounds(532, 97, 90, 31);
		panel_2.add(txtAmount);
		
		txtDueDate = new JTextField();
		txtDueDate.setText(" Due Date");
		txtDueDate.setFont(new Font("Segoe UI", Font.BOLD, 18));
		txtDueDate.setColumns(10);
		txtDueDate.setBounds(704, 97, 98, 31);
		panel_2.add(txtDueDate);
		
		txtStatus = new JTextField();
		txtStatus.setText(" Status");
		txtStatus.setFont(new Font("Segoe UI", Font.BOLD, 18));
		txtStatus.setColumns(10);
		txtStatus.setBounds(894, 97, 68, 31);
		panel_2.add(txtStatus);
	}
}
