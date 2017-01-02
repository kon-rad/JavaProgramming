/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: December 31, 2016 
 * Chapter: 14
 * Page: 797
 * Exercise: 3
 * Title: Java Programming: Level II 
 *
 * Description:
 * Create an application with a JFrame and five labels that contain 
 * the names of five friends. Every time the user clicks a JButton, remove 
 * one of the labels and add a different one. Save the file as 
 * JDisappearingFriends.java.
 * 
 * 
 */   
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
 
public class JDisappearingFriends extends JFrame implements ActionListener
{   
    // Data Fields, labels and buttons
    int count = 0; 
    JLabel friend1 = new JLabel("London");
    JLabel friend2 = new JLabel("Woody");
    JLabel friend3 = new JLabel("Robert");
    JLabel friend4 = new JLabel("Leonard");
    JLabel friend5 = new JLabel("Dylan");
    JLabel friend6 = new JLabel("John"); 
    JButton button = new JButton("OK");
    
    public JDisappearingFriends()
    {
       // Create JFrame
       super("Friends");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(new FlowLayout());
       
       // Add Labels and button, set one to invisible
       add(friend1);
       add(friend2);
       add(friend3);
       add(friend4);
       add(friend5);
       add(friend6);
       friend6.setVisible(false);
       add(button);
       
       //Add action listener
       button.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        // Create Actioin listener logic
        if(count == 0)
        {
            friend1.setVisible(false);
            friend6.setVisible(true);
            count = 1; 
        }
        else if (count == 1)
        {
            friend2.setVisible(false);
            friend1.setVisible(true);
            count = 2;
        }
        else if(count == 2)
        {
            friend3.setVisible(false);
            friend2.setVisible(true);
            count = 3;
        } 
        else if(count == 3)
        {
            friend4.setVisible(false);
            friend3.setVisible(true);
            count = 4;
        } 
        else if(count == 4)
        {
            friend5.setVisible(false);
            friend4.setVisible(true);
            count = 5;
        } 
        else if(count == 5)
        {
            friend6.setVisible(false);
            friend5.setVisible(true);
            count = 0;
        } 
    }
    
    public static void main(String[] args)
    {
        // Run JDisappearingFriends Application
         JDisappearingFriends aFrame = new JDisappearingFriends();
         final int WIDTH = 300;
         final int HEIGHT = 200;
         aFrame.setSize(WIDTH, HEIGHT);
         aFrame.setVisible(true);
    } 
}





 









