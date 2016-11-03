
/*
 * Created by Konrad Gnat
 * Course Number: CIS163AA
 * Section Number: Class # 36435
 * MEID: KON2155430
 * On:  October 31, 2016
 * Final Project Chapter: 2
 * Exercise: 1
 * Page: 115
 * Title: Java Programming: Level I 
 *
 * Mad Libs is a children's game in which the players provide a few words that are then 
 * incorporated into a silly story. The game helps children understand different 
 * parts of speech because they are asked to provide specific types of words. For 
 * example, you might ask a child for a noun, another noun, an adjective, and a 
 * past-tense verb. The child might reply with such answers as table, book, silly,
 * and studied. The newly created Mad Lib might be:
 *
 * Mary had a little table
 * Its book was silly as snow
 * And everywhere that Mary studied
 * The table was sure to go.
 *
 * Create a Mad Lib program that asks the user to provide at least four or five
 * words, and then create and display a short story or nursery rhyme that uses
 * them. Save the file as MadLib.java.
 *
 * Additional Instructions: 
 * Use the JOptionPane class to acquire a minimum of six words from the user to include in the Mad Lib.
 *
 * Ask the user if they would like to play the game again with a Confirm Dialog box using the
 * JOptionPane.YES_NO_OPTION. If yes, ask the user for new words and redisplay the new Mad Lib using
 * them. 
 * 
 *
 */
 
import javax.swing.*; 
 
 
public class MadLibs
{
    public static void main(String[] args) 
    {
        //Declare variables
        String word01Verb, word02Noun, word03Verb, word04Noun, word05Verb, word06Noun;
        int dialogResult = 0;
        
        //Program loop
        do 
        {
            //Prompt user for mad lib words
            word01Verb = JOptionPane.showInputDialog(null, "Enter a verb");
            word02Noun = JOptionPane.showInputDialog(null, "Enter a noun");
            word03Verb = JOptionPane.showInputDialog(null, "Enter another verb");
            word04Noun = JOptionPane.showInputDialog(null, "Enter another noun");
            word05Verb = JOptionPane.showInputDialog(null, "Enter another verb");
            word06Noun = JOptionPane.showInputDialog(null, "Enter another noun");
             
            //Display mad lib 
            JOptionPane.showMessageDialog(null, "Hush, little baby, don't " 
                + word01Verb + " a word,\nMama's gonna buy you a " + word02Noun 
                + ".\nAnd if that " + word02Noun + " don't " + word03Verb 
                + ",\nMama's gonna buy you a " + word04Noun + ".\nAnd if that " 
                + word04Noun + " " + word05Verb 
                + ",\nyou'll still be the sweetest little baby in " + word06Noun + ".");
            
            //Play again prompt  
            dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to play again?", "Play again?", JOptionPane.YES_NO_OPTION);
                 
        } while(dialogResult == 0);
    }
} 
