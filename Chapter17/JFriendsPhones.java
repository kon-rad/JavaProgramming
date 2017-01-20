
/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 19, 2017 
 * Chapter: 17
 * Page: 986
 * Exercise 6
 * Title: Java Programming: Level II 
 *
 * Description:
 * Create a JApplet that contains two parallel arrays with at least five friends, 
 * names and  phone numbers. Allow the user to enter either a name or phone number 
 * and to click a JButton to display the other. Include a JLabel to describe each
 * JTextField. Save the file as JFriendsPhones.java.
 * 
 */   
 
import javax.swing.*;  
import java.awt.*; 
import java.awt.event.*;
import java.util.Arrays;


public class JFriendsPhones extends JApplet implements ActionListener
{  
    JLabel info = new JLabel("Phonebook");
    Font font1 = new Font("Ariel", Font.PLAIN, 58);
    JLabel info2 = new JLabel("Search by name or number");
    JLabel result = new JLabel("");
    JButton btn = new JButton("Go");
    Container con = getContentPane();
    JTextField input = new JTextField("", 10);
    final String[] NAMES = {"Kelley", "Audrey", "Juliette", "Joy", "Jasmine", "Megan"};
    final String[] NUMBERS = {"5555555555", "8478976565", "7732342983", "7738763453", "7737777732", "8478767878"};
    
    public void init() 
    {
        con.setLayout(new FlowLayout());
        info.setFont(font1);
        con.add(info);
        con.add(info2);
        con.add(input);
        con.add(btn);
        con.add(result);
        btn.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        String in = input.getText();
        int index = Arrays.asList(NAMES).indexOf(in);
        int indexNum = Arrays.asList(NUMBERS).indexOf(in);  

        if( index >= 0 )
            result.setText("Name: " + in + " Phone number: " + NUMBERS[index]);
        else if( indexNum >= 0 )
            result.setText("Name: " + NAMES[indexNum] + " Phone number " + in);
        else 
            result.setText("Not Found");
        validate();
    }
}
