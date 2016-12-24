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
import java.util.*;
 
 
public class DisplayBook
{  
    public static void main(String[] args)
    {
        int letter;
        Scanner input = new Scanner(System.in); 
        char optionChoice = 'B';
       
        while (optionChoice != 'C')
        {
            if (optionChoice == 'B')
            {
            
                try
                {
                    File bookFile = new File("favoriteBook.txt");
                    FileOutputStream output = new FileOutputStream(bookFile);
                    
                    System.out.println("Please enter the name of "
                        + " your favorite book");
                    String inputBook = input.nextLine();
                  
                    for (int i = 0; i < inputBook.length(); i++) 
                        output.write(inputBook.charAt(i));
                }
                catch(IOException exc)
                {
                    System.out.println("Oops! Can't display file!");
                }

            }
            System.out.println("The name had been stored in a text file" 
                + "\nSelect one of the following options"
                + "\nA Read the file contents"
                + "\nB Write a new favorite book title"
                + "\nC Exit program");
            optionChoice = input.next().charAt(0);
            input.nextLine();
                   
            if (optionChoice == 'A')
            {  
                try
                {
                    File bookFile = new File("favoriteBook.txt");
                    FileInputStream in = new FileInputStream(bookFile);
                       
                    while ((letter = in.read()) != -1)
                    {
                        System.out.println((char) letter);
                    }
                    in.close();
                }
                catch(IOException exc)
                {
                    System.out.println("Oops! Can't display file!");
                }
            }
        } 
    } 
}





 









