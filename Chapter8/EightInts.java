
/*
 * Created by Konrad Gnat
 * On:  October 19, 2016
 * Lesson: 8
 * Exercise: 1
 * Title: Java Programming: Level I
 *
 * Write an application that can hold eight integers in an array. 
 * Display the integers from first to last, and then display the 
 * integers from last to first. Save the file as EightInts.java
 *
 * Additional Requirements
 * Display the integers in the array from first to last using a for() loop.
 */
 
public class EightInts 
{
  public static void main(String[] args)
  {
    int[] arrayEightInt = {1, 2, 3, 4, 5, 6, 7, 8};
    for (int i = 0; i < arrayEightInt.length; i++) 
    {
      System.out.print(arrayEightInt[i]);
      if (i < arrayEightInt.length - 1)
        System.out.print(", ");
    }
    System.out.println();
    for (int j = arrayEightInt.length - 1; j >= 0; j--) 
    {
      System.out.print(arrayEightInt[j]);
      if (j > 0)
        System.out.print(", ");
    }
  }
}