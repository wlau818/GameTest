import java.awt.Image;
import java.awt.image.BufferedImage;

public class Board implements ArrowListener {
	
	private Image background;
	private Heroine hero;
	private int width;
	private int height;
	
	public Board(BufferedImage ground) {
		background = ground;
		height = ground.getHeight();
		width = ground.getWidth();
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	

	@Override
	public void upPressed() {
		hero.move(3);
		// TODO Auto-generated method stub
		
	}



	@Override
	public void downPressed() {
		hero.move(4);
		// TODO Auto-generated method stub
		
	}



	@Override
	public void leftPressed() {
		hero.move(1);
		// TODO Auto-generated method stub
		
	}



	@Override
	public void rightPressed() {
		hero.move(2);
		// TODO Auto-generated method stub
		
	}



	@Override
	public void enterPressed() {
		
		// TODO Auto-generated method stub
		
	}



	@Override
	public void backPressed() {
		
		// TODO Auto-generated method stub
		
	}

}
