/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 09, 2017 
 * Chapter: 16
 * Page: 918
 * Title: Java Programming: Level II 
 *
 * You Do It
 * Using FontMetrics To Place a Border Around a String
 * 
 * 
 * 
 */   
import javax.swing.*; 
import java.awt.*;
 // over written file jdemofontmetrics :(((
public class JBoxAround extends JFrame {  
    // Data Fields 
    String movieQuote = new String ("An offer he can't refuse");
    Font serifItalic = new Font("Serif", Font.ITALIC, 20);
    int leading, ascent, height, width;
    int x = 30, y = 50;
    static final int BORDER = 5;
    

    
    
    public JBoxAround() 
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         
    }
    
    public void paint(Graphics gr)
    {
        super.paint(gr);
        gr.setFont(serifItalic);
        gr.drawString(movieQuote, x, y);
        leading = gr.getFontMetrics().getLeading();
        ascent = gr.getFontMetrics().getAscent();
        height = gr.getFontMetrics().getHeight();
        width = gr.getFontMetris().stringWidth(movieQuote);
        
        gr.drawRect(x = BORDER, y = (ascent + leading + BORDER), width + 2 * BORDER, height + 2 * BORDER);
        
    }
    
    public void displayMetrics(Graphics metrics)
    {
        leading = metrics.getFontMetrics().getLeading();
        ascent = metrics.getFontMetrics().getAscent();
        descent = metrics.getFontMetrics().getDescent();
        height = metrics.getFontMetrics().getHeight();
        
        metrics.drawString("Leading is " + leading, x, y += INCREASE_SMALL);
        metrics.drawString("Ascent is " + ascent, x, y += INCREASE_SMALL);
        metrics.drawString("Descent is " + descent, x, y += INCREASE_SMALL);
        metrics.drawString("Height is " + height, x, y += INCREASE_SMALL);
    }
    
    public static void main(String[] args)
    { 
         // Run Application
         JBoxAround frame = new JBoxAround();
         frame.setSize(330, 100);
         frame.setVisible(true);
    } 
}
