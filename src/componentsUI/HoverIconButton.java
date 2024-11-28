package componentsUI;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HoverIconButton extends JButton {
    private final ImageIcon defaultIcon;
    private final ImageIcon hoverIcon;
    private final ImageIcon pressedIcon;

    // Constructor
    public HoverIconButton(String defaultIconPath, String hoverIconPath, String pressedIconPath) {
        // Set default, hover, and pressed icons
        this.defaultIcon = new ImageIcon(getClass().getResource(defaultIconPath));
        this.hoverIcon = new ImageIcon(getClass().getResource(hoverIconPath));
        this.pressedIcon = new ImageIcon(getClass().getResource(pressedIconPath));

        // Set the initial icon to the default icon
        setIcon(defaultIcon);
        setBorderPainted(false); // Optional: remove border for a cleaner look

        // Add MouseListener to handle hover and press actions
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setIcon(hoverIcon);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setIcon(defaultIcon);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setIcon(pressedIcon);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                setIcon(hoverIcon);
            }
        });
    }
}
