/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 07, 2017 
 * Chapter: 15
 * Page: 870
 * Exercise 7
 * Title: Java Programming: Level II 
 *
 * Description:
 * Write an application that lets you determine the integer value returned 
 * by the InputEvent method getModifiers() when you click your left, right, 
 * or if you have one, middle mouse button on a JFrame. Save the file as 
 * JLeftOrRight.java
 * 
 * 
 */   
import javax.swing.*;  
import java.awt.*; 
import java.awt.event.*;


public class JLeftOrRight  extends JFrame implements MouseListener
{  
    // Data Fields 
    private JLabel label = new JLabel("Click on this screen with any mouse button...");
    
    
    public JLeftOrRight() 
    {
        // Create Frame
        super("Left or Right Mouse Click Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(label);
        addMouseListener(this);
    }
    
    public void mouseClicked(MouseEvent e) 
    {
        // Change label to display message on which mouse button was clicked 
        int button = e.getModifiers();
        String msg = "";
        if (button == e.BUTTON1_MASK)
            msg += "You clicked the left mouse button. Modifier: " + button + ". ";
        else if(button == e.BUTTON2_MASK) 
            msg += "You clicked the middle mouse button. Modifier: " + button + ".";
        else if (button == e.BUTTON3_MASK) 
            msg += "You clicked the right mouse button. Modifier:  " + button + ".";
        label.setText(msg);
    }
    public void mouseEntered(MouseEvent e) 
    {
    }
    public void mouseExited(MouseEvent e)
    {
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
         JLeftOrRight jlor = new JLeftOrRight();
         jlor.setSize(400, 400);
         jlor.setVisible(true);
    } 
}
