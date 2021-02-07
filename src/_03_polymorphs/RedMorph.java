package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class RedMorph extends Polymorph {

	protected int width = 50;
	protected int height = 50;
	
	
	RedMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x+100, y+100, width, height);
	}
	
	
}
