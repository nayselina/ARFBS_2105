package componentsUI;

import javax.swing.JFrame;

public class WindowStateManager {
    private static boolean isMaximized = false;
    private static boolean isMinimized = false;

    // Store the window state before disposing a frame
    public static void saveWindowState(JFrame frame) {
        if (frame.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
            isMaximized = true;
        } else if (frame.getExtendedState() == JFrame.ICONIFIED) {
            isMinimized = true;
        } else {
            isMaximized = false;
            isMinimized = false;
        }
    }

    // Restore the window state for a new frame
    public static void restoreWindowState(JFrame frame) {
        if (isMaximized) {
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        } else if (isMinimized) {
            frame.setExtendedState(JFrame.ICONIFIED);
        } else {
            frame.setExtendedState(JFrame.NORMAL);
        }
    }
}
