/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On:  December 20, 2016 
 * Chapter: 12
 * Page: 649
 * Title: Java Programming: Level II 
 *
 * You Do It:
 * Creating a Class That Automatically Throws Exceptions
 *
 */   
import javax.swing.*;

 
 
public class Menu
{
    private String[] entreeChoice = {"Rosemary Chicken", "Beef Wellington",
        "Maine Lobster"};
    private String menu = "";
    private int choice;
    
    public String displayMenu()
    {
        for (int x = 0; x < entreeChoice.length; ++x)
        {
            menu = menu + "\n" + (x + 1) + " for " + entreeChoice[x];
        }
        String input = JOptionPane.showInputDialog(null, "Type your selection, then press Enter."
            + menu);
        choice = Integer.parseInt(input);
        return(entreeChoice[choice - 1]);
    } 
}





 