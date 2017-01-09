/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 09, 2017 
 * Chapter: 16
 * Page: 889
 * Title: Java Programming: Level II 
 *
 * You Do It
 * Using Fonts and Color
 * 
 * 
 * 
 */   
import javax.swing.*; 
import java.awt.*; 
import java.awt.Color; 
 
public class JDemoGraphics2 extends JFrame {  
    // Data Fields 
    String movieQuote = new String("You talkin' to me?");
    Font bigFont = new Font("Boopee", Font.ITALIC, 30);
    
    public JDemoGraphics2() 
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
    }
    
    public void paint(Graphics gr)
    {
        super.paint(gr);
        gr.setFont(bigFont);
        gr.setColor(Color.MAGENTA);
        gr.drawString(movieQuote, 30, 100);
        gr.setColor(Color.BLUE);
        gr.drawString(movieQuote, 60, 140);
    }
    
    public static void main(String[] args)
    { 
         // Run Application
         JDemoGraphics2 frame = new JDemoGraphics2();
         frame.setSize(280, 200);
         frame.setVisible(true);
    } 
}
