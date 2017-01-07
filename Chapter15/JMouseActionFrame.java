/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 05, 2017 
 * Chapter: 15
 * Page: 848
 * Title: Java Programming: Level II 
 *
 * JMouseActionFrame
 * 
 * 
 * 
 */   
import javax.swing.*; 
import java.awt.event.*;
import java.awt.*; 
 
public class JMouseActionFrame extends JFrame implements MouseListener
{  
    // Data Fields 
    private int x, y;
    private JLabel label = new JLabel("Do something with the mouse.");
    String msg = ""; 
    
    public JMouseActionFrame() 
    {
        // Create JFrame
        super("Mouse Actions");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(new FlowLayout());
        addMouseListener(this);
        add(label);
    }
    
    public void mouseClicked(MouseEvent e)
    {
        int whichButton = e.getButton();
        msg = "You pressed mouse ";
        if(whichButton == MouseEvent.BUTTON1)
            msg += "button 1";
        else 
            if (whichButton == e.BUTTON2)
                msg += "button 2";
            else 
                msg += "button 3";
        msg += " You are at position " + e.getX() + ", " + e.getY() + ".";
        if(e.getClickCount() == 2)
            msg += " You double clicked.";
        else 
            msg += " You single clicked.";
        label.setText(msg); 
    }
    public void mouseEntered(MouseEvent e)
    {
        msg = "You entered the frame.";
        label.setText(msg);
    }
    public void mouseExited(MouseEvent e)
    {
        msg = "You exited the frame.";
        label.setText(msg);
    }
    public void mousePressed(MouseEvent e)
    {
    }
    public void mouseReleased(MouseEvent e)
    {
    }
    
    public static void main(String[] args)
    { 
         // Run Application
         JMouseActionFrame jbl = new JMouseActionFrame();
         final int WIDTH = 750;
         final int HEIGHT = 300;
         jbl.setSize(WIDTH, HEIGHT);
         jbl.setVisible(true);
    } 
}
