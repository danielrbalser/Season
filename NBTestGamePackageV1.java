/*
Daniel Balser
Season's Project
*/
package nb.test.gamepackagev1;
import edu.sjcny.gpv1.*;
import java.awt.*;


public class NBTestGamePackageV1 extends DrawableAdapter
{  // start class 
    static NBTestGamePackageV1 ge = new NBTestGamePackageV1(); 
    static GameBoard gb = new GameBoard(ge, "Winter Night");
   
    static House Gary_House = new House(0,0);
    static Background BG= new Background (0,0);
    static Car Truck= new Car(0,0);
    static Tree Green= new Tree(0,0);
    static Santa x_mas= new Santa(0,0);
    
    static Color my_blue = new Color(7,7,93); 
    public static void main(String[] args) { // start main    
        gb.setBackground(my_blue);  
        showGameBoard(gb);
  
    }   //end main
    public void draw(Graphics g) {// start draw
        
        BG.show(g); 
        Gary_House.show(g); 
        Green.show(g);
        Truck.show(g);
        x_mas.show(g);
        
            
          
    }// end draw
    
}// end class
 
