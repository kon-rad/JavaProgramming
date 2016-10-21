import java.util.*;
/*
 * Created by Konrad Gnat
 * On:  October 19, 2016
 * Lesson: 8
 * Exercise: 3b
 * Title: Java Programming: Level I
 *
 * b. It might not be reasonable to expect users to type long 
 * entries such as "entertainment center" accurately. Modify 
 * the CarpentryChoice class so that as long as the user enters 
 * the first three characters of a furniture item, the choice 
 * is considerd valid. Save the file as CarpentryChoice2.java 
 *
 */
 
public class CarpentryChoice2 
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
         if (items[i].contains(userChoice))
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
    

    System.out.println("The price for " + items[reply] + " is: $" 
      + itemsPrices[reply]);

    
  }
}