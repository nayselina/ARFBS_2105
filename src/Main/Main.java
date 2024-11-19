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
import javax.swing.JCheckBox;

public class Main extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    // Correct credentials
    private final String DUMMY_USERNAME = "user";
    private final String DUMMY_PASSWORD = "security123";

    private JTextField WELCOME;
    private JTextField AvaHomes;
    private JTextField manage;
    private JTextField simplify;
    private JTextField username;
    private JTextField password;
    private JPasswordField passwordField;
    private JTextField textField;

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

    public Main() {
        getContentPane().setForeground(new Color(240, 238, 226));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1440, 752);

        // Create custom panel with background image
        contentPane = new ImagePanel(new ImageIcon("C:\\Users\\63906\\OneDrive\\Documents\\oop_project\\my_application\\src\\login\\2f849834729ff571e5594f315e809508.jpg").getImage());
        contentPane.setBorder(new EmptyBorder(0, 5, 5, 5));

        setContentPane(contentPane);
        getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setBounds(189, 111, 1026, 542);
        getContentPane().add(panel);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(183, 183, 47));
        panel_1.setBounds(0, 0, 86, 542);
        panel.add(panel_1);

        WELCOME = new JTextField();
        WELCOME.setFont(new Font("Segoe UI", Font.BOLD, 30));
        WELCOME.setText("  WELCOME");
        WELCOME.setBounds(683, 89, 191, 53);
        panel.add(WELCOME);
        WELCOME.setColumns(10);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\63906\\Downloads\\home-page (2).png"));
        lblNewLabel.setBounds(145, 55, 301, 302);
        panel.add(lblNewLabel);

        AvaHomes = new JTextField();
        AvaHomes.setFont(new Font("Segoe UI", Font.BOLD, 15));
        AvaHomes.setText("  \"Welcome to AVA HOMES - your trusted partner \r\n\r\n");
        AvaHomes.setBounds(106, 352, 365, 48);
        panel.add(AvaHomes);
        AvaHomes.setColumns(10);

        manage = new JTextField();
        manage.setText("   in managing rental and facilities. Let's log in");
        manage.setFont(new Font("Segoe UI", Font.BOLD, 15));
        manage.setColumns(10);
        manage.setBounds(134, 388, 326, 42);
        panel.add(manage);

        simplify = new JTextField();
        simplify.setText("  and simplify your billing and property management!\"\r\n");
        simplify.setFont(new Font("Segoe UI", Font.BOLD, 15));
        simplify.setColumns(10);
        simplify.setBounds(106, 424, 391, 42);
        panel.add(simplify);

        username = new JTextField();
        username.setForeground(new Color(183, 183, 47));
        username.setBackground(new Color(240, 238, 226));
        username.setFont(new Font("Segoe UI", Font.BOLD, 20));
        username.setText("Username");
        username.setBounds(611, 195, 124, 42);
        panel.add(username);
        username.setColumns(10);

        password = new JTextField();
        password.setForeground(new Color(183, 183, 47));
        password.setBackground(new Color(240, 238, 226));
        password.setText("Password");
        password.setFont(new Font("Segoe UI", Font.BOLD, 20));
        password.setColumns(10);
        password.setBounds(611, 267, 124, 42);
        panel.add(password);

        passwordField = new JPasswordField();
        passwordField.setBackground(new Color(240, 238, 226));
        passwordField.setBounds(785, 267, 179, 43);
        panel.add(passwordField);

        textField = new JTextField();
        textField.setBackground(new Color(240, 238, 226));
        textField.setFont(new Font("Segoe UI", Font.BOLD, 20));
        textField.setColumns(10);
        textField.setBounds(785, 195, 179, 42);
        panel.add(textField);

        JButton login = new JButton(" Log in ");
        login.setForeground(new Color(0, 0, 0));
        login.setBackground(new Color(183, 183, 47));
        login.setFont(new Font("Segoe UI", Font.BOLD, 20));
        login.setBounds(705, 390, 141, 32);
        panel.add(login);

        JCheckBox showpassword = new JCheckBox("show password");
        showpassword.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        showpassword.setBackground(new Color(240, 238, 226));
        showpassword.setBounds(785, 333, 179, 32);
        panel.add(showpassword);

        // Action listener for the login button
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String enteredUsername = textField.getText();
                String enteredPassword = new String(passwordField.getPassword());

                if (enteredUsername.equals(DUMMY_USERNAME) && enteredPassword.equals(DUMMY_PASSWORD)) {
                    JOptionPane.showMessageDialog(null, "Login successful!");
                    // Proceed to the next screen or action
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Action listener for the show password checkbox
        showpassword.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (showpassword.isSelected()) {
                    passwordField.setEchoChar((char) 0); // Show password
                } else {
                    passwordField.setEchoChar('*'); // Hide password
                }
            }
        });

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
