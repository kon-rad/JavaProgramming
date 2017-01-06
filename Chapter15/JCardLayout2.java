/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 05, 2017 
 * Chapter: 15
 * Page: 825
 * Title: Java Programming: Level II 
 *
 * You Do It
 * Viewing All the Cards in CardLayout
 * 
 * 
 * 
 */   
import javax.swing.*; 
import java.awt.event.*;
import java.awt.*; 
 
public class JCardLayout2 extends JFrame implements ActionListener
{  
    // Data Fields 
    private JButton nb = new JButton("North");
    private JButton sb = new JButton("South");
    private JButton eb = new JButton("East");
    private JButton wb = new JButton("West");
    private JButton cb = new JButton("Center");
    CardLayout cardLayout = new CardLayout();
    
    public JCardLayout2() 
    {
        // Create JFrame
        setLayout(cardLayout); 
        add("south", sb);
        add("north", nb);
        add("east", eb);
        add("west", wb);
        add("center", cb);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        
        // initiate ActionListener
        nb.addActionListener(this);
        sb.addActionListener(this);
        eb.addActionListener(this);
        wb.addActionListener(this);
        cb.addActionListener(this);  
    }
    public void actionPerformed(ActionEvent e)
    {
        cardLayout.next(getContentPane());
    }
    
    public static void main(String[] args)
    { 
         // Run Application
         JCardLayout2 jbl = new JCardLayout2();
         jbl.setSize(250, 250);
         jbl.setVisible(true);
    } 
}
