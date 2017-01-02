/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: December 31, 2016 
 * Chapter: 14
 * Page: 764
 * You Do It: Adding Components to a JFrame
 * Title: Java Programming: Level II 
 *
 * 
 * 
 * 
 */   
import javax.swing.*;
import java.awt.*;

 
 
public class JFrameWithComponents extends JFrame
{  
    JLabel label = new JLabel("Enter your name");
    JTextField field = new JTextField(12);
    JButton button = new JButton("OK");
    
    public JFrameWithComponents()
    {
       super("Frame with Components");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(new FlowLayout());
       add(label);
       add(field);
       add(button);
    }
}
