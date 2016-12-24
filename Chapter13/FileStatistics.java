/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: December 23, 2016 
 * Chapter: 13
 * Page: Online Reading
 * Exercise: 1
 * Title: Java Programming: Level II 
 *
 * Description:
 * Exercise 1: Create a file by using any word-processing program or
 * text editor. Write an application that displays the file's name, size,
 * and time of last modification. Save the file as FileStatistics.java.
 * 
 * 
 */   
import java.io.*;
import java.util.Date;
 
 
public class FileStatistics
{  
    public static void main(String[] args)
    {
        File myFile = new File("SampleTextFile.txt");
        
        if (myFile.exists())
        {
            
            Date date = new Date(myFile.lastModified());
            System.out.println("The file " + myFile.getName() 
                + " exists.\nIt contains " + myFile.length() 
                + " bytes of data.\nIt was last modified on " 
                + date);
        }
           
        
    } 
}





 









