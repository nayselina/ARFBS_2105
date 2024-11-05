package Main;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField usernameField;
    private JPasswordField passwordField;

    // Dummy credentials for demonstration
    private final String DUMMY_USERNAME = "user";
    private final String DUMMY_PASSWORD = "pass";

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main frame = new Main();
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
    public Main() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setSize(1367, 768);

        // Create custom panel with background image
        contentPane = new ImagePanel(new ImageIcon("C:\\Users\\63906\\OneDrive\\Documents\\oop_project\\my_application\\src\\login\\2f849834729ff571e5594f315e809508.jpg").getImage());
        contentPane.setBorder(new EmptyBorder(0, 5, 5, 5));

        setContentPane(contentPane);
        getContentPane().setLayout(null);

        JLabel Logo = new JLabel("");
        Logo.setIcon(new ImageIcon("C:\\Users\\63906\\OneDrive\\Documents\\oop_project\\my_application\\src\\login\\1-removebg-preview.png"));
        Logo.setBounds(22, 21, 256, 212);
        getContentPane().add(Logo);

        JLabel text = new JLabel("APARTMENT RENTAL AND ");
        text.setForeground(new Color(255, 255, 255));
        text.setBackground(new Color(255, 255, 255));
        text.setFont(new Font("Tahoma", Font.BOLD, 75));
        text.setBounds(268, 27, 1048, 99);
        getContentPane().add(text);

        JLabel lblNewLabel = new JLabel("FACILITIES BILLING SYSTEM");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 71));
        lblNewLabel.setBounds(303, 136, 1083, 85);
        getContentPane().add(lblNewLabel);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setForeground(new Color(255, 255, 255));
        lblUsername.setFont(new Font("Tahoma", Font.BOLD, 40));
        lblUsername.setBounds(319, 267, 341, 128);
        getContentPane().add(lblUsername);

        usernameField = new JTextField();
        usernameField.setBounds(319, 366, 960, 74);
        getContentPane().add(usernameField);
        usernameField.setColumns(10);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setForeground(new Color(255, 255, 255));
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 40));
        lblPassword.setBounds(319, 405, 341, 128);
        getContentPane().add(lblPassword);

        passwordField = new JPasswordField();
        passwordField.setBounds(319, 503, 960, 74);
        getContentPane().add(passwordField);

        JButton btnForgotPassword = new JButton("Forgot Password");
        btnForgotPassword.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Simple forgot password dialog
                JOptionPane.showMessageDialog(Main.this, "Please contact the administrator to reset your password.", "Forgot Password", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btnForgotPassword.setForeground(new Color(0, 128, 0));
        btnForgotPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnForgotPassword.setBounds(1081, 587, 198, 53);
        getContentPane().add(btnForgotPassword);

        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Check if entered credentials match dummy credentials
                if (username.equals(DUMMY_USERNAME) && password.equals(DUMMY_PASSWORD)) {
                    JOptionPane.showMessageDialog(Main.this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(Main.this, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnLogin.setForeground(new Color(0, 128, 0));
        btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnLogin.setBounds(1165, 662, 114, 59);
        getContentPane().add(btnLogin);

        contentPane.setLayout(null);
    }

    // Custom JPanel class for background image
    class ImagePanel extends JPanel {
        private Image backgroundImage;

        public ImagePanel(Image image) {
            this.backgroundImage = image;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
