
/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 10, 2017 
 * Chapter: 16
 * Page: 937
 * Exercise 5
 * Title: Java Programming: Level II 
 *
 * Description:
 * Write an application that extends JFrame and that displays 15 nested circles,
 * like those in Figure 16-39. You may use only one drawOval()
 * statement in the program. Save the file as JNestedCircles.java
 * 
 * 
 */   
import javax.swing.*;  
import java.awt.*; 


public class JNestedCirlces extends JFrame 
{  
    final int CHANGE = 10;
    int i, x = 50, y = 50, width = 300, height = 300;
    
    public JNestedCirlces() 
    {
        super("Nested Circles Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
        
    public void paint(Graphics pen) 
    {
        super.paint(pen);
        for (i = 0; i <= 15; ++i) 
        {
            pen.drawOval(x + (CHANGE * i), y + (CHANGE * i),
                width - (CHANGE * i * 2), height - (CHANGE * i * 2)); 
        }
    } 
    
    public static void main(String[] args)
    { 
         // Run Application
         JNestedCirlces jnc= new JNestedCirlces();
         jnc.setSize(400, 400);
         jnc.setVisible(true);
    } 
}
