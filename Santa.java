/*
Daniel Balser
Santa
 */
package nb.test.gamepackagev1;

import java.awt.*;


public class Santa {// start class 
   private int x=0;
   private int y=0;  
   private Object g; 
   
   static Color my_red = new Color(150,0,0); 
   static Color my_gold = new Color(212,175,55); 
   static Color my_brown = new Color(155,103,60); 
   static Color my_beige = new Color(188,158,130);   
   
   public Santa (int x, int y){// start santa method  
    this.x=x;
    this.y=y;
    
    
    }// end santa method
   
   void show(Graphics g) {//start show
       
       
       //sleigh
       g.setColor(my_red);
       
       g.fillRect(x+200, y+90, 40, 20);
       g.fillOval(x+200, y+80, 30,20);
       g.fillOval(x+230, y+90, 20, 20);
       
       g.setColor(my_gold);
       
       g.fillRect(x+210, y+110, 2, 5);
       g.fillRect(x+240, y+110, 2, 5);
       
       g.fillRect(x+ 195,y+115 , 60, 2);
       g.fillRect(x+ 193,y+113 , 2, 2);
       g.fillRect(x+ 191,y+111 , 2, 2);
       g.fillRect(x+ 191,y+109 , 2, 2);
       
       g.fillRect(x+ 255,y+113 , 2, 2);
       g.fillRect(x+ 257,y+111 , 2, 2);
       g.fillRect(x+ 259,y+109 , 2, 2);
       g.fillRect(x+ 259,y+107 , 2, 2);
       
      
       
       //reindeer
 
       g.setColor(my_brown);
       
       g.fillOval(x+300, y+100, 20, 10);
       g.fillOval(x+340, y+100, 20, 10);
       g.fillOval(x+380, y+100, 20, 10);
       g.fillOval(x+420, y+100, 20, 10);
       
       g.fillRect(x+ 304,y+110 , 2, 2);
       g.fillRect(x+ 306,y+112 , 2, 2);
       g.fillRect(x+ 308,y+114 , 2, 2);
       g.fillRect(x+ 306,y+116 , 2, 2);
       g.fillRect(x+ 304,y+118 , 2, 2);
       
       g.fillRect(x+ 314,y+110 , 2, 2);
       g.fillRect(x+ 316,y+112 , 2, 2);
       g.fillRect(x+ 318,y+114 , 2, 2);
       g.fillRect(x+ 316,y+116 , 2, 2);
       g.fillRect(x+ 314,y+118 , 2, 2);
       
       
       g.fillRect(x+ 344,y+110 , 2, 2);
       g.fillRect(x+ 346,y+112 , 2, 2);
       g.fillRect(x+ 348,y+114 , 2, 2);
       g.fillRect(x+ 346,y+116 , 2, 2);
       g.fillRect(x+ 344,y+118 , 2, 2);
       
       g.fillRect(x+ 354,y+110 , 2, 2);
       g.fillRect(x+ 356,y+112 , 2, 2);
       g.fillRect(x+ 358,y+114 , 2, 2);
       g.fillRect(x+ 356,y+116 , 2, 2);
       g.fillRect(x+ 354,y+118 , 2, 2);
       
       
       g.fillRect(x+ 384,y+110 , 2, 2);
       g.fillRect(x+ 386,y+112 , 2, 2);
       g.fillRect(x+ 388,y+114 , 2, 2);
       g.fillRect(x+ 386,y+116 , 2, 2);
       g.fillRect(x+ 384,y+118 , 2, 2);
       
       g.fillRect(x+ 394,y+110 , 2, 2);
       g.fillRect(x+ 396,y+112 , 2, 2);
       g.fillRect(x+ 398,y+114 , 2, 2);
       g.fillRect(x+ 396,y+116 , 2, 2);
       g.fillRect(x+ 394,y+118 , 2, 2);
       
       
       g.fillRect(x+ 424,y+110 , 2, 2);
       g.fillRect(x+ 426,y+112 , 2, 2);
       g.fillRect(x+ 428,y+114 , 2, 2);
       g.fillRect(x+ 426,y+116 , 2, 2);
       g.fillRect(x+ 424,y+118 , 2, 2);
       
       g.fillRect(x+ 434,y+110 , 2, 2);
       g.fillRect(x+ 436,y+112 , 2, 2);
       g.fillRect(x+ 438,y+114 , 2, 2);
       g.fillRect(x+ 436,y+116 , 2, 2);
       g.fillRect(x+ 434,y+118 , 2, 2);
       
       
       g.fillOval(x+312, y+90,10,10);
       g.fillOval(x+352, y+90,10,10);
       g.fillOval(x+392, y+90,10,10);
       g.fillOval(x+432, y+90,10,10);
       
       g.setColor(my_red);
       g.fillOval(x+440, y+92,5,5);
       
       
       g.setColor(Color.BLACK);
       g.fillRect(x+ 250,y+105 , 190, 2);
       
       
       
       //santa
      g.setColor(my_beige);
      
      g.fillOval(x+230, y+65, 20, 20);
      
      g.setColor(Color.WHITE);
      g.fillOval(x+230, y+65, 5, 5);
      g.fillOval(x+235, y+65, 5, 5);
      g.fillOval(x+240, y+65, 5, 5);
      g.fillOval(x+245, y+65, 5, 5);
      g.fillOval(x+237, y+52, 5, 5);
      
      
      g.setColor(my_red);
      
      g.fillRect(x+230,y+65, 20,2);
      g.fillRect(x+232,y+63, 16,2);
      g.fillRect(x+234,y+61, 12,2);
      g.fillRect(x+236,y+59, 8,2);
      g.fillRect(x+238,y+57, 4,2);
      
      g.setColor(Color.BLACK);
      g.fillOval(x+245, y+73, 3, 3);

 }// end show
    

    
}// end class
