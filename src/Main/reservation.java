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
import javax.swing.border.EmptyBorder;

public class reservation extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel studioLabel, soloLabel, duoLabel, loftLabel, penthouseLabel;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                reservation frame = new reservation();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    // Default constructor showing all unit types without a specific default
    public reservation() {
        this("");  // No specific default unit type
    }

    // Constructor with selected unit type parameter
    public reservation(String selectedUnitType) {
        setTitle("Reservation");
        setSize(1440, 752);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = new JPanel();
        contentPane.setBackground(new Color(240, 238, 226));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Sidebar panel
        JPanel sidebarPanel = new JPanel();
        sidebarPanel.setBackground(new Color(255, 255, 255));
        sidebarPanel.setBounds(0, 124, 251, 785);
        contentPane.add(sidebarPanel);
        sidebarPanel.setLayout(null);

        JButton btnDashboard = new JButton("Homepage");
        btnDashboard.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnDashboard.setBounds(0, 58, 251, 58);
        btnDashboard.setBackground(new Color(128, 128, 0));
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
                dispose();
                reservation reservationFrame = new reservation();
                reservationFrame.setVisible(true);
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

        // Header panel
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(183, 183, 47));
        headerPanel.setBounds(0, 0, 1440, 122);
        contentPane.add(headerPanel);
        headerPanel.setLayout(null);

        JLabel logoLabel = new JLabel("");
        logoLabel.setBounds(10, -16, 209, 162);
        headerPanel.add(logoLabel);
        logoLabel.setIcon(new ImageIcon("C:\\path\\to\\your\\logo.png"));

        JLabel bellIconLabel = new JLabel("");
        bellIconLabel.setBounds(1254, 32, 48, 61);
        headerPanel.add(bellIconLabel);
        bellIconLabel.setIcon(new ImageIcon("C:\\Users\\63906\\Downloads\\bell.png"));

        JLabel userIconLabel = new JLabel("");
        userIconLabel.setBounds(1301, 44, 45, 39);
        headerPanel.add(userIconLabel);
        userIconLabel.setIcon(new ImageIcon("C:\\Users\\63906\\Downloads\\user.png"));

        // Apartment selection panel
        JPanel selectionPanel = new JPanel();
        selectionPanel.setBounds(300, 150, 1100, 500);
        selectionPanel.setBackground(new Color(240, 238, 226));
        selectionPanel.setLayout(null);
        contentPane.add(selectionPanel);

        // Apartment types and images
        addApartmentOption(selectionPanel, "Studio Apartment", "path/to/studio_apartment.png", 0, selectedUnitType);
        addApartmentOption(selectionPanel, "Solo Suite", "path/to/solo_suite.png", 1, selectedUnitType);
        addApartmentOption(selectionPanel, "Duo Deluxe", "path/to/duo_deluxe.png", 2, selectedUnitType);
        addApartmentOption(selectionPanel, "Loft", "path/to/loft.png", 3, selectedUnitType);
        addApartmentOption(selectionPanel, "Penthouse", "path/to/penthouse.png", 4, selectedUnitType);
    }

    // Method to add apartment options with images and labels
    private void addApartmentOption(JPanel panel, String type, String imagePath, int position, String selectedUnitType) {
        int xPosition = 50 + (position * 210);

        // Apartment label
        JLabel typeLabel = new JLabel(type);
        typeLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
        typeLabel.setBounds(xPosition, 220, 200, 30);
        typeLabel.setHorizontalAlignment(JLabel.CENTER);
        typeLabel.setForeground(Color.BLACK);
        panel.add(typeLabel);

        // Highlight the label if it matches the selected unit type
        if (type.equals(selectedUnitType)) {
            typeLabel.setForeground(new Color(183, 183, 47)); // Highlight color
        }

        // Assign reference based on apartment type
        switch (type) {
            case "Studio Apartment" -> studioLabel = typeLabel;
            case "Solo Suite" -> soloLabel = typeLabel;
            case "Duo Deluxe" -> duoLabel = typeLabel;
            case "Loft" -> loftLabel = typeLabel;
            case "Penthouse" -> penthouseLabel = typeLabel;
        }
    }
}