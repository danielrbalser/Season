/*
Daniel Balser
House
 */
package nb.test.gamepackagev1;

import java.awt.*;

public class House {// start class
    private int x=0;
    private int y=0;
    
    
    static Color my_brown = new Color(188,158,130); 
    static Color my_dark_gray = new Color(43,45,47); 
    
    public House(int x, int y){// start House method
        this.x=x;
        this.y=y;
    }//end House method
    
    public void show (Graphics g){// start show
       

        g.setColor(my_brown);
     
        g.fillRect(x+300, y+300, 175, 100);
        
       
       
        g.fillRect(x+300, y+298, 45, 2);
        g.fillRect(x+302, y+296, 41, 2);
        g.fillRect(x+304, y+294, 38, 2);
        g.fillRect(x+306, y+292, 34, 2);
        g.fillRect(x+308, y+290, 30, 2);
        g.fillRect(x+310, y+288, 26, 2);
        g.fillRect(x+312, y+286, 22, 2);
        g.fillRect(x+314, y+284, 18, 2);
        g.fillRect(x+316, y+282, 14, 2);
        g.fillRect(x+318, y+280, 10, 2);
        g.fillRect(x+320, y+278, 6, 2);
        g.fillRect(x+322, y+276, 2, 2);

        g.fillRect(x+345, y+298, 85, 2);
        g.fillRect(x+347, y+296, 81, 2);
        g.fillRect(x+349, y+294, 77, 2);
        g.fillRect(x+351, y+292, 73, 2);
        g.fillRect(x+353, y+290, 69, 2);
        g.fillRect(x+355, y+288, 65, 2);
        g.fillRect(x+357, y+286, 61, 2);
        g.fillRect(x+359, y+284, 57, 2);
        g.fillRect(x+361, y+282, 53, 2);
        g.fillRect(x+363, y+280, 49, 2);
        g.fillRect(x+365, y+278, 45, 2);
        g.fillRect(x+367, y+276, 41, 2);
        g.fillRect(x+369, y+274, 37, 2);
        g.fillRect(x+371, y+272, 33, 2);
        g.fillRect(x+373, y+270, 29, 2);
        g.fillRect(x+375, y+268, 25, 2);
        g.fillRect(x+377, y+266, 21, 2);
        g.fillRect(x+379, y+264, 17, 2);
        g.fillRect(x+381, y+262, 13, 2);
        g.fillRect(x+383, y+260, 9, 2);
        g.fillRect(x+385, y+258, 5, 2);
        g.fillRect(x+387, y+256, 1, 2);
        
        g.fillRect(x+430, y+298, 45, 2);
        g.fillRect(x+432, y+296, 41, 2);
        g.fillRect(x+434, y+294, 38, 2);
        g.fillRect(x+436, y+292, 34, 2);
        g.fillRect(x+438, y+290, 30, 2);
        g.fillRect(x+440, y+288, 26, 2);
        g.fillRect(x+442, y+286, 22, 2);
        g.fillRect(x+444, y+284, 18, 2);
        g.fillRect(x+446, y+282, 14, 2);
        g.fillRect(x+448, y+280, 10, 2);
        g.fillRect(x+450, y+278, 6, 2);
        g.fillRect(x+452, y+276, 2, 2);
        
        g.setColor(Color.BLACK);
        
        g.fillRect(x+299, y+298, 3, 100);
              
            g.fillRect(x+301, y+300, 15, 2);
            g.fillRect(x+301, y+302, 11, 2);
            g.fillRect(x+301, y+304, 7, 2);
            g.fillRect(x+301, y+306, 3, 2);
            g.fillRect(x+330, y+300, 15, 2);
            g.fillRect(x+334, y+302, 11, 2);
            g.fillRect(x+338, y+304, 7, 2);
            g.fillRect(x+342, y+306, 3, 2);
        
        g.fillRect(x+344, y+298, 3, 100);
                
            g.fillRect(x+345, y+300, 35, 2);
            g.fillRect(x+345, y+302, 25, 2);
            g.fillRect(x+345, y+304, 19, 2);
            g.fillRect(x+345, y+306, 14, 2);
            g.fillRect(x+345, y+308, 10, 2);
            g.fillRect(x+345, y+310, 6, 2);
            g.fillRect(x+395, y+300, 35, 2);
            g.fillRect(x+405, y+302, 25, 2);
            g.fillRect(x+411, y+304, 19, 2);
            g.fillRect(x+416, y+306, 14, 2);
            g.fillRect(x+420, y+308, 10, 2);
            g.fillRect(x+424, y+310, 6, 2);

            
        g.fillRect(x+429, y+298, 3, 100);
               
            g.fillRect(x+431, y+300, 15, 2);
            g.fillRect(x+431, y+302, 11, 2);
            g.fillRect(x+431, y+304, 7, 2);
            g.fillRect(x+431, y+306, 3, 2);
            g.fillRect(x+460, y+300, 15, 2);
            g.fillRect(x+464, y+302, 11, 2);
            g.fillRect(x+468, y+304, 7, 2);
            g.fillRect(x+472, y+306, 3, 2);     
               
         g.fillRect(x+474, y+298, 3, 100);
        
         
        //horizontal bar  
        g.fillRect(x+300, y+298, 175, 3); 
       
        //stone at bottom of poles
        g.fillRect(x+427, y+395, 7, 5);  
        g.fillRect(x+472, y+395, 7, 5);
        g.fillRect(x+342, y+395, 7, 5);
        g.fillRect(x+298, y+395, 7, 5);
        
        //windows
        g.setColor(Color.WHITE);
        
        g.fillOval(x+305, y+320, 15,15);
            g.fillRect(123, 332, 1, 1);
            g.fillRect(x, y, x, x);
            
        g.fillOval(x+325, y+320, 15,15);
            g.fillRect(x, y, x, x);
            g.fillRect(x, y, x, x);
        
        g.fillOval(x+305, y+365, 15,15);
            g.fillRect(x, y, x, x);
            g.fillRect(x, y, x, x);

        g.fillOval(x+325, y+365, 15,15);
            g.fillRect(x, y, x, x);
            g.fillRect(x, y, x, x);


        g.fillOval(x+435, y+320, 15,15);
            g.fillRect(x, y, x, x);
            g.fillRect(x, y, x, x);

        g.fillOval(x+455, y+320, 15,15);
            g.fillRect(x, y, x, x);
            g.fillRect(x, y, x, x);

        g.fillOval(x+435, y+365, 15,15);
            g.fillRect(x, y, x, x);
            g.fillRect(x, y, x, x);

        g.fillOval(x+455, y+365, 15,15);
            g.fillRect(x, y, x, x);
            g.fillRect(x, y, x, x);

        
        g.fillOval(x+362, y+320, 50,30);
            g.fillRect(x, y, x, x);
            g.fillRect(x, y, x, x);
            
        g.setColor(Color.BLACK);
        g.fillRect(x+306, y+327, 14, 1);
        g.fillRect(x+326, y+327, 14, 1);
        g.fillRect(x+306, y+372, 14, 1);
        g.fillRect(x+326, y+372, 14, 1);
        g.fillRect(x+436, y+327, 14, 1);
        g.fillRect(x+456, y+327, 14, 1);
        g.fillRect(x+436, y+372, 14, 1);
        g.fillRect(x+456, y+372, 14, 1);   
        g.fillRect(x+312, y+366, 1, 14);
        g.fillRect(x+332, y+366, 1, 14);
        g.fillRect(x+312, y+321, 1, 14);
        g.fillRect(x+332, y+321, 1, 14);
        g.fillRect(x+442, y+366, 1, 14);
        g.fillRect(x+462, y+366, 1, 14); 
        g.fillRect(x+442, y+321, 1, 14);
        g.fillRect(x+462, y+321, 1, 14);
        
        g.fillRect(x+369, y+325, 38, 1);
        g.fillRect(x+369, y+345, 38, 1);
        g.fillRect(x+363, y+335, 50, 1);
        g.fillRect(x+369, y+325, 1, 20);
        g.fillRect(x+387, y+320, 1, 30);
        g.fillRect(x+405, y+325, 1, 20);
        
        //doors
        g.setColor(Color.BLACK);
        g.fillRect(x+372, y+360, 30, 40);
        
        g.setColor(Color.WHITE);
        g.fillRect(x+375, y+365, 7, 20);
        g.fillRect(x+392, y+365, 7, 20);
        g.fillRect(x+386, y+360, 2, 40);
        g.fillRect(x+372, y+360, 1, 40);
        g.fillRect(x+402, y+360, 1, 40);
        g.fillRect(x+372, y+360, 30, 1);
        
        //garage
        g.setColor(my_brown);
        g.fillRect(x+296, y+338, 3,2);
        g.fillRect(x+294, y+340, 5,2);
        g.fillRect(x+292, y+342, 7,2);
        g.fillRect(x+290, y+344, 9,2);
        g.fillRect(x+288, y+346, 11,2);
        g.fillRect(x+286, y+348, 13,2);
        g.fillRect(x+284, y+350, 15,2);
        g.fillRect(x+282, y+352, 17,2);
        g.fillRect(x+280, y+354, 19,2);
        g.fillRect(x+278, y+356, 21,2);
        g.fillRect(x+276, y+358, 23,2);
        g.fillRect(x+274, y+360, 25,2);
        g.fillRect(x+272, y+362, 27,2);
        g.fillRect(x+270, y+364, 29,2);
        g.fillRect(x+268, y+366, 31,2);
        g.fillRect(x+268, y+366, 31,34);

        g.setColor(Color.BLACK);
        g.fillRect(x+272, y+370, 23,29);
        
        g.setColor(Color.WHITE);
        g.fillRect(x+272, y+374, 5,4);
        g.fillRect(x+280, y+374, 7,4);
        g.fillRect(x+290, y+374, 5,4);
        g.fillRect(x+272, y+398, 23,2);

        
        
        //driveway, road and walkway
        g.setColor(Color.BLACK);
        g.fillRect(x+272, y+400, 23,10);
        g.fillRect(x+270, y+410, 27,10);
        g.fillRect(x+268, y+420, 31,10);
        g.fillRect(x+266, y+430, 35,10);
        g.fillRect(x+264, y+440, 39,10);
        g.fillRect(x+262, y+450, 43,10);
       
        g.fillRect(x+372, y+400, 30, 6);
        g.fillRect(x+370, y+406, 30, 2); 
        g.fillRect(x+368, y+408, 30, 2);        
        g.fillRect(x+366, y+410, 30, 2);    
        g.fillRect(x+364, y+412, 30, 2);
        g.fillRect(x+272, y+414, 120, 6);
        
        
        g.setColor(my_dark_gray);
        g.fillRect(x+0, y+460, 500,50);
        
        g.setColor(Color.WHITE);
        g.fillRect(x+0, y+495, 30, 5);
        g.fillRect(x+90, y+495, 30, 5);
        g.fillRect(x+180, y+495, 30, 5);
        g.fillRect(x+270, y+495, 30, 5);
        g.fillRect(x+360, y+495, 30, 5);
        g.fillRect(x+450, y+495, 30, 5);
 
        g.fillRect(x+262, y+458,43 , 2);
        
        
        //lights
        
        g.setColor(Color.YELLOW);
        
        g.fillOval(x+265, y+365, 4, 4);
        g.fillOval(x+270, y+360, 4, 4);
        g.fillOval(x+275, y+355, 4, 4);
        g.fillOval(x+280, y+350, 4, 4);
        g.fillOval(x+285, y+345, 4, 4);
        g.fillOval(x+290, y+340, 4, 4);
        g.fillOval(x+295, y+335, 4, 4);
        g.fillOval(x+300, y+295, 4, 4);
        g.fillOval(x+305, y+290, 4, 4);
        g.fillOval(x+310, y+285, 4, 4);
        g.fillOval(x+315, y+280, 4, 4);
        g.fillOval(x+320, y+275, 4, 4);
        g.fillOval(x+325, y+280, 4, 4);
        g.fillOval(x+330, y+285, 4, 4);
        g.fillOval(x+335, y+290, 4, 4);
        g.fillOval(x+340, y+295, 4, 4);
        g.fillOval(x+345, y+295, 4, 4);
        g.fillOval(x+350, y+290, 4, 4);
        g.fillOval(x+355, y+285, 4, 4);
        g.fillOval(x+360, y+280, 4, 4);
        g.fillOval(x+365, y+275, 4, 4);
        g.fillOval(x+370, y+270, 4, 4);
        g.fillOval(x+375, y+265, 4, 4);
        g.fillOval(x+380, y+260, 4, 4);
        g.fillOval(x+385, y+255, 4, 4);
        g.fillOval(x+390, y+260, 4, 4);
        g.fillOval(x+395, y+265, 4, 4);
        g.fillOval(x+400, y+270, 4, 4);
        g.fillOval(x+405, y+275, 4, 4);
        g.fillOval(x+410, y+280, 4, 4);
        g.fillOval(x+415, y+285, 4, 4);
        g.fillOval(x+420, y+290, 4, 4);
        g.fillOval(x+425, y+295, 4, 4);
        g.fillOval(x+430, y+295, 4, 4);
        g.fillOval(x+435, y+290, 4, 4);
        g.fillOval(x+440, y+285, 4, 4);
        g.fillOval(x+445, y+280, 4, 4);
        g.fillOval(x+450, y+275, 4, 4);
        g.fillOval(x+455, y+280, 4, 4);
        g.fillOval(x+460, y+285, 4, 4);
        g.fillOval(x+465, y+290, 4, 4);
        g.fillOval(x+470, y+295, 4, 4);        
        
   
        
    }// end show
    
    
}// end class
