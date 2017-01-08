/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 07, 2017 
 * Chapter: 15
 * Page: 870
 * Exercise 4
 * Title: Java Programming: Level II 
 *
 * Description:
 * Create a JFrame that uses BorderLayout. Place a JButton in the center region.
 * Each time the user clicks the JButton, change the background color in one of 
 * the other regions. Save the file as JColorFrame.java.
 * 
 * 
 * 
 */   
import javax.swing.*;  
import java.awt.*; 
import java.awt.event.*;
import java.awt.Color;


public class JColorFrame  extends JFrame implements ActionListener
{  
    // Data Fields 
    private JButton cb = new JButton("Click me");
    private JPanel np = new JPanel();
    private JPanel ep = new JPanel();
    private JPanel sp = new JPanel();
    private JPanel wp = new JPanel();
    
    public JColorFrame() 
    {
        super("Color Frame Application");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        np.setPreferredSize(new Dimension(400, 75));
        ep.setPreferredSize(new Dimension(75, 400));
        sp.setPreferredSize(new Dimension(400, 75));
        wp.setPreferredSize(new Dimension(75, 400));;
        add(np, BorderLayout.NORTH);
        add(ep, BorderLayout.EAST);
        add(sp, BorderLayout.SOUTH);
        add(wp, BorderLayout.WEST);
        add(cb, BorderLayout.CENTER);
        cb.addActionListener(this);
            
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        int randomPanel = (int) (Math.random() * 4);
        switch(randomPanel) {
            case 0:
                np.setBackground(randomColor());
                break;
             case 1:
                 ep.setBackground(randomColor());
                 break;
             case 2:
                 sp.setBackground(randomColor());
                 break;
             case 3:
                 wp.setBackground(randomColor());
                 break;
         }
    }
    
    public Color randomColor() 
    {
        // Create random color
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        Color color = new Color(r, g, b);
        return color;
    } 
    
    public static void main(String[] args)
    { 
         // Run Application
         JColorFrame jcf = new JColorFrame();
         jcf.setSize(400, 400);
         jcf.setVisible(true);
    } 
}
