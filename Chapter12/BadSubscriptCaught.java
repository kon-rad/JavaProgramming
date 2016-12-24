/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: December 21, 2016 
 * Chapter: 12
 * Page: 667
 * Exercise: 1
 * Title: Java Programming: Level II 
 *
 * Description:
 * Write an application named BadSubscriptCaught in which you declare array of 10
 * first names. Write a try block in which you prompt the user for an integer and
 * display the name in the requested position. Create a catch block that catches
 * the potential ArrayIndexOutOfBoundsException thrown when the user enters a
 * number that is out of range. The catch block should also display an error
 * message. Save the file as BadSubscriptCaught.java.
 * 
 * 
 * 
 */   
import javax.swing.*;
 
 
public class BadSubscriptCaught
{
    public static void main(String[] args) 
    {
        int nameInt = 0;
        String nameString;
        String[] tenFirstNames = {
            "Tom", "Jackie", "Arnold", "Billy", "Ted", "Zach", "Joseph", "Mary", 
            "Dennis", "Luke"
        };
        
        while (nameInt != 99)
        {
           try 
           {
               nameString = JOptionPane.showInputDialog(null, 
                   "Enter a number between 1 and 10 to display first name");
               nameInt = Integer.parseInt(nameString);
               if (nameInt == 99)
                   break;
               JOptionPane.showMessageDialog(null, tenFirstNames[nameInt - 1]);
           }
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(null, 
                   "Incorrect entry, you must enter a number between 1 and 10");
           } 
        }
        JOptionPane.showMessageDialog(null, "Goodbye");
    }
}





 




