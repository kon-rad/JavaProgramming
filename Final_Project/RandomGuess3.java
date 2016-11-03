/*
 * Created by Konrad Gnat
 * Course Number: CIS163AA
 * Section Number: Class # 36435
 * MEID: KON2155430
 * On:  November 2, 2016
 * Final Project 
 * Chapter: 6
 * Page: 346
 * Exercise: Game Zone 2
 * Title: Java Programming: Level I 
 *
 * 
 * In Chapter 1, you created a class called RandomGuess. In this game, 
 * players guess a number, the application generates a random number, and
 * players determine whether they were correct. In Chapter 5, you improved 
 * the application to display a message indicating whether the players 
 * guess was correct, too high, or toolow. Now, add a loop that 
 * continuously prompts the user for the number, indicating 
 * whether the guess is high or low, until the user enters the correct 
 * value. After the user correctly guesses the number, display a count 
 * of the number of attempts it took. Save the file as RandomGuess3.java.
 *
 * Additional Requirements: 
 * • Enhance the game so the player has to pick a number between 1 and 1,000.
 * • Once the player has figured out the correct number, ask if they would like to play again using the
 * Scanner class. If yes, restart the game with a new random number. If not, use the System.out.println();
 * method to display a message that thanks the user for playing the game. 
 * 
 *
 */  
import java.util.*;
import javax.swing.*;
 
 
public class RandomGuess3
{
    public static void main(String[] args) 
    {
        // Declare variables
        final int RANGE_MAX = 1000;
        final int RANGE_MIN = 1;        
        Scanner in = new Scanner(System.in); 
        int count = 0, userGuessInt;
        boolean playing = true; 
        String userGuess, playAgain;
        //Create random number guess
        int randomNumber = RANGE_MIN + (int)(Math.random() * ((RANGE_MAX - RANGE_MIN) + 1));
        
        //Playing game loop 
        do
        {
            //Prompt user for guess
            userGuess = JOptionPane.showInputDialog(null, "Guessing Game" 
                + "\nPick a number between 1 and 1,000");
            ++count;
            userGuessInt = Integer.parseInt(userGuess);
            //User guess is correct condition
            if (userGuessInt == randomNumber)
            { 
                JOptionPane.showMessageDialog(null, "Correct!"
                    + "\nIt took you " + count + " tries!");
                //Play again or end game 
                System.out.println("Would you like to play again?>>");
                playAgain = in.nextLine(); 
                if (playAgain.substring(0,1).toLowerCase().equals("y")) 
                { 
                    randomNumber = RANGE_MIN + (int)(Math.random() * ((RANGE_MAX - RANGE_MIN) + 1));
                    count = 0;
                }
                else
                {
                    System.out.println("Thank you for playing!");
                    playing = false;
                }   
            }
            //User guess is low condition
            else if (userGuessInt < randomNumber)
            {
                JOptionPane.showMessageDialog(null, "Too low"
                    + "\nTry again"); 
            }
            //User guess is high condition
            else if (userGuessInt > randomNumber)
            {
                JOptionPane.showMessageDialog(null, "Too high"
                    + "\nTry again"); 
            }
        }
        while(playing); 
    }
}