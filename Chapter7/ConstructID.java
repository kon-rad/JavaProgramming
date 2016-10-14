import javax.swing.JOptionPane;
/*
 * Created by Konrad Gnat
 * On:  October 13, 2016
 * Lesson: 7
 * Exercise: 11
 * Title: Java Programming: Level I
 *
 * Write an application that prompts a user for a full name and 
 * street address and constructs and ID from the user's...
 */
 

public class ConstructID 
{
  public static void main(String[] args) 
  {
    String input;
    int digits = 0;
    input = JOptionPane.showInputDialog( null,
      "Please enter your full name and address");
    StringBuilder id = new StringBuilder();
    for (int i = 0; i < input.length(); i++)
    {
      if (i == 0)
      {
        id.append(Character.toUpperCase(input.charAt(i)));
      }
      if (input.charAt(i) == ' ' && digits == 0 
        && !Character.isDigit(input.charAt(i + 1)))
      {
        i++;
        id.append(Character.toUpperCase(input.charAt(i)));
      }
      if (Character.isDigit(input.charAt(i)))
      { 
        digits++;
        id.append(Character.toUpperCase(input.charAt(i)));
      }
    }
    JOptionPane.showMessageDialog(null,"Your ID is: " + id); 
  }
}    
