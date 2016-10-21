import javax.swing.*;
import java.util.Arrays;
/*
 * Created by Konrad Gnat
 * On:  October 20, 2016
 * Lesson: 8
 * Exercise: 5
 * Title: Java Programming: Level I
 *
 * Write an application that accepts up to 20 Strings. Divide them into two lists - one
 * for short Strings that are five characters or fewer, and the other for long Strings.
 * After data entry is complete, prompt the user to enter which type of String to
 * display, and then output the correct list. If there are no Strings in a requested list,
 * then output an appropriate message. Save the file as DivideStrings.java.
 *
 */
 
public class DivideStrings 
{
  public static void main(String[] args)
  {
    String[] shortStrings = new String[10];
    String[] longStrings = new String[10];
    int shortIndex = -1;
    int longIndex = -1;
    int j = 0;
    int count = 0;
    String stringIn;
    String strOne;
    String shortArr;
    String longArr;
    
    stringIn = JOptionPane.showInputDialog(null, "Enter up to 20 strings, seperated by spaces");
    for (int i = 0; i < stringIn.length(); i++)
    {
      if (stringIn.charAt(i) == ' ' && count == 0)
      {
        count++;
        strOne = stringIn.substring(0, i);
        j = i;
        if (strOne.length() <= 5)
        {
          shortIndex++;
          shortStrings[shortIndex] = strOne;
          shortIndex++;
        }
        else
        {
          longIndex++;
          longStrings[longIndex] = strOne;
          longIndex++;
        } 
      }
      else if (stringIn.charAt(i) == ' ' && count > 0)
      {
        strOne = stringIn.substring(j + 1, i);
        j = i;
        if (strOne.length() <= 5)
        {
          shortStrings[shortIndex] = strOne;
          shortIndex++;
        }
        else
        {
          longStrings[longIndex] = strOne;
          longIndex++;
        } 
      }
      else if (i == stringIn.length() - 1)
      {
        strOne = stringIn.substring(j + 1, i);
        j = i;
        if (strOne.length() <= 5)
        {
          shortStrings[shortIndex] = strOne;
          shortIndex++;
        }
        else
        {
          longStrings[longIndex] = strOne;
          longIndex++;
        } 
      }
    }
    shortArr = Arrays.toString(shortStrings);
    longArr = Arrays.toString(longStrings);
    String userChoice = JOptionPane.showInputDialog(null, "Which list do you wish to see? " 
      + "\nFor list of short strings enter 1\nFor list of long strings enter 2");
    int userChoiceInt = Integer.parseInt(userChoice);
    if (userChoiceInt == 1)
    {
       if(shortIndex == -1)
         JOptionPane.showMessageDialog(null, "This list is empty");
       else
          JOptionPane.showMessageDialog(null, "List of short strings: " + 
            shortArr);
    }
    else if (userChoiceInt == 2)
    {
      if(longIndex == -1)
         JOptionPane.showMessageDialog(null, "This list is empty");
       else
         JOptionPane.showMessageDialog(null, "List of long strings: " + 
           longArr);
    }
  }
}  
           