
/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 19, 2017 
 * Chapter: 17
 * Page: 985
 * Exercise 2b
 * Title: Java Programming: Level II 
 *
 * Description:
 * Modify the password applet in Exercise 2a to ignore differences in case between 
 * the typed password and Rosebud. Save the file as JPasswordB.java.
 * 
 */   
 
import javax.swing.*;  
import java.awt.*; 
import java.awt.event.*;


public class JPasswordB extends JApplet implements ActionListener
{  
    JLabel info = new JLabel("Enter your password:");
    JButton btn = new JButton("Go");
    JLabel result = new JLabel("");
    Container con = getContentPane();
    JTextField input = new JTextField("", 10);
    final String PASSWORD = "rosebud";
    
    
    public void init() 
    {
        con.setLayout(new FlowLayout());
        con.add(info);
        con.add(input);
        con.add(btn);
        con.add(result);
        btn.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        String in = input.getText();
        in = in.toLowerCase();

        if(in.equals(PASSWORD))
            result.setText("Access Granted");
        else 
            result.setText("Access Denied");
        validate();
    }
}
