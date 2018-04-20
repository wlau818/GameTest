import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Heroine extends Character {
	
	private int location;
	private int x;
	private int y;
	private Image image;
	private boolean left, right, up, down;
	
	public Heroine() {
		ImageIcon ii = new ImageIcon("chara.png");
        image = ii.getImage(); 
	}
	
	public void update() {
		
	}
	
	public void setLeft(boolean newLeft) {
		left = newLeft;
	}
	public void setRight(boolean newRight) {
		right = newRight;
	}
	public void setUp(boolean newUp) {
		up = newUp;
	}
	public void setDown(boolean newDown) {
		down = newDown;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            x = -2;
        }

        if (key == KeyEvent.VK_RIGHT) {
            x = 2;
        }

        if (key == KeyEvent.VK_UP) {
            y = -2;
        }

        if (key == KeyEvent.VK_DOWN) {
            y = 2;
        }
    }

}
