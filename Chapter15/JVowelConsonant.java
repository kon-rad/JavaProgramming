/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 07, 2017 
 * Chapter: 15
 * Page: 870
 * Exercise 2
 * Title: Java Programming: Level II 
 *
 * Description:
 * Create an educational program for children that distinguishes between 
 * vowels and consonants as the user clicks buttons. Create 26 JButtons, each
 * labeled with a different letter of the alphabet. Create a JFrame to hold 
 * three JPanels in a two-by-two grid. Randomly select eight of the 26 JButtons
 * and place four in each of the first two JPanels. Add a JLabel to the 
 * third JPanel. When the user clicks a JButton, the text of the JLabel 
 * identifies the button's letter as a vowel or consonant, and then a new 
 * randomly selected letter replaces the letter on the JButton.
 * 
 * 
 * 
 */   
import javax.swing.*;  
import java.awt.*; 
import java.awt.event.*;


public class JVowelConsonant extends JFrame implements ActionListener
{  
    // Data Fields 
    private JPanel panel01 = new JPanel(new GridLayout(2, 2, 5, 5));
    private JPanel panel02 = new JPanel(new GridLayout(2, 2, 5, 5));
    private JPanel panel03 = new JPanel(new BorderLayout());
    
    private JButton button01 = new JButton();
    private JButton button02 = new JButton();
    private JButton button03 = new JButton();
    private JButton button04 = new JButton();
    
    private JButton button05 = new JButton();
    private JButton button06 = new JButton();
    private JButton button07 = new JButton();
    private JButton button08 = new JButton();
    
    private JLabel display = new JLabel("Click on a letter");
    
    public JVowelConsonant() 
    {
        super("Vowel or Consonant Game");
        setLayout(new GridLayout(2, 2, 5, 5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel01);
        add(panel02);
        add(panel03);
        
        button01.setText(randomLetter());
        button02.setText(randomLetter());
        button03.setText(randomLetter());
        button04.setText(randomLetter());
        
        button05.setText(randomLetter());
        button06.setText(randomLetter());
        button07.setText(randomLetter());
        button08.setText(randomLetter());
        
        panel01.add(button01);
        panel01.add(button02);
        panel01.add(button03);
        panel01.add(button04);
        
        panel02.add(button05);
        panel02.add(button06);
        panel02.add(button07);
        panel02.add(button08);
        
        panel03.add(display, BorderLayout.CENTER);
        
        button01.addActionListener(this);
        button02.addActionListener(this);  
        button03.addActionListener(this);
        button04.addActionListener(this); 
        
        button05.addActionListener(this);
        button06.addActionListener(this);  
        button07.addActionListener(this);
        button08.addActionListener(this);    
    }
    
    public void actionPerformed(ActionEvent e) 
    {

        String letterClicked = ((JButton)e.getSource()).getText();
        
        if (letterClicked == (" A ") || letterClicked == " E " || letterClicked == " I "
            || letterClicked == " O " || letterClicked == " U ")
        {
            display.setText("You clicked on a vowel");
        }
        else 
        {
            display.setText("You clicked on a consonant");
        }
        ((JButton)e.getSource()).setText(randomLetter());
    }
    
    public String randomLetter() 
    {
        String[] abc = { 
             " A ", " B ", " C ", " D ", " E ", " F ", " G ", " H ", " I ", " J ", 
             " K ", " L ", " M ", " N ", " O ", " P ", " Q ", " R ", " S ", " T ", " U ", 
             " V ", " W ", " X ", " Y ", " Z " 
        };
        int random = (int ) (Math.random() * 27);
        return abc[random];
    } 
    
    public static void main(String[] args)
    { 
         // Run Application
         JVowelConsonant jvc= new JVowelConsonant();
         jvc.setSize(400, 400);
         jvc.setVisible(true);
    } 
}
