package componentsUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.Icon;
import javax.swing.JCheckBox;

public class CustomCheckBoxIcon implements Icon {
    private final int size = 16; // Size of the checkbox
    private final Color boxColor = new Color(183,183,47); 
    private final Color checkColor = Color.WHITE; // White checkmark color
    private final int cornerRadius = 4; // Radius for the rounded corners

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        JCheckBox cb = (JCheckBox) c;
        Graphics2D g2d = (Graphics2D) g.create();

        // Draw the rounded box
        g2d.setColor(boxColor);
        g2d.fillRoundRect(x, y, size, size, cornerRadius, cornerRadius);

        // Draw checkmark if selected
        if (cb.isSelected()) {
            g2d.setColor(checkColor);
            g2d.drawLine(x + 3, y + 8, x + 7, y + 12); // Checkmark part 1
            g2d.drawLine(x + 7, y + 12, x + 13, y + 4); // Checkmark part 2
        }

        g2d.dispose();
    }

    @Override
    public int getIconWidth() {
        return size;
    }

    @Override
    public int getIconHeight() {
        return size;
    }
}
