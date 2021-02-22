package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph{

	public static BufferedImage gokuImg;
	
	protected int width = 50;
	protected int height = 50;
	
	
	
	ImageMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		try {
			gokuImg = ImageIO.read(this.getClass().getResourceAsStream("goku.jpg"));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(gokuImg, 200, 225, 90, 90, null);

	}

	
	
	
	
	
	
	
	
}
