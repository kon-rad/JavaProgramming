import java.util.Scanner;
/*
 * Created by Konrad Gnat
 * On:  October 13, 2016
 * Lesson: 7
 * Assignment: Exercise 6a
 * Title: Java Programming: Level I
 *
 * Write an application that accepts three Strings from the user...
 */
 

public class Alphabetize 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string >>"); 
        String string1 = in.nextLine();
        System.out.println("Enter a second string >>"); 
        String string2 = in.nextLine();
        System.out.println("Enter a third string >>"); 
        String string3 = in.nextLine();
        
        if (string1.compareToIgnoreCase(string2) <= 0 && 
             string1.compareToIgnoreCase(string3) <= 0 && 
             string2.compareToIgnoreCase(string3) <= 0) 
        {
            System.out.println("The three strings were entered in alphabetical order.");
        }
        else 
        {
            System.out.println("The three strings were NOT entered in alphabetical order.");
        }
    }
}    