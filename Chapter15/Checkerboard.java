/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 05, 2017 
 * Chapter: 15
 * Page: 832
 * Title: Java Programming: Level II 
 *
 * The Checkerboard Class
 * 
 * 
 * 
 */   
import javax.swing.*; 
import java.awt.event.*;
import java.awt.*; 
 
public class Checkerboard extends JFrame
{  
    // Data Fields 
    private final int ROWS = 8;
    private final int COLS = 8;
    private final int GAP = 2;
    private final int NUM = ROWS * COLS;
    private int x;
    private JPanel pane = new JPanel(new GridLayout(ROWS, COLS, GAP, GAP));
    private JPanel[] panel = new JPanel[NUM];
    private Color color1 = Color.WHITE;
    private Color color2 = Color.BLUE;
    private Color tempColor;
    
    public Checkerboard() 
    {
        // Create JFrame
        super("Checkerboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        add(pane);
        
        for(x = 0; x < NUM; ++x)
        {
            panel[x] = new JPanel();
            pane.add(panel[x]);
            if(x % COLS == 0)
            {
                tempColor = color1;
                color1 = color2;  
                color2 = tempColor;
            }
            if(x % 2 == 0)
                panel[x].setBackground(color1);
            else
                panel[x].setBackground(color2); 
        }
    }
    
    public static void main(String[] args)
    { 
         // Run Application
         Checkerboard jbl = new Checkerboard();
         final int SIZE = 400;
         jbl.setSize(SIZE, SIZE);
         jbl.setVisible(true);
    } 
}
