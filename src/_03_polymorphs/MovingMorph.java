package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{

	protected int width = 50;
	protected int height = 50;
	
	
	MovingMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLACK);
		g.fillRect(x, y+200, width, height);
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		if(x<400) {
			x+=2;
		}
		else if(x>=400) {
			if(y<=100) {
				y-=2;
			}
			else if(y>100) {
				x-=2;
			}
		}
		
		
	}

	

	
	
	
}
