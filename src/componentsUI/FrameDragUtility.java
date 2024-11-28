package componentsUI;

import javax.swing.*;
import java.awt.event.*;

public class FrameDragUtility {
    private int mouseX, mouseY;

    public FrameDragUtility(JFrame frame) {
        // Mouse listener to track the initial mouse press location
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
            }
        });

        // Mouse motion listener to calculate and set new location
        frame.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen() - mouseX;
                int y = e.getYOnScreen() - mouseY;
                frame.setLocation(x, y);
            }
        });
    }
}
