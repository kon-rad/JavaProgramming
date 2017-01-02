/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: December 31, 2016 
 * Chapter: 14
 * Page: 797
 * Exercise: 7
 * Title: Java Programming: Level II 
 *
 * Description:
 * Write an application that allows a user to select a city from a list box that contains at
 * least seven options. Display the population of the city in a text field after the user
 * makes a selection. Save the file as JPopulation.java.
 * 
 * 
 * 
 */   
import javax.swing.*;
import javax.swing.JComboBox;
import java.awt.*;
import java.awt.event.*;
 
 
public class JPopulation extends JFrame implements ActionListener
{
    // Data Fields
    String[] cityArray = {"Select a City", "Montreal", "Chicago", "Toronto", "Portland", "Huston","Detroit", "Minneapolis","St. Louis"};
    String[] populationArray = {"", "165000000", "279000000", "2615000", "609756", "2196000", "688501","400701","318,416" };
    String number = "";
    
    // Initalize JComboBox, label and text field
    JComboBox cityChoice = new JComboBox(cityArray);
    JLabel population = new JLabel("The population of this city is ");
    JTextField cityPopulation = new JTextField(8);
    

    
    public JPopulation()
    {
        // Create JFrame
        super("The Populations of Cities");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(cityChoice);
        add(population);
        add(cityPopulation);
        cityPopulation.setText(number);
        cityChoice.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent event)
    {
        // Create ActionEvent logic 
        JComboBox<String> combo = (JComboBox<String>) event.getSource();
        String selectedCity = (String) combo.getSelectedItem();
        int source = 9999;
        
        if(selectedCity.equals("Select a City"))
        {
             number = populationArray[0];
        }
        else if(selectedCity.equals("Montreal"))
        {
             number = populationArray[1];
        }
        else if(selectedCity.equals("Chicago"))
        {
             number = populationArray[2];
        }
        else if(selectedCity.equals("Toronto"))
        {
             number = populationArray[3];
        }
        else if(selectedCity.equals("Portland"))
        {
             number = populationArray[4];
        }
        else if(selectedCity.equals("Huston"))
        {
             number = populationArray[5];
        }
        else if(selectedCity.equals("Detroit"))
        {
             number = populationArray[6];
        }
        else if(selectedCity.equals("Minneapolis"))
        {
             number = populationArray[7];
        }
        else if(selectedCity.equals("St. Louis"))
        {
             number = populationArray[8];
        }
        cityPopulation.setText(number);
    }
            
        
    public static void main(String[] args)
    {
        // Run JPopulation Application
        JPopulation aFrame = new JPopulation();
        final int WIDTH = 500;
        final int HEIGHT = 80;
        aFrame.setSize(WIDTH, HEIGHT);
        aFrame.setVisible(true);
    } 
}
