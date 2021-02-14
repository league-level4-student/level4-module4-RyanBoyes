package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
   protected int x;
   protected int y;
     
   
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public abstract void update();
   
   	
    
    
    public abstract void draw(Graphics g);
}
