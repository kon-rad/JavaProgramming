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
 
 
public class DemoFileStream
{  
    public static void main(String[] args)
    {
        int letter;
        
        try 
        {
            File text = new File("Quote.txt");
            FileInputStream  in = new FileInputStream(text);  
             
            while((letter = in.read()) != -1)
            {
                System.out.println((char)letter);
            }
            in.close(); 
        } 
        catch(IOException exc)
        {
            System.out.println("Oops! Can't display file!");
        }
        

    } 
}





 









