/*
Daniel Balser
Car
 */
package nb.test.gamepackagev1;

import java.awt.*;

public class Car {// start class
   private int x=0;
   private int y=0; 
   
       static Color my_red = new Color(150,0,0); //create my own color variable

   
   public Car(int x, int y){// start Car method
        this.x=x;
        this.y=y;
    }//end car method
   
    public void show (Graphics g){// start show
        
    // car body   
    g.setColor(my_red);
    
    g.fillOval(x+170, y+420, 55,35 );
    g.fillOval(x+145, y+400, 55,45 );
    g.fillRect(x+135, y+402, 50,35 );
    g.fillRect(x+135, y+435, 90, 35);
    g.fillRect(x+70, y+435, 85,35 );
    
    //wheels
    
    g.setColor(Color.BLACK);
    
    g.fillOval(x+170, y+455, 35,35 );
    g.fillOval(x+90, y+455, 35,35 );
    
    g.setColor(Color.GRAY);
    g.fillOval(x+178, y+463, 20, 20);
    g.fillOval(x+98, y+463, 20, 20);
    
    // door, window, and lights
    
    g.setColor(Color.BLACK);
    
    g.fillRect(x+140, y+410, 2, 45);
    g.fillRect(x+140, y+410, 40, 2);
    g.fillRect(x+180, y+412, 2, 2);
    g.fillRect(x+182, y+414, 2, 2); 
    g.fillRect(x+184, y+416, 2, 2);
    g.fillRect(x+186, y+418, 2, 2);
    g.fillRect(x+188, y+420, 2, 2);
    g.fillRect(x+188, y+420, 2, 30);
    g.fillRect(x+178, y+450, 12, 2);
    g.fillRect(x+176, y+452, 2, 2);
    g.fillRect(x+174, y+454, 2, 2);
    g.fillRect(x+172, y+456, 2, 2);
    g.fillRect(x+140, y+456, 30, 2);
    
    g.setColor(Color.WHITE);
    g.fillRect(x+145, y+415, 30, 20);
    
    g.setColor(Color.YELLOW);
    g.fillOval(x+205, y+430, 15,15);
            
            


    }// end show
}//end class
