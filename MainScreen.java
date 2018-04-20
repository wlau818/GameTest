import java.awt.Image;
import java.awt.image.BufferedImage;

public class MainScreen {
	
	public static void main(String[] args) {
		System.out.println("Start!");
		Game ex = new Game();
		new Thread(ex).start();
	}

}
