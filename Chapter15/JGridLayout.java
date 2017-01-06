/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 05, 2017 
 * Chapter: 15
 * Page: 822
 * Title: Java Programming: Level II 
 *
 * You Do It
 * Using GridLayout
 * 
 * 
 * 
 */   
import javax.swing.*; 
import java.awt.*; 
 
public class JGridLayout extends JFrame {  
    // Data Fields 
    private JButton nb = new JButton("North");
    private JButton sb = new JButton("South");
    private JButton eb = new JButton("East");
    private JButton wb = new JButton("West");
    private JButton cb = new JButton("Center");
    
    public JGridLayout() 
    {
        // Create JFrame
        setLayout(new GridLayout(2, 3, 2, 4)); 
        add(sb);
        add(nb);
        add(eb);
        add(wb);
        add(cb);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
    }
    
    public static void main(String[] args)
    { 
         // Run Application
         JGridLayout jbl = new JGridLayout();
         jbl.setSize(250, 250);
         jbl.setVisible(true);
    } 
}
