package componentsUI;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.function.BooleanSupplier;

import javax.swing.JButton;

public class CustomButton extends JButton {
    private Color hoverColor;
    private Color originalColor;
    private Color clickColor;
    
    
    private Color nameColor;   //for foreground
    

	

	private BooleanSupplier condition;

    public CustomButton(String text, Color hoverColor, Color originalColor, Color clickColor, Color nameColor, BooleanSupplier condition) {
        super(text);
        this.hoverColor = hoverColor;
        this.originalColor = originalColor;
        this.clickColor = clickColor;
        this.condition = condition;

        setBackground(originalColor);
   //   setBorderPainted(false); // Optional: remove border for a cleaner look
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (condition.getAsBoolean()) {
                    setBackground(hoverColor);
               //     setForeground(nameColor);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (condition.getAsBoolean()) {
                    setBackground(originalColor);
             //       setForeground(Color.WHITE);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(clickColor);
             //   setForeground(nameColor);
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (condition.getAsBoolean()) {
                    setBackground(hoverColor);
              //      setForeground(nameColor);
                }
            }
        });
    }


	public Color getNameColor() {
		return nameColor;
	}
	
	public void setNameColor(Color nameColor) {
		this.nameColor = nameColor;
	}


	public Color getHoverColor() {
		return hoverColor;
	}

	public void setHoverColor(Color hoverColor) {
		this.hoverColor = hoverColor;
	}

	public Color getOriginalColor() {
		return originalColor;
	}

	public void setOriginalColor(Color originalColor) {
		this.originalColor = originalColor;
	}

	public Color getClickColor() {
		return clickColor;
	}

	public void setClickColor(Color clickColor) {
		this.clickColor = clickColor;
	}
}