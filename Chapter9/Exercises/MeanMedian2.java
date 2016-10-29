
/*
 * Created by Konrad Gnat
 * On:  October 29, 2016
 * Chapter: 9
 * Exercise: 2b
 * Title: Java Programming: Level I
 *
 * b. Revise the MeanMedian class so that the user can enter
 * any number of values up to 20. If the list has an even
 * number of values the median is the numeric average of the
 * values in the two middle positions. Save the file as 
 * MeanMedian2.java
 * 
 * 
 *
 */
import java.util.*; 
import javax.swing.*; 
 
 
public class MeanMedian2 {
  public static void main(String[] args) { 
    final String QUIT = "zzz";
    int inputInt, middleDigit, middlePosition1, middlePosition2, sum = 0;
    String input, display = " ";
    double meanDouble, median; 
    ArrayList<Integer> numbers = new ArrayList<Integer>(20);
    
    
    input = JOptionPane.showInputDialog(null, "Enter a digit"
      + "\nTo quit enter 'zzz'");

    while(!input.equals(QUIT) && numbers.size() < 20) {
      inputInt = Integer.parseInt(input);
      numbers.add(inputInt);
      input = JOptionPane.showInputDialog(null, "Enter a digit"
      + "\nTo quit enter 'zzz'");
    }
    Collections.sort(numbers);
    if (numbers.size() % 2 != 0) {
      middleDigit = numbers.size() / 2;
      median = numbers.get(middleDigit);
    } else {
      middleDigit = numbers.size() / 2;
      middlePosition1 = numbers.get(middleDigit - 1);
      middlePosition2 = numbers.get(middleDigit);
      median = (middlePosition1 + middlePosition2) / 2.0;
    }
    for (int i : numbers) {
      sum += i;
      display += i + " ";
    }
    meanDouble = sum / (double) numbers.size();
    
    
    JOptionPane.showMessageDialog(null, "You have entered "
       + display + "\nThe median is " + median 
       + "\nThe mean is " + meanDouble); 
  }
}


