
/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 19, 2017 
 * Chapter: 17
 * Page: 985
 * Exercise 2a
 * Title: Java Programming: Level II 
 *
 * Description:
 * Create a JApplet that asks a user to enter a password into a JTextField and to then press Enter. 
 * Compare the password to Rosebud; if it matches exactly, display "Access Granted". If not, display 
 * "Access Denied". Save the file as JPasswordA.java.
 * 
 * 
 */   
import javax.swing.*;  
import java.awt.*; 
import java.awt.event.*;


public class JPasswordA extends JApplet implements ActionListener
{  
    JLabel info = new JLabel("Enter your password:");
    JButton btn = new JButton("Go");
    JLabel result = new JLabel("");
    Container con = getContentPane();
    JTextField input = new JTextField("", 10);
    final String PASSWORD = "Rosebud";
    
    
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

        if(in.equals(PASSWORD))
            result.setText("Access Granted");
        else 
            result.setText("Access Denied");
        validate();
    }
}
