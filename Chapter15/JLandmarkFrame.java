/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 06, 2017 
 * Chapter: 15
 * Page: 870
 * Exercise 1
 * Title: Java Programming: Level II 
 *
 * Description:
 * Create a JFrame, and set the layout to BorderLayout. Place a JButton in each region, 
 * and place the name of an appropriate United States landmark on each JButton. For 
 * example, New York's Statue of Liberty might be the landmark in the east region.
 * Save the file as JLandmarkFrame.java.
 * 
 * 
 * 
 */   
import javax.swing.*;  
import java.awt.*; 

public class JLandmarkFrame extends JFrame 
{  
    // Data Fields 
    private JButton nb = new JButton("Gateway Arch");
    private JButton eb = new JButton("Lincoln Memorial");
    private JButton sb = new JButton("The Alamo");
    private JButton wb = new JButton("Golden Gate Bridge");
    
     
    
    public JLandmarkFrame()
    {
        // Create JFrame
        setLayout(new BorderLayout());
        add(nb, BorderLayout.NORTH);
        add(eb, BorderLayout.EAST);
        add(sb, BorderLayout.SOUTH);
        add(wb, BorderLayout.WEST);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    } 
    
    public static void main(String[] args)
    { 
         // Run Application
         JLandmarkFrame jlmf = new JLandmarkFrame();
         jlmf.setSize(400, 400);
         jlmf.setVisible(true);
    } 
}
