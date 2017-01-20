/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 19, 2017 
 * Chapter: 17
 * Page: 973
 * Title: Java Programming: Level II 
 *
 * You Do It
 * Bear Gif
 * 
 */   
import javax.swing.*;  
import java.awt.*; 
import java.awt.event.*;


public class JBear extends JApplet implements ActionListener
{  
    // Data Fields 
    private ImageIcon image = new ImageIcon("bear.gif");
    private JButton closerButton = new JButton("Oh my!");
    private int width, height;
    Container con = getContentPane();
    
    public void init() 
    {
        con.setLayout(new FlowLayout());
        closerButton.addActionListener(this);
        con.add(closerButton);
        width = image.getIconWidth();
        height = image.getIconHeight();
    }
    public void actionPerformed(ActionEvent event)
    {
        width = width * 2;
        height = height * 2;
        repaint();
    }
    public void paint(Graphics g) 
    {
        super.paint(g);
        g.drawImage(image.getImage(), 0, 0, width, height, this);
    }
}
