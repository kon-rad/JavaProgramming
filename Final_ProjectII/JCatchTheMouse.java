/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 26, 2017 
 * Final Project
 * Page: 872
 * Chapter 15, Game Zone 2 (Part A only)
 * Title: Java Programming: Level II 
 *
 * Description:
 * Create a game that helps new mouse users improve their hand-eye coordination.
 * Within a JFrame, display an array of 48 JPanels in a GridLayout using eight rows
 * and six columns. Randomly display an X on one of the panels. When the user
 * clicks the correct panel (the one displaying the X), remove the X and display
 * it on a different panel. After the user successfully "hits" the correct panel
 * 10 times, display a congratulatory message that includes the user's percentage
 * (hits divided by clicks). Save the file as JCatchTheMouse.java
 *
 * Additional requirements are as follows:
 * 1. Use 48 JButtons instead of an array of 48 JPanels.
 * 2. Once the user clicks on the tenth correct button, display your name, course,
 * section number, and MEID by using a JOptionPane message dialog.
 * 
 * 
 */ 
   
import javax.swing.*;  
import java.awt.*; 
import java.awt.event.*;


public class JCatchTheMouse extends JFrame implements ActionListener
{  
    int random = 0, i = 0, count = 0, correct = 0, incorrect = 0, percentage = 0; 
    private JLabel resultLabel = new JLabel("");
    private JLabel mainLabel = new JLabel("Click on the buton with the X ten times");
    private GridLayout layout = new GridLayout(8, 6, 5, 5);
    private Container con = getContentPane();
    private JButton[] buttons = new JButton[48];
    private JPanel top = new JPanel();
    private JPanel bottom = new JPanel();
    private JPanel center = new JPanel();
    
    public JCatchTheMouse() 
    {
        super("Catch the Mouse Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con.setLayout(new BorderLayout());
        con.add(top, BorderLayout.NORTH);
        top.add(mainLabel);
        con.add(center, BorderLayout.CENTER);
        center.setLayout(layout);
        for(i = 0; i < 48; ++i) 
        {
            buttons[i] = new JButton(" ");
            center.add(buttons[i]);
            buttons[i].addActionListener(this);
        }
        con.add(bottom, BorderLayout.SOUTH);
        bottom.add(resultLabel);
        setX();
    }

    public void setX() 
    {
        for (i = 0; i < 48; ++i) 
        {
            buttons[i].setText(" ");
        }
        random = (int) ((Math.random() * 48));
        buttons[random].setText("X");
        revalidate();
    }

    public void actionPerformed(ActionEvent e) 
    {
        Object source = e.getSource();
        if (buttons[random] == source) 
        {
            correct++;
            count++;
            setX(); 
        }
        else
        {
            incorrect++;
            count++;
            setX(); 
        }
        if(count == 10) 
        {
            percentage = (int) (correct * 100 / 10);
            resultLabel.setText("Congratulations! Your score is " + percentage + "%");
            JOptionPane.showMessageDialog(null, "Name: Konrad Gnat\nCourse Number: CIS263AA" 
                + "\nSection Number: 36454\nMEID: KON2155430");
        }
    }
      
    public static void main(String[] args)
    { 
         // Run Application
         JCatchTheMouse jctm = new JCatchTheMouse();
         jctm.setSize(500, 500);
         jctm.setVisible(true);
    } 
}
