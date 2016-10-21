import javax.swing.*;
import java.util.*;
/*
 * Created by Konrad Gnat
 * On:  October 20, 2016
 * Lesson: 8
 * Exercise: 9
 * Title: Java Programming: Level I
 *
 * Write an application that allows a user to enter the names
 * and phone numbers of up to 20 friends. Continue to prompt 
 * the user for names and phone numbers until the user enters 
 * “zzz” or has entered 20 names, whichever comes first. When 
 * the user is finished entering names, produce a count of how
 * many names were entered, but make certain not to count the
 * application-ending dummy “zzz” entry. Then display the 
 * names. Ask the user to type one of the names and display
 * the corresponding phone number. Save the application 
 * as PhoneBook.java.
 *
 */
 
public class PhoneBook 
{
  public static void main(String[] args)
  {
    final String QUIT = "zzz";
    String[] names = new String[20];
    int[] numbers = new int[20]; 
    int i = 0;
    String in = "";
    String num;
    while (i < 20 && !in.equals(QUIT))
    { 
      in = JOptionPane.showInputDialog(null, "Enter name and "
      + "numbers to phone book"
      + "\nTo quit enter 'zzz'\nLimit: 20 names");
      if (!in.equals(QUIT))
      {
        names[i] = in;  
        num = JOptionPane.showInputDialog(null, "Enter phone number");
        numbers[i] = Integer.parseInt(num);
        i++; 
      }
    }
    JOptionPane.showMessageDialog(null, "You have entered " 
      + i + " names and numbers.");
    System.out.println("Names: ");  
    for (int j = 0; j < i; j++)
    {
      System.out.println("\t" + names[j]);
    }
    in = JOptionPane.showInputDialog(null, "Enter name to view phone number");
    for (int k = 0; k < i; k++)
    {
      if (in.equals(names[k]))
      {
        JOptionPane.showMessageDialog(null, numbers[k]);
      }
    } 
  }
} 