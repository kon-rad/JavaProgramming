/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 07, 2017 
 * Chapter: 15
 * Page: 871
 * Exercise 10
 * Title: Java Programming: Level II 
 *
 * Description:
 * In Java, create a JFrame for the Summervale Resort. Allow the user to view
 * information about different rooms available, dining options, and activities
 * offered. Include at least two options in each menu, and display appropriate 
 * information when the user makes a choice. Save the file as SummervaleResort.java
 * 
 * 
 */   
import javax.swing.*;  
import java.awt.*; 
import java.awt.event.*;


public class SummervaleResort  extends JFrame implements ActionListener
{  
    // Data Fields 
    private JMenuBar mainBar = new JMenuBar();
    private JMenu menu1 = new JMenu("File");
    private JMenu menu2 = new JMenu("Rooms");
    private JMenu menu3 = new JMenu("Dining Options");
    private JMenu menu4 = new JMenu("Activities");
    private JMenuItem exit = new JMenuItem("Exit");
    private JMenuItem single = new JMenuItem("Single");
    private JMenuItem doubleBed = new JMenuItem("Double");
    private JMenuItem threeBeds = new JMenuItem("Three Bed");
    private JMenuItem vege = new JMenuItem("Vegetarian");
    private JMenuItem nonvege = new JMenuItem("Non-vegetarian");
    private JMenuItem golf = new JMenuItem("Golf");
    private JMenuItem scuba = new JMenuItem("Scuba Diving");
    private JMenuItem beach = new JMenuItem("Beach");
    
    
    
    
    public SummervaleResort() 
    {
        // Create Frame
        super("Summervale Resort Information");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        composeMenus();
        addActionListeners();
        layoutComponents();
        
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        // Change label to display message on which mouse button was clicked 
        
    }
    public void composeMenus() 
    {
        setJMenuBar(mainBar);
        mainBar.add(menu1);
        mainBar.add(menu2);
        mainBar.add(menu3);
        mainBar.add(menu4);
        menu1.add(exit);
        menu2.add(single);
        menu2.add(doubleBed);
        menu2.add(threeBeds);
        menu3.add(vege);
        menu3.add(nonvege);
        menu4.add(golf);
        menu4.add(scuba);
        menu4.add(beach);
    }
    public void addActionListeners() 
    {
        exit.addActionListener(this);
        single.addActionListener(this);
        doubleBed.addActionListener(this);
        threeBeds.addActionListener(this);
        vege.addActionListener(this);
        nonvege.addActionListener(this);
        golf.addActionListener(this);
        scuba.addActionListener(this);
        beach.addActionListener(this);
    }
    public void layoutComponents() 
    {
    }
    
    public static void main(String[] args)
    { 
         // Run Application
         SummervaleResort sr = new SummervaleResort();
         sr.setSize(400, 400);
         sr.setVisible(true);
    } 
}
