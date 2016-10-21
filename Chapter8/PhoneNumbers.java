import javax.swing.*;
import java.util.*;

/*
 * Created by Konrad Gnat
 * On:  October 20, 2016
 * Lesson: 8
 * Exercise: 11
 * Title: Java Programming: Level I
 *
 * A personal phone directory contains room for the first 
 * names and phone numbers for 30 people. Assign names and 
 * phone numbers for the first 10 people. Prompt the user 
 * for a name, and if the name is found in the list, 
 * display the corresponding phone number. If the name is 
 * not found in the list, prompt the user for a phone 
 * number, and add the new name and phone number to the 
 * list. Continue to prompt the user for names until the 
 * user enters "quit". After the arrays are full 
 * (containing 30 names), do not allow the user to add 
 * new entries. Save the file as PhoneNumbes.java
 *
 */
 
public class PhoneNumbers 
{
  public static void main(String[] args)
  {
    final String QUIT = "quit";
    boolean found;
    String input = "";
    String inNum = "";
    int j = 10;
    String[] names = {"Mark", "Cindy", "Lin", "Jesi", "Pat", 
      "Micheal", "Thomas", "Teresa", "Olga", "Mandy", null, 
       null, null, null, null, null, null, null, null, null,
        null, null, null, null, null, null, null, null, null,
         null};
    int[] numbers = {4536666, 8976545, 1234567, 1111111, 4564567, 
      7867776, 8756123, 4530589, 4536666, 4532312, 0, 0, 0,
       0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    while (!input.equals(QUIT) && j < 30)
    { 
      found = false;
      input = JOptionPane.showInputDialog(null, "Enter name to "
        + "search for phone number");
      if (!input.equals(QUIT))
      {
         for (int i = 0; i < names.length && !found; i++)
         {
           if (input.equals(names[i]))
           {
             JOptionPane.showMessageDialog(null, names[i]
           + "'s phone number is " + numbers[i]);
           found = true;
           } 
         }  
         if(!found)
         {
           inNum = JOptionPane.showInputDialog(null, input + " was not found "
             + "\nTo add " + input + " to phonebook enter phone number"); 
           names[j] = input;
           numbers[j] = Integer.parseInt(inNum);  
           j++; 
         }
      }
    }
  }
}