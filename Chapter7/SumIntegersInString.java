import java.util.Scanner;
/*
 * Created by Konrad Gnat
 * On:  October 14, 2016
 * Lesson: 7
 * Exercise: 9
 * Title: Java Programming: Level I
 *
 * Prompt a user to enter a series of integers seperated 
 * by spaces and accept the input as a String. Display 
 * the list of integers and their sum. Save the file as
 * SumIntegersInString.java.
 */

public class SumIntegersInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("Enter a series of numbers seperated by spaces >>");
        String inputString = in.nextLine();
        String original = inputString;
        
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == ' ') {
                sum += Integer.parseInt(inputString.substring(0, i));
                inputString = inputString.substring(i + 1, inputString.length());
                i = 0;
            }
            if (i == (inputString.length() - 1) && inputString.length() > 0) {
                sum += Integer.parseInt(inputString);
            }
        }
     System.out.println("You had entered: " + original +
         "\n The sum of which equals: " + sum);

    }
}        