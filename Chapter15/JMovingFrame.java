/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 07, 2017 
 * Chapter: 15
 * Page: 870
 * Exercise 5
 * Title: Java Programming: Level II 
 *
 * Description:
 * Create a JFrame with JPanels, a JButton, and a JLabel. When the user clicks 
 * the JButton, reposition the JLabel to a new location in a different JPanel.
 * Save the file as JMovingFrame.java
 * 
 * 
 * 
 */   
import javax.swing.*;  
import java.awt.*; 
import java.awt.event.*;


public class JMovingFrame  extends JFrame implements ActionListener
{  
    // Data Fields 
    private JPanel panel01 = new JPanel();
    private JPanel panel02 = new JPanel();
    private JPanel panel03 = new JPanel();
    private JPanel panel04 = new JPanel();
    private JPanel panel05 = new JPanel();
    private JPanel panel06 = new JPanel();
    private JPanel panel07 = new JPanel();
    private JPanel panel08 = new JPanel();
    private JPanel panel09 = new JPanel();
    private JButton button = new JButton("Click me");
    private JLabel label = new JLabel("Watch me move");
    
    
    public JMovingFrame() 
    {
        // Create Frame
        super("Moving Frame Application");
        setLayout(new GridLayout(3, 3, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel02.add(label);
        panel05.add(button);
        button.addActionListener(this);
        add(panel01);
        add(panel02);
        add(panel03);
        add(panel04);
        add(panel05);
        add(panel06);
        add(panel07);
        add(panel08);
        add(panel09);
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        // Add label to a randomly assigned panel and refresh
        System.out.println("clicked");
        int randomPanel = (int) (Math.random() * 8);
        switch(randomPanel) 
        {
            case 0: 
            System.out.println(randomPanel);
            panel01.add(label);
                break;
            case 1: panel02.add(label);
                break;
            case 2: panel03.add(label);
                break;
            case 3: panel04.add(label);
                break;
            case 4: panel06.add(label);
                break;
            case 5: panel07.add(label);
                break;
            case 6: panel08.add(label);
                break;
            case 7: panel09.add(label);
                break;
        }
        revalidate();
        repaint();
    }
    
    public static void main(String[] args)
    { 
         // Run Application
         JMovingFrame jmf = new JMovingFrame();
         jmf.setSize(400, 400);
         jmf.setVisible(true);
    } 
}
