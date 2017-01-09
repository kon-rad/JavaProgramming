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
    private JMenuItem single = new JMenuItem("Single Room");
    private JMenuItem doubleBed = new JMenuItem("Double Bedroom Suite");
    private JMenuItem threeBeds = new JMenuItem("Three Bedroom Suite");
    private JMenuItem vege = new JMenuItem("Vegetarian");
    private JMenuItem nonvege = new JMenuItem("Non-vegetarian");
    private JMenuItem golf = new JMenuItem("Golf");
    private JMenuItem scuba = new JMenuItem("Scuba Diving");
    private JMenuItem beach = new JMenuItem("Beach");
    private JLabel label1 = new JLabel("See what we offer!");   
    
    
    public SummervaleResort() 
    {
        // Create Frame
        super("Summervale Resort Information");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        composeMenus();
        addActionListeners();
        layoutComponents();
        add(label1);
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        // Change label to display message
        Object source = e.getSource();
        if(source == single)
            label1.setText("Our standard room with single bed is approximately 20"
                + " SqFt. and is equipped with a mini fridge.");
        else if(source == exit)
            System.exit(0);
        else if(source == doubleBed)
            label1.setText("The double bedroom suite starts at $189 and is our most"
                + " popular choice! Enjoy it's fully equipped kitchen.");
        else if(source == threeBeds)
            label1.setText("The three bedroom suite offers the ultimate in peace!"
                + " Enjoy a full size flatscreen TV and an oversized jetted tub.");
        else if(source == vege)
            label1.setText("The vegeterian menu offers the highest quality meat-free"
                + " ingrediants to create delicious flavor combinations.");
        else if(source == nonvege)
            label1.setText("Meat lovers will feel great having a wide variety of "
                + " meals to choose from. Hamburger's and steaks galore!");
        else if(source == golf)
            label1.setText("The center piece of Summervale Resort is our five star "
                + "golf course that lures people from all over the globe!");
        else if(source == scuba)
            label1.setText("The greatest adventure awaits for you in the beautiful "
                + "coral reefs just a few feet from shore.");
        else if(source == beach)
            label1.setText("Golden beaches sprayed with the Sun's rays await your "
                + "long walks and the best times ever.");
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
         sr.setSize(800, 200);
         sr.setVisible(true);
    } 
}
