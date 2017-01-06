/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 05, 2017 
 * Chapter: 15
 * Page: 818
 * Title: Java Programming: Level II 
 *
 * You Do It
 * Using BorderLayout
 * 
 * 
 * 
 */   
import javax.swing.*; 
import java.awt.*; 
 
public class JBorderLayoutNoNorth extends JFrame {  
    // Data Fields 
    private JButton sb = new JButton("South");
    private JButton eb = new JButton("East");
    private JButton wb = new JButton("West");
    private JButton cb = new JButton("Center");
    
    public JBorderLayoutNoNorth() 
    {
        // Create JFrame
        setLayout(new BorderLayout()); 
        add(sb, BorderLayout.SOUTH);
        add(eb, BorderLayout.EAST);
        add(wb, BorderLayout.WEST);
        add(cb, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
    }
    
    public static void main(String[] args)
    { 
         // Run Application
         JBorderLayoutNoNorth jbl = new JBorderLayoutNoNorth();
         jbl.setSize(250, 250);
         jbl.setVisible(true);
    } 
}
