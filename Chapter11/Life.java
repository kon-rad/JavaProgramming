/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: December 16, 2016 
 * Chapter: 11
 * Page: 597
 * Exercise: 9
 * Title: Java Programming: Level II 
 *
 * Description:
 * Write an application named UseInsurance that uses an abstract 
 * Insurance class and Health and Life subclasses to display 
 * different types of insurance policies and the cost per month.
 * The Insurance class contains a String representing the type
 * of insurance and a double that holds the monthly price.
 * The Insurance class constructor requires a String argument
 * indicating the type of insurance, but the Life and Health 
 * class constructors require no arguments. The Insurance 
 * class contains a get method for each field; it also contains
 * two abstract methods named setCost() and display(). The 
 * Life class setCost() method sets the monthly fee to $36,
 * and the Health class sets the monthly fee to $196. Write 
 * an application named UseInsurance that prompts the user
 * for the type of insurance to be displayed, and then 
 * create the appropriate object. Save the files as Life.java, 
 * Health.java, Insurance.java, and UseInsurance.java.
 *
 */ 
import javax.swing.*;  

 
 
public class Life extends Insurance
{
    
    
    // Constructor
    Life()
    {
        super("Life");
        setCost();
        display();
    }
    
    // Get Methods
    public String getType() 
    {
        return super.getType();
    }
    public double getPrice()
    {
        return this.getPrice();
    }
    
    // Set and Display
    public void setCost()
    {
        price = 36.00;
    }
    public void display()
    {
        JOptionPane.showMessageDialog(null,"The " + super.getType() + " insurance policy costs " + price 
            + " per month.");
    }
}





 

