package componentsUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPasswordField;

public class RoundedPlaceholderPasswordField extends JPasswordField {
    private String placeholder;
    private int cornerRadius;
    private Color borderColor;

    // Constructor to set the placeholder, corner radius, and border color
    public RoundedPlaceholderPasswordField(String placeholder, int cornerRadius, Color borderColor) {
        this.placeholder = placeholder;
        this.cornerRadius = cornerRadius;
        this.borderColor = borderColor;
        setOpaque(false); // Make the background transparent to show the rounded edges
    }

    // Override getInsets to add custom left padding (indentation)
    @Override
    public java.awt.Insets getInsets() {
        return new java.awt.Insets(0, 10, 0, 0);  // Add 20 pixels of left padding
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics g2 = g.create();
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius); // Rounded rectangle for background
        g2.dispose();

        super.paintComponent(g);  // Call the parent class to handle text rendering

        // Draw placeholder text when the field is empty
        if (getPassword().length == 0) {
            g.setColor(new Color(200, 200, 200)); // Placeholder text color
            g.setFont(getFont().deriveFont(Font.ITALIC)); // Italicize placeholder
            g.drawString(placeholder, getInsets().left, getHeight() / 2 + getFont().getSize() / 2 - 2); // Draw placeholder
        }

        // Draw the line border
        g.setColor(borderColor); // Set border color
        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, cornerRadius, cornerRadius); // Draw the rounded border
    }

    @Override
    public void setBorder(javax.swing.border.Border border) {
        // Override to remove the default border (so that our custom rounded corners and border are used)
    }

    @Override
    protected void paintBorder(Graphics g) {
        // Do nothing to avoid default border being painted
    }
}
