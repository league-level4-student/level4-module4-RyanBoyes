package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class ImageMorph extends Polymorph{

	protected int width = 50;
	protected int height = 50;
	
	ImageMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.PINK);
		g.fillRect(x+20, y+250, width, height);
	}

	
	
	
	
	
	
	
	
}
