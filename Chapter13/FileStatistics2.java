/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: December 23, 2016 
 * Chapter: 13
 * Page: Online Reading
 * Exercise: 2
 * Title: Java Programming: Level II 
 *
 * Description:
 * Exercise 2: Create a file that contains your favorite movie quote.
 * Use a text editor such as Notepad and save the file as Quote.txt. 
 * Copy the file contents and paste them into a word-processing program 
 * such as Word. Save the file as Quote.doc. Write an application that
 * displays the sizes of the two files, as well as the ratio of the
 * two file sizes. Save the file as FileStatistics2.java.
 * 
 * 
 */   
import java.io.*;
import java.util.Date;
 
 
public class FileStatistics2
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





 









