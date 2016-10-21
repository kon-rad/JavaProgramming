import java.util.*;
/*
 * Created by Konrad Gnat
 * On:  October 19, 2016
 * Lesson: 8
 * Exercise: 2
 * Title: Java Programming: Level I
 *
 * Allow a user to enter any number of double values up to 10.
 * The user should enter 99999 to quit entering numbers. Display
 * an error message if the user quits without entering any 
 * numbers; otherwise, display each entered value and its 
 * distance from the average. Save the file as 
 * DistanceFromAverage.java.
 *
 */
 
public class DistanceFromAverage 
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int count = 0; 
    double total = 0;
    double average = 0;
    final int QUIT = 99999;
    final int MAX = 10;
    double[] entries = new double[10];
    double userIn;
    
    System.out.println("Enter any number of digits up to "
      + MAX + ", to quit enter 99999 >>");
    userIn = in.nextDouble();
    while ((userIn == QUIT && count == 0) || userIn != QUIT && count < 10) 
    {
      if (userIn == QUIT && count == 0)
      {
        System.out.println("Error: you must enter at least one number");
        System.out.println("Enter any number of digits up to "
          + MAX + ", to quit enter 99999 >>");
        userIn = in.nextDouble();
      }
      if (userIn != QUIT)
      {
        entries[count] = userIn;
        total += entries[count];
        System.out.println("Continue entering digits up to "
          + MAX + ", to quit enter 99999 >>");
        userIn = in.nextDouble();
        count++;
      } 
    } 
    average = total / count;
    System.out.println("You have entered: ");
    for (int i = 0; i < count; i++) 
    {
      System.out.print(entries[i] + " Distance from average: " 
        + Math.abs(average - entries[i]));
      if (i != count - 1)
        System.out.print("\n");
    }
    System.out.println("\nThe average of the above numbers is: "
      + average);
  }
}