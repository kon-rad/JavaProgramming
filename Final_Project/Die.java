
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
 * Additional Requirements:
 * Enhance the FiveDice class so that it stores the randomly “thrown” 
 * dice in an array of Die objects. Display the results for both the 
 * player and computer for each round. 
 * 
 *
 */ 
 
 
public class Die
{
    //Data field
    private int dieValue;
    
    // Constructor
    public Die() 
    {
        final int HIGHEST_DIE_VALUE = 6;
        final int LOWEST_DIE_VALUE = 1;
        int randomValue = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
        dieValue = randomValue;
    }
    
    // Display value method
    public int displayDie() 
    {
        return dieValue;
    }
}

    