/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 05, 2017 
 * Chapter: 15
 * Page: 835
 * Title: Java Programming: Level II 
 *
 * JScrollDemo
 * 
 * 
 * 
 */   
import javax.swing.*; 
import java.awt.event.*;
import java.awt.*; 
 
public class JScrollDemo extends JFrame
{  
    // Data Fields 
    private JPanel panel = new JPanel();
    private JScrollPane scroll = new JScrollPane(panel, 
        ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
        ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
    private JLabel label = new JLabel("Four score and seven");
    private Font bigFont = new Font("Arial", Font.PLAIN, 20);
    private Container con;

    
    public JScrollDemo() 
    {
        // Create JFrame
        super("JScrollDemo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        con = getContentPane();
        label.setFont(bigFont);
        con.add(scroll);
        panel.add(label);
    }
    
    public static void main(String[] args)
    { 
         // Run Application
         JScrollDemo jbl = new JScrollDemo();
         final int WIDTH = 180;
         final int HEIGHT = 100;
         jbl.setSize(WIDTH, HEIGHT);
         jbl.setVisible(true);
    } 
}
