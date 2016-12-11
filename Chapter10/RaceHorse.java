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
 * Description:
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

 
 
public class RaceHorse extends Horse
{

    // Declare data fields
    private int numberOfRaces;
    private int standing;
    
    // Set Methods
    public void setNumberOfRaces(int num) 
    {
        numberOfRaces = num;
    }
    public void setStanding(int num) 
    {
        standing = num;
    }
    
    // Get Methods
    public int getNumberOfRaces() 
    {
        return numberOfRaces;
    }
    public int getStanding() 
    {
        return standing;
    }
}