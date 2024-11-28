package componentsUI;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ChangingBackgroundPanel extends JPanel {
    private Image backgroundImage;

    public ChangingBackgroundPanel(String imagePath) {
        setBackgroundImage(imagePath);
    }

    public void setBackgroundImage(String imagePath) {
        ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));
        backgroundImage = icon.getImage();
        repaint();
    }

    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
