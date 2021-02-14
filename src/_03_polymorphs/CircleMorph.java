package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph{
	int circleCounter = 0;
	
	protected int width = 50;
	protected int height = 50;

	CircleMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.CYAN);
		g.fillRect(x+200, y+300, width, height);
		
		
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

		x = ((int)(x+Math.cos(circleCounter)*40));
		y = ((int)(y+Math.sin(circleCounter)*40));
		
		circleCounter++;

	}

}
