package componentsUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JTextField;

public class PlaceholderTextField extends JTextField {
    private String placeholder;

    public PlaceholderTextField(String placeholder) {
        this.placeholder = placeholder;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw placeholder text when the field is empty
        if (getText().isEmpty()) {
            g.setColor(new Color(200, 200, 200)); // Placeholder text color
            g.setFont(getFont().deriveFont(Font.ITALIC)); // Italicize placeholder
            g.drawString(placeholder, getInsets().left, getHeight() / 2 + getFont().getSize() / 2 - 2);
        }
    }
}
