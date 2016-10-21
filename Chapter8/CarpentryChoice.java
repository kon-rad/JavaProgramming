import java.util.*;
/*
 * Created by Konrad Gnat
 * On:  October 19, 2016
 * Lesson: 8
 * Exercise: 3a
 * Title: Java Programming: Level I
 *
 * a. Write an application for Carl's Carpentry that shows a user 
 * a list of available items: table, desk, dresser, or entertainment 
 * center. Allow the user to enter a string that corresponds to one 
 * of the options, and display the price as $250, $325, $420, or $600,
 * accordingly. Display an error message if the user enters an invalid 
 * item. Save the file as CarpentryChoice.java
 *
 */
 
public class CarpentryChoice 
{
  public static void main(String[] args)
  {
    String[] items = {"table", "desk", "dresser", "entertainment center"};
    int[] itemsPrices = {250, 325, 420, 600};
    Scanner in = new Scanner(System.in);
    int reply = -1; 
    String userChoice;
    Boolean error = false;
    do 
    {  
       if (error)
         System.out.println("This item was not found, try again"); 
       System.out.println("List of available items, to see price type item name >>");
       for (int i = 0; i < items.length; i++)
       {
         System.out.println(items[i]);
       }
       userChoice = in.nextLine();
       for (int i = 0; i < items.length; i++)
       {
         if (userChoice.equalsIgnoreCase(items[i]))
         {
           reply = i;
           error = false;
         }
       }  
         if (reply == -1)
         {
           error = true;
         }  
    } while(error);    
    

    System.out.println("The price for " + userChoice + " is: $" 
      + itemsPrices[reply]);

    
  }
}