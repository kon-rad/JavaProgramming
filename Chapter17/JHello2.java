/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 19, 2017 
 * Chapter: 17
 * Page: 956
 * Title: Java Programming: Level II 
 *
 * JApplet with button 
 * 
 */   
import javax.swing.*;  
import java.awt.*; 
import java.awt.event.*;
import java.awt.Color;


public class JHello2 extends JApplet implements ActionListener
{  
    // Data Fields 
    JLabel greeting = new JLabel("Hi, who are you ?");
    Font font1 = new Font("Teen", Font.BOLD, 36);
    Font font2 = new Font("Teen", Font.ITALIC, 48);
    JTextField answer = new JTextField(10);
    JButton button = new JButton("Enter");
    JLabel reply = new JLabel(" ");
    Container con = getContentPane();
    
    public void init() 
    {
        greeting.setFont(font1);
        reply.setFont(font2);
        con.add(greeting);
        con.add(answer);
        con.add(button);
        con.setLayout(new FlowLayout());
        con.setBackground(Color.YELLOW);
        button.addActionListener(this);
        answer.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String name = answer.getText();
        con.remove(greeting);
        con.remove(button);
        con.remove(answer);
        reply.setText("hello, " + name + "!\n so glad \nyou're here");
        con.add(reply);
        con.setBackground(Color.PINK);
        validate();
    }
}
