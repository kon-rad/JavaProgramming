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

 
 
public class UseInsurance 
{
    public static void main(String[] args) 
    {
        int typeInt = 3;
        String type;
        
        
        JOptionPane.showMessageDialog(null, "Welcome to the Insurance Policy Information Program");
        
        while (typeInt != 0) 
        {
            type = JOptionPane.showInputDialog(null, "What kind of Insurance Policy are you interested in?" 
                + "\nEnter 1 for Life Insurance \nEnter 2 for Health Insurance" 
                + "\nEnter 0 to Exit the Program");
            typeInt = Integer.parseInt(type);
           
            if (typeInt == 1) 
            {
                Life lifeInsurance = new Life();
            }
            else if (typeInt == 2)
            {
                Health healthInsurance = new Health();
            }
            else if (typeInt == 0)
            {
                JOptionPane.showMessageDialog(null, "Thank you for using the Insurance Policy Information Program.\n\nGoodbye!");
            }
            else if (typeInt != 0)
            {
                JOptionPane.showMessageDialog(null, "Entry not recognized!\n"
                    + "\nEnter 1 for Life Insurance \nEnter 2 for Health Insurance" 
                    + "\nEnter 0 to Exit the Program");
            }
        }
    }
}





 

