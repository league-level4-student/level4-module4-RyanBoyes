package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class MessageMorph extends Polymorph{

	protected int width = 50;
	protected int height = 50;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton polyButton = new JButton();
	
	MessageMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		
		frame.add(panel);
		panel.add(polyButton);
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
		g.setColor(Color.PINK);
		g.fillRect(350, 200, width, height);
	}

	
}
