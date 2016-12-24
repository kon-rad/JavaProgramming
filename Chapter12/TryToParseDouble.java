/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: December 21, 2016 
 * Chapter: 12
 * Page: 667
 * Exercise: 2
 * Title: Java Programming: Level II 
 *
 * Description:
 * The Double.parseDouble() method requires a String argument, but it fails 
 * if the String cannot be converted to a floating-point number. Write an
 * application in which you try accepting a double input from a user and 
 * catch a NumberFormatException if one is thrown. The catch block forces 
 * the number to 0 and displays an appropriate error message. Following the 
 * catch block, display the number. Save the file as TryToParseDouble.java.
 * 
 * 
 * 
 */   
import javax.swing.*;
 
 
public class TryToParseDouble
{
    public static void main(String[] args) 
    {
        double inputDouble = 0.0;
        
        while (inputDouble != 99.0)
        {
           try 
           {
               String inputString = JOptionPane.showInputDialog(null, 
                   "Please enter a floating point number\nTo quit enter 99");
               inputDouble = Double.parseDouble(inputString);
           }
           catch(NumberFormatException exception)
           {
                inputDouble = 0;
                JOptionPane.showMessageDialog(null, "Error!\nYou must enter a number");
           }
           if (inputDouble == 99.0)
                JOptionPane.showMessageDialog(null, "Goodbye!");
           else 
               JOptionPane.showMessageDialog(null, "You had entered " + inputDouble);
        } 
    }
}





 









