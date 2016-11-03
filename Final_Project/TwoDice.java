/*
 * Created by Konrad Gnat
 * Course Number: CIS163AA
 * Section Number: Class # 36435
 * MEID: KON2155430
 * On:  October 31, 2016
 * Final Project 
 * Chapter: 4
 * Page: 238
 * Exercise: 1
 * Title: Java Programming: Level I 
 *
 * Dice are used in many games. One die can be thrown to randomly show a 
 * value from 1 through 6. Design a Die class that can hold an integer 
 * data field for a value (from 1 to 6). Include a constructor that 
 * randomly assigns a value to a die object. To fully understand the 
 * process, you must learn more about Java classes and methods. However
 * ,for now , you can copy the following statement to generate a random 
 * number between 1 and 6 and assign it to a variable. Using this 
 * statement assumes you have assigned appropriate values to the 
 * static constants. 
 *  
 * randomValue = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE +LOWEST_DIE_VALUE);
 *
 * Also include a method in the class to return a die’s value. Save the class 
 * as Die.java.
 *
 * Write an application that randomly “ throws ” two dice and displays 
 * their values. After you read the chapter Making Decisions , you will 
 * be able to have the game determine the higher die. For now, just observe 
 * how the values change as you execute the program multiple times. Save the
 * application as TwoDice.java 
 * 
 *
 */ 
 
import java.util.*;
import javax.swing.*;
 
 
public class TwoDice
{
    public static void main(String[] args)
    {
        //Declare variables
        ArrayList<Integer> playerResultsArray = new ArrayList<Integer>(20);
        ArrayList<Integer> computerResultsArray = new ArrayList<Integer>(20);
        boolean playing = true;
        int input, count = 0;
        String displayPlayerScore =   "\nPlayer:       ";
        String displayComputerScore = "\nComputer: ";
        String resultMessage = "";
        
        //Game loop
        do 
        {
            //Prompt user to begin game
            Object[] options = {"Roll Die",
                                "View score and quit"}; 
            input = JOptionPane.showOptionDialog(null, "Dice rolling game\nClick "
            + "'Roll die' to start\nRound #" + (count + 1) 
            + "\nPlayer vs. computer", "Die Rolling Game", JOptionPane.YES_NO_OPTION
            , JOptionPane.QUESTION_MESSAGE, null, options, options[0]); 
            
            //Game start condition
            if (input == 0) 
            {
                //Create two dice objects
                Die player = new Die();
                playerResultsArray.add(player.displayDie());
                Die computer = new Die();
                computerResultsArray.add(computer.displayDie());
                
                //Decide game result
                if(player.displayDie() > computer.displayDie())
                    resultMessage = "You win!"; 
                else if (player.displayDie() < computer.displayDie())
                    resultMessage = "You lose!"; 
                else if (player.displayDie() == computer.displayDie())
                    resultMessage = "It's a tie!"; 
                
                //Create display score string
                displayPlayerScore += playerResultsArray.get(count) + " ";
                displayComputerScore += computerResultsArray.get(count) + " ";
                
                JOptionPane.showMessageDialog(null, "" + resultMessage);
                  
                ++count; 
            } 
            
            //Game end condition 
            else 
            {
                playing = false;
            } 
            //Display score
            JOptionPane.showMessageDialog(null, "Results: " + displayPlayerScore 
            +  displayComputerScore); 
        }
        while (playing);
    }
}
