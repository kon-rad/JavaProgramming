/*
 * Created by Konrad Gnat
 * Course Number: CIS163AA
 * Section Number: Class # 36435
 * MEID: KON2155430
 * On:  November 1, 2016
 * Final Project 
 * Chapter: 4
 * Page: 238
 * Exercise: 2
 * Title: Java Programming: Level I 
 *
 * Using the die class, write an application that randomly "throws" 
 * five dice for the computer and five dice for the player. Display 
 * the values and then, by observing the results, decide who wins 
 * based on the following hierarchy of Die values. (The computer will
 * not decide the winner; the player will determine the winner based
 * on observation.) Any higher combination beats a lower one; for 
 * example, five of a kind beats four of a kind.
 * - Five of a kind
 * - Four of a kind
 * - Three of a kind
 * - A pair
 * After you learn about decision making in the next chapter, you will
 * be able to make the program determine whether you or the computer 
 * had the better roll, and after you read the chapter Arrays, you will 
 * be able to make the determination more efficient. For now, just 
 * observe how the values change as you execute the program multipe 
 * times. Save the application as FiveDice.java
 *
 * Additional Requirements: 
 * Enhance the FiveDice class so that it stores the randomly “thrown” 
 * dice in an array of Die objects. Display the results for both the 
 * player and computer for each round. 
 * 
 *
 */ 
 
import java.util.*;
import javax.swing.*;
 
 
public class FiveDice
{
    public static void main(String[] args)
    { 
        //Declare variables
        final int NUMBER_OF_THROWS = 5;
        boolean playing = true;
        int input, count = 0;
        
        //Game loop
        do 
        {
            //Initialize display score strings
            String displayPlayerScore =   "\nPlayer:       ";
            String displayComputerScore = "\nComputer: ";
            String displayRound = "\nRound #";
            
            //Prompt user to begin game
            Object[] options = {"Roll Dice",
                                "Quit"}; 
            input = JOptionPane.showOptionDialog(null, "Five dice rolling game\nClick "
            + "'Roll dice' to start" 
            + "\nPlayer vs. computer", "Five Diece Rolling Game", JOptionPane.YES_NO_OPTION
            , JOptionPane.QUESTION_MESSAGE, null, options, options[0]); 
            //User begins game condition
            if (input == 0) 
            {
                //Initialize nested array of five dice throws for user and computer   
                Die[][] gameResults = new Die[2][NUMBER_OF_THROWS]; 
                for (int i = 0; i < NUMBER_OF_THROWS; i++) {
                    Die playerRoll = new Die();
                    gameResults[0][i] = playerRoll;
                    Die computerRoll = new Die();
                    gameResults[1][i] = computerRoll;
                } 
                //Create display string of results
                for (int i = 0; i < NUMBER_OF_THROWS; i++) {
                    displayPlayerScore += gameResults[0][i].displayDie() + " ";
                    displayComputerScore += gameResults[1][i].displayDie() + " ";
                }
                //Increase game round # count 
                ++count; 
                //Display scores
                JOptionPane.showMessageDialog(null, displayPlayerScore + displayComputerScore
                    + displayRound + count); 
            }
            //User quits game condition
            else 
            {
                playing = false;
            }
        }
        while (playing);
    }
}
