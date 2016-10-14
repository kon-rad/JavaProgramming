import javax.swing.JOptionPane;
/*
 * Created by Konrad Gnat
 * On:  October 13, 2016
 * Lesson: 7
 * Exercise: 8
 * Title: Java Programming: Level I
 *
 * Three-letter acronyms are common in the business world. For example,
 * in Java you use the IDE (Integrated Development Environment)...
 */
 

public class ThreeLetterAcronym 
{
    static int wordCount = 1;  

    public static void main(String[] args) 
    {
      String originalEntry, acronym;
      char c, letter1 = ' ', letter2 = ' ', letter3 = ' ';
      int count = 0;
      acronym = JOptionPane.showInputDialog(null, 
        "Please enter three words:");
      originalEntry = acronym;
      
      wordCheck(originalEntry);
      // while loop to validate input
      while (wordCount != 3) 
      { 
        acronym = JOptionPane.showInputDialog(null, 
          "Error: incorrect number of words entered"
          + "\n Please enter three words:");
        originalEntry = acronym;
        wordCount = 1;
        wordCheck(originalEntry);
      }

      for (int i = 0; i < acronym.length(); i++)
      {
        if (i == 0) 
        {
          letter1 = Character.toUpperCase(acronym.charAt(i));
        }
        else 
          {
          if (acronym.charAt(i) == ' ' && count == 0)
          {
            letter2 = Character.toUpperCase(acronym.charAt(i + 1));
            ++count;
          }
          else if (acronym.charAt(i) == ' ' && count == 1)
          { 
            letter3 = Character.toUpperCase(acronym.charAt(i + 1));
          }
        }
      }
      JOptionPane.showMessageDialog(null, "Original phrase was " + 
        originalEntry + "\nThree letter acronym is " + 
        letter1 + letter2 + letter3);
    }
    
    
    // function checks if three words are entered   
    public static void wordCheck(String input) 
    {
      for (int i = 0; i < input.length(); i++)
      {
        if (input.charAt(i) == ' ' && input.charAt(i + 1) != ' ') 
        {
          wordCount++;
        }
      }
    }
}