/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 09, 2017 
 * Chapter: 16
 * Page: 891
 * Title: Java Programming: Level II 
 *
 * You Do It
 * Creating Your Own Graphics Object
 * 
 * 
 * 
 */   
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*; 
import java.awt.Color; 
 
public class JDemoCreateGraphicsObject extends JFrame implements ActionListener {  
    // Data Fields 
    String movieQuote = new String("Here's looking at you, kid");
    JButton moveButton = new JButton("Move It");
    Font broadwayFont = new Font("Broadway", Font.ITALIC, 12);
    int x = 10, y = 50;
    final int GAP =20;
    final int SIZE = 400;
    
    public JDemoCreateGraphicsObject() 
    {
        Container con = getContentPane();
        con.setBackground(Color.YELLOW);
        con.setLayout(new FlowLayout());
        con.add(moveButton);
        moveButton.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setSize(SIZE, SIZE);      
    }
    
    public void actionPerformed(ActionEvent e)
    {
        Graphics pen = getGraphics();
        pen.setFont(broadwayFont);
        pen.setColor(Color.MAGENTA);
        pen.drawString(movieQuote, x += GAP, y += GAP);
    }
    
    public static void main(String[] args)
    { 
         // Run Application
         JDemoCreateGraphicsObject frame = new JDemoCreateGraphicsObject();
         frame.setVisible(true);
    } 
}
