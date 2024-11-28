package componentsUI;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class BackgroundPanel extends JPanel {
    private Image backgroundImage;

    public BackgroundPanel(String imagePath) {
        try {
            backgroundImage = new ImageIcon(getClass().getResource(imagePath)).getImage();
        } catch (Exception e) {
            e.printStackTrace(); // Handle error if the image is not found
        }
      //  setLayout(new BorderLayout()); // You can set any layout you prefer
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this); // Draw image to fit the panel
        }
    }
}
