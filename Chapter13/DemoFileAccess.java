/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: December 21, 2016 
 * Chapter: 13
 * Online Reading 
 * Title: Java Programming: Level II 
 *
 * Description:
 * You Do It
 * Accessing Permanent Files 
 * 
 */   
import java.io.*;
 
 
public class DemoFileAccess
{  
    public static void main(String[] args)
    {
        File myFile = new File("SomeData.txt");
        
        if (myFile.exists()) 
        {
            System.out.println("This file exists and it is " + myFile.length() 
                + " bytes long");
        } 
        else
        {
            System.out.println("This file does not exist");
        }
    } 
}





 









