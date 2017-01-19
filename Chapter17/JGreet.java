/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 19, 2017 
 * Chapter: 17
 * Page: 953
 * Title: Java Programming: Level II 
 *
 * You Do It
 * Creating and running a JApplet
 * 
 */   
import javax.swing.*;  
import java.awt.*; 


public class JGreet extends JApplet 
{  
    // Data Fields 
    Container con = getContentPane();
    JLabel greeting = new JLabel("Greetings!");
    public void init() 
    {
        con.add(greeting);
    }
}
