/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 10, 2017 
 * Chapter: 16
 * Page: 936
 * Exercise 1
 * Title: Java Programming: Level II 
 *
 * Description:
 * Write an application that extends JFrame and that displays a phrase in every 
 * font size from 6 through 20. Save the file as JFontSizes.java.
 * 
 * 
 */   
import javax.swing.*;  
import java.awt.*; 


public class JFontSizes extends JFrame 
{  
    // Data Fields 
    String phrase = new String("At the still point, there the dance is");
    int y = 25;
    final int X = 25;
    final int INCREASE = 25;
    int i;
    
    public JFontSizes() 
    {
        super("Font Sizes Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
        
    public void paint(Graphics pen) 
    {
        super.paint(pen);
        for (i = 6; i <= 20; ++i) 
        {
            Font arial = new Font("Arial", Font.PLAIN, i);
            pen.setFont(arial);
            pen.drawString(phrase, X, y += INCREASE);
        }
    } 
    
    public static void main(String[] args)
    { 
         // Run Application
         JFontSizes jvc= new JFontSizes();
         jvc.setSize(400, 500);
         jvc.setVisible(true);
    } 
}
