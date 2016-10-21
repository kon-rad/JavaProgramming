import java.util.*;
/*
 * Created by Konrad Gnat
 * On:  October 19, 2016
 * Lesson: 8
 * Exercise: 4
 * Title: Java Programming: Level I
 *
 * Create an application containing an array that stores eight 
 * integers. The applicaiton should 
 * (1) display all the integers, (2) display all the integers in 
 * reverse order, (3) display the sum of the eight intergers, (4) display 
 * all values less than 5, (5) display the lowest value (6) display the
 * higheset value (7) calculate and display the average, and (8) display all values
 * that are higher than the calculated average value. Save the 
 * file as NumberListDemo. java
 *
 */
 
public class NumberListDemo 
{
 public static void main(String[] args)
  {
    int[] eightInt = {32, 15, 7, 2, 4, 56, 13, 23};
    final int LENGTH = eightInt.length;
    // 1. Display all the integers
    System.out.println("1. Display all integers: ");   
    for (int val : eightInt)
    {
      System.out.print(val + " ");
    }
      
    // 2. Display all the integers in reverse order
    System.out.println("\n2. Display all integers in reverse order: ");     
    for (int i = LENGTH - 1; i >=0; i--)
    {
      System.out.print(eightInt[i] + " ");
    }
    
    // Display sum
    int sum = 0;
    for (int val : eightInt)
      sum += val;
    System.out.println("\n3. The sum of the eight integers: " + sum);   

    // 4. Display all values less than 5
    System.out.println("4. Display all values less than 5");   
    for (int i = 0; i < LENGTH; i++)
    {
      if (eightInt[i] < 5)
        System.out.print(eightInt[i] + " ");
    }
    // 5. Display the lowest value
    System.out.println("\n5. Display the lowest value:");
    Arrays.sort(eightInt);   
    System.out.println(eightInt[0]);
    
    // 6. Display the highest value
    System.out.println("6. Display the highest value:");  
    System.out.println(eightInt[LENGTH - 1]);
    
    // 7. Calculate and display the average
    System.out.println("7. Calculate and display the average:");  
    System.out.println(sum / LENGTH);
    
     // 8. Display all the values that are higher than the average
    System.out.println("8. Display all the values that are higher than the average:");  
    for (int val : eightInt)
      if (val > (sum / LENGTH))
      {
        System.out.print(val + " ");
      }

    

  }
}