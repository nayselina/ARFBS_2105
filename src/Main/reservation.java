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

    private String selectedUnitType, selectedPrice, selectedLeaseType;

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

    public reservation() {
        this("", "", "");  // Default empty values for unit type, price, and lease type
    }

    public reservation(String selectedUnitType, String selectedPrice, String selectedLeaseType) {
        setTitle("Reservation");
        setSize(1440, 752);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.selectedUnitType = selectedUnitType.isEmpty() ? "" : selectedUnitType;  // No default unit type
        this.selectedPrice = selectedPrice.isEmpty() ? "" : selectedPrice;  // No default price
        this.selectedLeaseType = selectedLeaseType.isEmpty() ? "" : selectedLeaseType;  // No default lease type

        contentPane = new JPanel();
        contentPane.setBackground(new Color(240, 238, 226));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Sidebar panel with all the buttons
        JPanel sidebarPanel = new JPanel();
        sidebarPanel.setBackground(new Color(255, 255, 255));
        sidebarPanel.setBounds(0, 124, 251, 785);
        contentPane.add(sidebarPanel);
        sidebarPanel.setLayout(null);

        // Homepage button
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

        // Apartments button
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

        // Billing button
        JButton btnBilling = new JButton("Billing");
        btnBilling.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnBilling.setBounds(0, 226, 251, 58);
        sidebarPanel.add(btnBilling);

        // Reservations button (current page)
        JButton btnReservation = new JButton("Reservations");
        btnReservation.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnReservation.setBounds(0, 283, 251, 58);
        btnReservation.setBackground(new Color(255, 255, 255));
        btnReservation.setForeground(new Color(0, 0, 0));
        btnReservation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); 
                reservation reservationFrame = new reservation(selectedUnitType, selectedPrice, selectedLeaseType);
                reservationFrame.setVisible(true); 
            }
        });
        sidebarPanel.add(btnReservation);

        // Reports button
        JButton btnReports = new JButton("Reports");
        btnReports.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btnReports.setBounds(0, 340, 251, 58);
        sidebarPanel.add(btnReports);

        // Settings button
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
        logoLabel = new JLabel(new ImageIcon(reservation.class.getResource("/logo/Untitled_design-removebg-preview.png")));
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setBounds(56, 55, 61, 16);
        headerPanel.add(lblNewLabel);

        // Apartment selection panel
        JPanel selectionPanel = new JPanel();
        selectionPanel.setBounds(300, 150, 1100, 500);
        selectionPanel.setBackground(new Color(240, 238, 226));
        selectionPanel.setLayout(null);
        contentPane.add(selectionPanel);

        // Apartment types and images
        addApartmentOption(selectionPanel, "Studio Apartment", "path/to/studio_apartment.png", 0);
        addApartmentOption(selectionPanel, "Solo Suite", "path/to/solo_suite.png", 1);
        addApartmentOption(selectionPanel, "Duo Deluxe", "path/to/duo_deluxe.png", 2);
        addApartmentOption(selectionPanel, "Loft", "path/to/loft.png", 3);
        addApartmentOption(selectionPanel, "Penthouse", "path/to/penthouse.png", 4);

        // Next button setup
        JButton nextButton = new JButton("Next");
        nextButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
        nextButton.setBounds(650, 670, 150, 50);
        nextButton.setBackground(new Color(128, 128, 0));
        nextButton.setForeground(Color.WHITE);
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Pass the selected unit details to reservationbilling
                dispose();
                reservationbilling billingFrame = new reservationbilling(selectedUnitType, selectedPrice, selectedLeaseType);
                billingFrame.setVisible(true);
            }
        });
        contentPane.add(nextButton);
    }

    // Method to add apartment options with images and labels
    private void addApartmentOption(JPanel panel, String type, String imagePath, int position) {
        int xPosition = 50 + (position * 210);

        // Apartment label
        JLabel typeLabel = new JLabel(type);
        typeLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
        typeLabel.setBounds(xPosition, 220, 200, 30);
        typeLabel.setHorizontalAlignment(JLabel.CENTER);
        typeLabel.setForeground(Color.BLACK);
        panel.add(typeLabel);

        // If this is the selected unit type, highlight it
        if (type.equals(selectedUnitType)) {
            typeLabel.setForeground(new Color(183, 183, 47)); // Highlight color
        } else {
            typeLabel.setForeground(Color.BLACK); // Default color for non-selected types
        }

        // Assign reference based on apartment type
        switch (type) {
            case "Studio Apartment" -> {
                studioLabel = typeLabel;
                if (type.equals(selectedUnitType)) {
                    selectedPrice = "$1,000";  // Fixed price for Studio
                }
            }
            case "Solo Suite" -> {
                soloLabel = typeLabel;
                if (type.equals(selectedUnitType)) {
                    selectedPrice = "$1,500";  // Fixed price for Solo Suite
                }
            }
            case "Duo Deluxe" -> {
                duoLabel = typeLabel;
                if (type.equals(selectedUnitType)) {
                    selectedPrice = "$2,000";  // Fixed price for Duo Deluxe
                }
            }
            case "Loft" -> {
                loftLabel = typeLabel;
                if (type.equals(selectedUnitType)) {
                    selectedPrice = "$2,500";  // Fixed price for Loft
                }
            }
            case "Penthouse" -> {
                penthouseLabel = typeLabel;
                if (type.equals(selectedUnitType)) {
                    selectedPrice = "$5,000";  // Fixed price for Penthouse
                }
            }
        }

        // If an apartment type is selected, update the label color
        if (type.equals(selectedUnitType)) {
            typeLabel.setForeground(new Color(183, 183, 47));  // Highlight the label when selected
        }
    }
}