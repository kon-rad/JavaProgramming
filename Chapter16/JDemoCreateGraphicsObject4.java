/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 09, 2017 
 * Chapter: 16
 * Page: 907
 * Title: Java Programming: Level II 
 *
 * You Do It
 * Graphics 
 * 
 * 
 * 
 */   
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*; 
import java.awt.Color; 
 
public class JDemoCreateGraphicsObject4 extends JFrame implements ActionListener {  
    // Data Fields 
    String movieQuote = new String("Here's looking at you, kid");
    JButton moveButton = new JButton("Move It");
    Font broadwayFont = new Font("Broadway", Font.ITALIC, 12);
    int x = 10, y = 50;
    final int GAP =20;
    final int SIZE = 400;
    final int LIMIT = SIZE - 50;
    
    public JDemoCreateGraphicsObject4() 
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
        if(y < LIMIT)
        {
            pen.drawString(movieQuote, x += GAP, y += GAP);
        }
        else 
        {
            moveButton.setEnabled(false);
            pen.setColor(Color.BLACK);
            //Head
            pen.drawOval(50, 170, 80, 70);
            //Torso
            pen.drawLine(85, 240, 90 ,280);
            //Legs
            pen.drawLine(90, 280, 60, 380);
            pen.drawLine(90, 280, 110, 380);
            //Feet
            pen.drawLine(60, 380, 70, 380);
            pen.drawLine(110, 380, 120, 380);
            //Eyes
            pen.drawOval(75, 200, 10, 10);
            pen.drawOval(95, 200, 10, 10);
            //Arms
            pen.drawLine(30, 255, 110, 255);
            //Mouth
            pen.drawLine(70, 220, 102, 220);
        }
    }
    
    public static void main(String[] args)
    { 
         // Run Application
         JDemoCreateGraphicsObject4 frame = new JDemoCreateGraphicsObject4();
         frame.setVisible(true);
    } 
}
