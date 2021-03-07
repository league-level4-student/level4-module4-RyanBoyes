package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
 ArrayList<Polymorph> polymorphs = new ArrayList<Polymorph>();
 
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.addMouseListener(this);
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	Polymorph bluePoly = new BluePolymorph(50, 50);	
  	Polymorph redPoly = new RedMorph(50, 50);
    Polymorph movingPoly = new MovingMorph(50, 50);
    Polymorph circlePoly = new CircleMorph(50, 50);
    Polymorph mousePoly =new MouseMorph(50, 50);
    Polymorph imagePoly = new ImageMorph(50, 50);
    Polymorph messagePoly = new MessageMorph(50, 50);
    polymorphs.add(0, bluePoly);
    polymorphs.add(1, redPoly);
    polymorphs.add(2, movingPoly);
    polymorphs.add(3, circlePoly);
    polymorphs.add(4, mousePoly);
    polymorphs.add(5, imagePoly);
    polymorphs.add(6, messagePoly);
    
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 for(Polymorph i:polymorphs) {
   		 i.draw(g);
   	 }
   	 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 for(Polymorph j:polymorphs) {
   		 j.update();
   	 }
   	 
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getX()>350&&e.getX()<400) {
			if(e.getY()>225&&e.getY()<275) {
				System.out.println("MESSAGE");
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
