/*
Daniel Balser
Tree
 */
package nb.test.gamepackagev1;

import java.awt.*;

public class Tree {// start class
      private int x=0;
      private int y=0; 
    
      static Color my_green = new Color(0,90,0); //create my own color variable
      static Color my_brown = new Color(155,103,60); //create my own color variable
      
   public Tree(int x, int y){// start tree method
        this.x=x;
        this.y=y;
    }//end tree method 
   
   public void show (Graphics g){// start show
     
     //tree
     g.setColor(my_green);
     
     g.fillRect(x+88, y+380, 2, 60);
     g.fillRect(x+86, y+382, 2, 60);
     g.fillRect(x+84, y+384, 2, 60);
     g.fillRect(x+82, y+386, 2, 60);
     g.fillRect(x+80, y+388, 2, 60);
     g.fillRect(x+78, y+390, 2, 60);
     g.fillRect(x+76, y+392, 2, 60);
     g.fillRect(x+74, y+394, 2, 60);
     g.fillRect(x+72, y+396, 2, 60);
     g.fillRect(x+70, y+398, 2, 60);
     
     g.fillRect(x+68, y+390, 2, 74);
     g.fillRect(x+66, y+392, 2, 70);
     g.fillRect(x+64, y+394, 2, 66);
     g.fillRect(x+62, y+396, 2, 62);
     g.fillRect(x+60, y+398, 2, 58);
     g.fillRect(x+58, y+400, 2, 54);
     g.fillRect(x+56, y+402, 2, 50);
     g.fillRect(x+54, y+404, 2, 46);
     g.fillRect(x+52, y+406, 2, 42);
     g.fillRect(x+50, y+408, 2, 38);
   
     g.fillRect(x+48, y+400, 2, 54);
     g.fillRect(x+46, y+402, 2, 50);
     g.fillRect(x+44, y+404, 2, 46);
     g.fillRect(x+42, y+406, 2, 42);
     g.fillRect(x+40, y+408, 2, 38);
     g.fillRect(x+38, y+410, 2, 34);
     g.fillRect(x+36, y+412, 2, 30);
     g.fillRect(x+34, y+414, 2, 26);
     g.fillRect(x+32, y+416, 2, 22);
     g.fillRect(x+30, y+418, 2, 18);
   
     g.fillRect(x+28, y+410, 2, 34);
     g.fillRect(x+26, y+412, 2, 30);
     g.fillRect(x+24, y+414, 2, 26);
     g.fillRect(x+22, y+416, 2, 22);
     g.fillRect(x+20, y+418, 2, 18);
     g.fillRect(x+18, y+420, 2, 14);
     g.fillRect(x+16, y+422, 2, 10);
     g.fillRect(x+14, y+424, 2, 6);
     g.fillRect(x+12, y+426, 2, 2);
    
     //tree stump
     g.setColor(my_brown);
     
     g.fillRect(x+90,y+420, 40, 30);
     
     //tree lights
     g.setColor(Color.YELLOW);
     
     g.fillOval(x+0, y+420, 15, 15);
     g.fillOval(x+25, y+435, 5, 5);
     g.fillOval(x+25, y+415, 5, 5);
     g.fillOval(x+45, y+405, 5, 5);
     g.fillOval(x+45, y+445, 5, 5);
     g.fillOval(x+65, y+395, 5, 5);
     g.fillOval(x+65, y+455, 5, 5);
     g.fillOval(x+85, y+385, 5, 5);
     g.fillOval(x+85, y+410, 5, 5);
     g.fillOval(x+65, y+420, 5, 5);
     g.fillOval(x+45, y+425, 5, 5);
     

     
     
     
   }// end show
    
}// end class
