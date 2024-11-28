package componentsUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Header extends JPanel {
    private Color originalColor = new Color(183, 183, 47);
    private Color hoverColor = originalColor.darker();
    private Color clickColor = hoverColor.darker();

    public Header(JFrame frame) {
        setLayout(null);
        setBackground(clickColor);
        setBounds(0, 0, 1300, 26);

        // Create the min/max/close panel
        JPanel minMaxClosePanel = new JPanel();
        minMaxClosePanel.setBounds(1210, 0, 90, 26); // Position panel at the right-most side
        minMaxClosePanel.setLayout(new GridLayout(0, 3, 0, 0));
        add(minMaxClosePanel);

        // Label for the app name
        JLabel lblAptmanagerByAvahome = new JLabel("AptManager by AVAHOME v1.0");
        lblAptmanagerByAvahome.setForeground(Color.WHITE);
        lblAptmanagerByAvahome.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        lblAptmanagerByAvahome.setBounds(543, 2, 208, 20);
        add(lblAptmanagerByAvahome);
        
      /*  this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                // Get the current frame width
                int frameWidth = getWidth();

                // Update the header panel width
                setBounds(0, 0, frameWidth, 26);

                // Center the label within the header panel
                int labelWidth = lblAptmanagerByAvahome.getPreferredSize().width;
                int labelX = (frameWidth - labelWidth) / 2; // Center horizontally

                lblAptmanagerByAvahome.setBounds(labelX, 0, labelWidth, 20);
            }
        });      */

        // Maximize button
        HoverIconButton btnMaximize = new HoverIconButton("/images/maximize.png", "/images/light_maximize.png", "/images/light_maximize.png");
        btnMaximize.setIcon(new ImageIcon(getClass().getResource("/images/maximize.png")));
        btnMaximize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // Change cursor on hover
        btnMaximize.setBackground(clickColor);
        btnMaximize.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (frame.getExtendedState() != JFrame.MAXIMIZED_BOTH) {
                    frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize the window
                } else {
                    frame.setExtendedState(JFrame.NORMAL); // Restore to normal size if already maximized
                }
            }
        });
        
        // Minimize button
        HoverIconButton btnMinimize = new HoverIconButton("/images/minimize.png", "/images/light_minimize.png", "/images/light_minimize.png");
        btnMinimize.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setState(JFrame.ICONIFIED); // Minimize the window
            }
        });
        btnMinimize.setIcon(new ImageIcon(getClass().getResource("/images/minimize.png")));
        btnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // Change cursor on hover
        btnMinimize.setBackground(clickColor);
        
        // Close button
        HoverIconButton btnClose = new HoverIconButton("/images/close.png", "/images/red_close.png", "/images/red_close.png");
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Close the application
            }
        });
        btnClose.setIcon(new ImageIcon(getClass().getResource("/images/close.png")));
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // Change cursor on hover
        btnClose.setBackground(clickColor);

        // Add buttons to the panel
        minMaxClosePanel.add(btnMinimize);
        minMaxClosePanel.add(btnMaximize);
        minMaxClosePanel.add(btnClose);
        
        frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                int frameWidth = frame.getWidth();

                // Update the header panel width
                setBounds(0, 0, frameWidth, 26);

                // Center the label within the header panel
                int labelWidth = lblAptmanagerByAvahome.getPreferredSize().width;
                int labelX = (frameWidth - labelWidth) / 2;
                lblAptmanagerByAvahome.setBounds(labelX, 2, labelWidth, 20);
                
                
                minMaxClosePanel.setBounds(frameWidth - 90, 0, 90, 26); // Adjust position of min/max/close panel
            }
        });
    }
}
