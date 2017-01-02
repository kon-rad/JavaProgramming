/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: December 31, 2016 
 * Chapter: 14
 * Page: 797
 * Exercise: 10
 * Title: Java Programming: Level II 
 *
 * Description:
 * Create an application for Paula's Portraits, a photography studio. Paula's base price is
 * $40 for a photo session with one person. The in-studio fee is $75 for a session with
 * two or more subjects, and $95 for a session with a pet. A $90 fee is added to take
 * photos on location instead of in the studio. The application allows users to compute
 * the price of a photography session. Include a set of mutually exclusive check boxes to
 * select the portrait subject and another set of mutually exclusive check boxes for the
 * session location. Include labels as appropriate to explain the application's functionality.
 * Save the file as JPhotoFrame.java.
 * 
 * 
 * 
 */   
import javax.swing.*;
import javax.swing.ButtonGroup;
import java.awt.*;
import java.awt.event.*;
 
public class JPhotoFrame extends JFrame implements ActionListener
{  
    // Data Fields
    final int BASE_PRICE = 40;
    final int TWO_OR_MORE = 75;
    final int PET_SESSION = 95;
    final int ON_LOCATION = 90;
    int subjectPrice = 0;
    int locationPrice = 0;

    // Initialize Labels and text field
    JLabel titleLabel = new JLabel("Paula's Portraits Price Calculator");
    JLabel priceLabel = new JLabel("The price for your stay is");
    JTextField totalPrice = new JTextField(4);
    JLabel optionExplainLabel = new JLabel("Base price for a room is $" + BASE_PRICE + ".");
    JLabel optionExplainLabel2 = new JLabel("Check the type of photography subject option you want.");
    JLabel optionExplainLabel3 = new JLabel("Check the type of photography location option you want.");
    JLabel optionExplainLabel4 = new JLabel("The price for your photography session is $");
    
    // Initialize buttons and button groups
    ButtonGroup subjectsGroup = new ButtonGroup();
    JCheckBox oneSubjectBox = new JCheckBox("One subject", true);
    JCheckBox petsBox = new JCheckBox("Pet $" + PET_SESSION, false);
    JCheckBox twoOrMoreBox = new JCheckBox("Two or more subjects $" + TWO_OR_MORE, false);
    ButtonGroup locationGroup = new ButtonGroup();
    JCheckBox inStudioBox = new JCheckBox("In studio", true);
    JCheckBox onLocationBox = new JCheckBox("On location $" + ON_LOCATION, false); 
    
    public JPhotoFrame() 
    {
        // Create JFrame
        super("Paula's Portraits");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        // Add Labels
        add(titleLabel);
        add(optionExplainLabel);
        add(optionExplainLabel2);
        
        // Add groups, labels and buttons
        subjectsGroup.add(oneSubjectBox);
        subjectsGroup.add(petsBox); 
        subjectsGroup.add(twoOrMoreBox);  
        add(oneSubjectBox);
        add(petsBox);
        add(twoOrMoreBox); 
        
        add(optionExplainLabel3);
        
        locationGroup.add(inStudioBox);
        locationGroup.add(onLocationBox);   
        add(inStudioBox);
        add(onLocationBox);

        add(optionExplainLabel4);
        
        // Add and set text field, add Action listeners 
        add(totalPrice);
        totalPrice.setText("$" + BASE_PRICE);
        oneSubjectBox.addActionListener(this);
        petsBox.addActionListener(this);
        twoOrMoreBox.addActionListener(this);
        inStudioBox.addActionListener(this);
        onLocationBox.addActionListener(this);      
    }
    
    public void actionPerformed(ActionEvent event)
    {
        // Create logic for action event listener
        Object source = event.getSource(); 
        
        if (source == petsBox)
        { 
            subjectPrice = PET_SESSION;
        }
        else if (source == oneSubjectBox)
        {
            subjectPrice = 0;
        }
        else if (source == twoOrMoreBox)
        {
            subjectPrice = TWO_OR_MORE; 
        }
        else if (source == onLocationBox)
        {
            locationPrice = ON_LOCATION;
        }
        else if (source == inStudioBox)
        {
            locationPrice = 0;
        }   
        totalPrice.setText("$" + (subjectPrice + locationPrice + BASE_PRICE));
    }
    
    public static void main(String[] args)
    { 
         // Run JPhoto Frame Application
         JPhotoFrame aFrame = new JPhotoFrame();
         final int WIDTH = 375;
         final int HEIGHT = 300;
         aFrame.setSize(WIDTH, HEIGHT);
         aFrame.setVisible(true);
    } 
}
