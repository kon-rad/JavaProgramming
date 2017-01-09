/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 09, 2017 
 * Chapter: 16
 * Page: 888
 * Title: Java Programming: Level II 
 *
 * You Do It
 * Using the DrawString Method
 * 
 * 
 * 
 */   
import javax.swing.*; 
import java.awt.*; 
 
public class JDemoGraphics extends JFrame {  
    // Data Fields 
    String movieQuote = new String("You talkin' to me?");
    
    public JDemoGraphics() 
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
    }
    
    public void paint(Graphics gr)
    {
        super.paint(gr);
        gr.drawString(movieQuote, 30, 100);
    }
    
    public static void main(String[] args)
    { 
         // Run Application
         JDemoGraphics frame = new JDemoGraphics();
         frame.setSize(280, 200);
         frame.setVisible(true);
    } 
}
