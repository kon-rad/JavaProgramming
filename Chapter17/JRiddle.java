
/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 19, 2017 
 * Chapter: 17
 * Page: 985
 * Exercise 1
 * Title: Java Programming: Level II 
 *
 * Description:
 * Create a JApplet with a JLabel that contains a riddle and a JButton.
 * When the user clicks the button, display the answer in a large font 
 * on another JLabel. Save the file as JRiddle.java.
 * 
 * 
 */   
import javax.swing.*;  
import java.awt.*; 
import java.awt.event.*;


public class JRiddle extends JApplet implements ActionListener
{  
    JButton button = new JButton("Click for Answer");
    JLabel riddle = new JLabel("The more you take, the more you leave behind. What am I?");
    JLabel answer = new JLabel("Footsteps");
    Font font1 = new Font("Ariel", Font.PLAIN, 12);
    Font font2 = new Font("Ariel", Font.BOLD, 68);
    Container con = getContentPane();
    
    public void init() 
    {
        riddle.setFont(font1);
        answer.setFont(font2);
        con.add(riddle);
        con.add(button);
        button.addActionListener(this);
        con.setLayout(new FlowLayout());
    }
    public void actionPerformed(ActionEvent e)
    {
        con.add(answer);
        validate();
    }
}
