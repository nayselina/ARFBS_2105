package componentsUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPasswordField;

public class PlaceholderPasswordField extends JPasswordField {
    private String placeholder;

    public PlaceholderPasswordField(String placeholder) {
        this.placeholder = placeholder;
        this.setEchoChar((char) 0);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw placeholder text when the field is empty
        if (getPassword().length == 0) {
            g.setColor(new Color(200, 200, 200)); // Placeholder text color
            g.setFont(getFont().deriveFont(Font.ITALIC)); // Italicize placeholder
            g.drawString(placeholder, getInsets().left, getHeight() / 2 + getFont().getSize() / 2 - 2);
        }
    }
}
