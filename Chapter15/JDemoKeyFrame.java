/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 05, 2017 
 * Chapter: 15
 * Page: 841
 * Title: Java Programming: Level II 
 *
 * An Event-Handling Example: KeyListener
 * JDemoKeyFrame
 * 
 * 
 * 
 */   
import javax.swing.*; 
import java.awt.event.*;
import java.awt.*; 
 
public class JDemoKeyFrame extends JFrame implements KeyListener
{  
    // Data Fields 
    private JLabel prompt = new JLabel("Type keys below:");
    private JLabel outputLabel = new JLabel();
    private JTextField textField = new JTextField(10); 
    
    public JDemoKeyFrame() 
    {
        // Create JFrame
        super("JKey Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(new BorderLayout());
        add(prompt, BorderLayout.NORTH);
        add(textField, BorderLayout.CENTER);
        add(outputLabel, BorderLayout.SOUTH);
        addKeyListener(this);
        textField.addKeyListener(this);
    }
    
    public void keyTyped(KeyEvent e)
    {
        char c = e.getKeyChar();
        outputLabel.setText("Last key typed: " + c);
    }
    public void keyPressed(KeyEvent e)
    {
    }
    public void keyReleased(KeyEvent e)
    {
    }
    
    public static void main(String[] args)
    { 
         // Run Application
         JDemoKeyFrame jbl = new JDemoKeyFrame();
         final int WIDTH = 250;
         final int HEIGHT = 100;
         jbl.setSize(WIDTH, HEIGHT);
         jbl.setVisible(true);
    } 
}
