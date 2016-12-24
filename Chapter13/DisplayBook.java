/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: December 23, 2016 
 * Chapter: 13
 * Page: Online Reading
 * Exercise: 3
 * Title: Java Programming: Level II 
 *
 * Description:
 * Exercise 3: Write an application using the FileInputStream that 
 * opens a file that contains the name of the user's favorite book and 
 * then displays it to the user. If the file does not exist, prompt the
 * user for the book's title and then write it to the file by using a
 * FileOutputStream. Save the file as DisplayBook.java.
 * 
 * 
 */   
import java.io.*;
import java.util.Date;
 
 
public class DisplayBook
{  
    public static void main(String[] args)
    {
        File txtFile = new File("Quote.txt");
        File pagesFile = new File("Quote.pages");
        
        if (txtFile.exists() && pagesFile.exists())
        {  
            System.out.println("The file named " + txtFile.getName() 
                + "  contains " + txtFile.length() 
                + " bytes of data.\nThe file named " 
                + pagesFile.getName() + " contains " + pagesFile.length()
                + ".\nThe ratio is 1 to " + (pagesFile.length() / txtFile.length()) 
                + ".");
        }
    } 
}





 









