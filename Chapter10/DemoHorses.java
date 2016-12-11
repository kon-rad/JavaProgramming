/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On:  December 10, 2016 
 * Chapter: 10
 * Page: 539
 * Exercise: 1
 * Title: Java Programming: Level II 
 *
 * 
 * Create a class named Horse that contains data fields for the name, color, 
 * and birth year. Include get and set methods for these fields. Next, create 
 * a subclass named RaceHorse, which contains an additional field that holds 
 * the number of races in which the horse has competed and additional methods 
 * to get and set the new field. Write an application that demonstrates using
 * objects of each class. Save the files as Horse.java, RaceHorse.java, and
 * DemoHorses.java. 
 * 
 * Exercise 1: Add an additional data field to the RaceHorseclass that stores
 * the place that the horse came in, including its get() and set() methods. 
 * Demonstrate the usage of the various data fields in the DemoHorsesclass 
 * by using their get and set method. * 
 *
 */  
import javax.swing.*;
 
 
public class DemoHorses
{
    public static void main(String[] args)
    {
       String horseNameInput;
       String horseColorInput;
       String horseBirthYearInput;
       int horseBirthYearInputInt;
       String horseNumberOfRacesInput;
       int horseNumberOfRacesInputInt;
       String horseStandingInput;
       int horseStandingInputInt;
       RaceHorse rh = new RaceHorse();
       
       //Set Name
       horseNameInput = JOptionPane.showInputDialog(null, "Enter "
           + "horse name");
       rh.setName(horseNameInput);
       //Set Color
       horseColorInput = JOptionPane.showInputDialog(null, "Enter "
           + rh.getName() + " color");
       rh.setColor(horseColorInput);
       //Set Birth Year
       horseBirthYearInput = JOptionPane.showInputDialog(null, "Enter "
           + rh.getName() + " birth year");
       horseBirthYearInputInt = Integer.parseInt(horseBirthYearInput);
       rh.setBirthYear(horseBirthYearInputInt);
       //Set Number of Races
       horseNumberOfRacesInput = JOptionPane.showInputDialog(null, "Enter "
           + rh.getName() + " number of races");
       horseNumberOfRacesInputInt = Integer.parseInt(horseNumberOfRacesInput);
       rh.setNumberOfRaces(horseNumberOfRacesInputInt);
       //Set Number of Races
       horseStandingInput = JOptionPane.showInputDialog(null, "Enter "
           + rh.getName() + " standing");
       horseStandingInputInt = Integer.parseInt(horseStandingInput);
       rh.setStanding(horseStandingInputInt);
       
       
       
       JOptionPane.showMessageDialog(null, "Horse: " + rh.getName() 
           + "\nColor: " + rh.getColor() + "\nBirth Year:" + rh.getBirthYear() 
           + "\nNumber of Races: " + rh.getNumberOfRaces() + "\nStanding: " + rh.getStanding());
       
    
    }
}