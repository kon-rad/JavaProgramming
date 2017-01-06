/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 05, 2017 
 * Chapter: 15
 * Page: 824
 * Title: Java Programming: Level II 
 *
 * You Do It
 * Using CardLayout
 * 
 * 
 * 
 */   
import javax.swing.*; 
import java.awt.*; 
 
public class JCardLayout extends JFrame {  
    // Data Fields 
    private JButton nb = new JButton("North");
    private JButton sb = new JButton("South");
    private JButton eb = new JButton("East");
    private JButton wb = new JButton("West");
    private JButton cb = new JButton("Center");
    
    public JCardLayout() 
    {
        // Create JFrame
        setLayout(new CardLayout()); 
        add("south", sb);
        add("north", nb);
        add("east", eb);
        add("west", wb);
        add("center", cb);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
    }
    
    public static void main(String[] args)
    { 
         // Run Application
         JCardLayout jbl = new JCardLayout();
         jbl.setSize(250, 250);
         jbl.setVisible(true);
    } 
}
