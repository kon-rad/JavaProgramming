import java.util.Scanner;
/*
 * Created by Konrad Gnat
 * On:  October 14, 2016
 * Lesson: 7
 * Exercise: 10
 * Title: Java Programming: Level I
 *
 * Write an application that determines whether a phrase 
 * entered by the user is a palindrome. A palindrome is a 
 * phrase that reads the same backward and forward without 
 * regarding capitalization or punctuation. For example 
 * "Was it a car or a cat I saw?" and "Madam, I'm Adam" are 
 * palindromes. Save the file as Palindrome.java. 
 */

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String result = "IS NOT a palindrome.";
        StringBuilder reverse = new StringBuilder();
        StringBuilder noPunctuation = new StringBuilder();
        String noPunctuationString;
        String reverseString;

        // User enters phrase        
        System.out.println("Enter a phrase to check if it's a palindrome >>");
        String input = in.nextLine();
        
        // Build a reverse of input 
        for (int i = (input.length() - 1); i >= 0; i--) {
            if (!Character.isLetter(input.charAt(i)))
                continue;
            reverse.append(input.charAt(i));
        }
        // Build a version of input without spaces or punctuation
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isLetter(input.charAt(i)))
                continue;
            noPunctuation.append(input.charAt(i));
        }
      
        reverseString = reverse.toString();
        noPunctuationString = noPunctuation.toString();
        if (noPunctuationString.regionMatches(true, 0, reverseString, 0, reverseString.length()))
            result = "IS a palindrome.";
        
        System.out.println("You had entered: " + input +
            "\n This phrase " + result);

    }
}        