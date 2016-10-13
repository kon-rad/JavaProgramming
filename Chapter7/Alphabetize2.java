import java.util.Scanner;
/*
 * Created by Konrad Gnat
 * On:  October 13, 2016
 * Lesson: 7
 * Assignment: Exercise 6b
 * Title: Java Programming: Level I
 *
 * Write an application that accepts three Strings from the user
 * and displays them in alphabetical order...
 */
 

public class Alphabetize2 
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
        StringBuilder ordered = new StringBuilder();
        int compare1 = string1.compareToIgnoreCase(string2);
        int compare2 = string1.compareToIgnoreCase(string3);
        int compare3 = string2.compareToIgnoreCase(string3);

        if ( string1.compareToIgnoreCase(string2) <= 0 && 
             string1.compareToIgnoreCase(string3) <= 0) 
        {
            ordered.append(string1 + " ");
            if (string2.compareToIgnoreCase(string3) <= 0) 
            {
                ordered.append(string2  + " " + string3);
            }
            else
            {
                ordered.append(string3  + " " + string2);
            } 
        }
        else if (string2.compareToIgnoreCase(string1) <= 0 && 
             string2.compareToIgnoreCase(string3) <= 0) 
        {
            ordered.append(string2 + " ");
            if (string1.compareToIgnoreCase(string3) <= 0) 
            {
                ordered.append(string1  + " " + string3);
            }
            else
            {
                ordered.append(string3  + " " + string1);
            } 
        }
        else if (string3.compareToIgnoreCase(string1) <= 0 && 
             string3.compareToIgnoreCase(string2) <= 0) 
        {
            ordered.append(string3 + " ");
            if (string2.compareToIgnoreCase(string1) <= 0) 
            {
                ordered.append(string2  + " " + string1);
            }
            else
            {
                ordered.append(string1  + " " + string2);
            } 
        }
        {
            System.out.println(ordered);
        }
    }
}