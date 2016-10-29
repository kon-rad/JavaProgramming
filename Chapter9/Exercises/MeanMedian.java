
/*
 * Created by Konrad Gnat
 * On:  October 29, 2016
 * Chapter: 9
 * Exercise: 2a
 * Title: Java Programming: Level I
 *
 * a. The mean of a list of numbers is its arithmetic average.
 * The median of a list is its middle value when the values 
 * are placed in order, for example, if a list contains 
 * 1,4,7,8, and 10, then the mean is 6 and the median is 7. 
 * Write an application that allows you to enter five integers
 * and displays the values, their mean, and their median. 
 * Save the file as MeanMedian.java
 * 
 * 
 *
 */
import java.util.*; 
import javax.swing.*; 
 
 
public class MeanMedian {
  public static void main(String[] args) {
    final double DIGITS_DOUBLE = 5.0;
    final int DIGITS_INT = 5;
    final int MIDDLE_INDEX = 2; 
    int inputInt, median, sum = 0;
    String input, display = " ";
    
    double mean;
    int[] numbers = new int[DIGITS_INT];
    for (int i = 0; i < numbers.length; i++) {
      input = JOptionPane.showInputDialog(null, "Enter a digit");
      inputInt = Integer.parseInt(input);
      numbers[i] = inputInt;
    }
    Arrays.sort(numbers);
    for (int i : numbers) {
      sum += i;
      display += (i + " ");
    } 
    mean =  sum / DIGITS_DOUBLE;
    
    median = numbers[MIDDLE_INDEX];
    JOptionPane.showMessageDialog(null, "You have entered: " 
      + display + "\nThe mean is: " + mean 
      + "\nThe median is: " + median);
  }
}