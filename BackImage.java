import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BackImage extends JFrame{
	
	JLabel ground;
	
	public BackImage() {
		setTitle("back");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	//	setColor(Color.white);
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon("C:\\Users\\winni\\OneDrive\\Pictures\\Saved Pictures\\FEEBAS!!!.png")));
		setLayout(new FlowLayout());
		ground = new JLabel("APPLE");
		ground.setFont(new Font("Serif", Font.PLAIN, 100));
	//	ground.setColor(Color.RED);
		ground.setForeground(Color.WHITE);
		add(ground);
		ImageIcon pic = new ImageIcon("C:\\Users\\winni\\OneDrive\\Pictures\\Saved Pictures\\FEEBAS!!!.png");
		//pic.getIconWidth();
		setSize(pic.getIconWidth(), pic.getIconHeight());
	}
	
	private void setColor(Color white) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		new BackImage();
	}
	

}
