/*
Daniel Balser
Background 
 */
package nb.test.gamepackagev1;

import java.awt.*;

public class Background {//start class
    private int x=0;
    private int y=0;  
    private Object g;
    
    static Color my_light_gray = new Color(211,211,211);  
    static Color my_gray = new Color(150,150,150); 
    
    public Background (int x, int y){// start background method  
    this.x=x;
    this.y=y;
    }// end background method
 
    void show(Graphics g) {//start show
    
        
        // snow on ground
        g.setColor(Color.WHITE);
        g.fillRect(x+0, y+400, 500, 100);
        g.fillOval(x+0, y+395, 10, 10);
        g.fillOval(x+10, y+395, 10, 10);
        g.fillOval(x+20, y+395, 10, 10);
        g.fillOval(x+30, y+395, 10, 10); 
        g.fillOval(x+40, y+395, 10, 10);
        g.fillOval(x+50, y+395, 10, 10);
        g.fillOval(x+60, y+395, 10, 10);
        g.fillOval(x+70, y+395, 10, 10);
        g.fillOval(x+80, y+395, 10, 10);
        g.fillOval(x+90, y+395, 10, 10);
        g.fillOval(x+100, y+395, 10, 10);
        g.fillOval(x+110, y+395, 10, 10);
        g.fillOval(x+120, y+395, 10, 10);
        g.fillOval(x+130, y+395, 10, 10);
        g.fillOval(x+140, y+395, 10, 10);
        g.fillOval(x+150, y+395, 10, 10);
        g.fillOval(x+160, y+395, 10, 10);
        g.fillOval(x+170, y+395, 10, 10);
        g.fillOval(x+180, y+395, 10, 10);
        g.fillOval(x+190, y+395, 10, 10);
        g.fillOval(x+200, y+395, 10, 10);
        g.fillOval(x+210, y+395, 10, 10);
        g.fillOval(x+220, y+395, 10, 10);
        g.fillOval(x+230, y+395, 10, 10);
        g.fillOval(x+240, y+395, 10, 10);
        g.fillOval(x+250, y+395, 10, 10);
        g.fillOval(x+260, y+395, 10, 10);
        g.fillOval(x+270, y+395, 10, 10);
        g.fillOval(x+475, y+395, 10, 10);
        g.fillOval(x+485, y+395, 10, 10);
        g.fillOval(x+495, y+395, 10, 10);
        
        //snow in sky
        g.setColor(Color.WHITE);
         g.fillOval(x+110, y+110, 5,5);
         g.fillOval(x+210, y+150, 5,5);
         g.fillOval(x+110, y+65, 5,5);
         g.fillOval(x+180, y+10, 5,5);
         g.fillOval(x+80, y+365, 5,5);
         g.fillOval(x+30, y+200, 5,5);
         g.fillOval(x+50, y+190, 5,5);
         g.fillOval(x+70, y+220, 5,5);
         g.fillOval(x+330, y+10, 5,5);
         g.fillOval(x+250, y+100, 5,5);
         g.fillOval(x+390, y+330, 5,5);
         g.fillOval(x+290, y+90, 5,5);
         g.fillOval(x+260, y+410, 5,5);
         g.fillOval(x+380, y+280, 5,5);
         g.fillOval(x+360, y+120, 5,5);
         g.fillOval(x+190, y+340, 5,5);
         g.fillOval(x+170, y+220, 5,5);
         g.fillOval(x+360, y+110, 5,5);
         g.fillOval(x+290, y+190, 5,5);
         g.fillOval(x+155, y+260, 5,5);
         g.fillOval(x+120, y+340, 5,5);
         g.fillOval(x+420, y+200, 5,5);
         g.fillOval(x+460, y+250, 5,5);
         g.fillOval(x+450, y+270, 5,5);
         g.fillOval(x+470, y+285, 5,5);
         g.fillOval(x+490, y+250, 5,5);
         g.fillOval(x+110, y+190, 5,5);
        
       
        //moon
        g.setColor(my_light_gray);
        g.fillOval(x+50, y+50, 50, 50);
        
        g.setColor(my_gray);
        
        g.fillOval(x+55, y+55, 15, 15);
        g.fillOval(x+65, y+60, 15, 15);
        g.fillOval(x+80, y+75, 15, 15);
        g.fillOval(x+75, y+85, 15, 15);
        
     
    }// end show
}//start class
