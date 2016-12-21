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
 * Creating a Class That Passes on an Exception Object
 * Creating an Application That Can Catch Exceptions
 * Extending a Class That Throws Exceptions
 * Creating an Exception Class
 * 
 */   
import javax.swing.*;

 
 
public class Menu2
{
    protected String[] entreeChoice = {"Rosemary Chicken", "Beef Wellington",
        "Maine Lobster"};
    private String menu = "";
    private int choice;
    protected char initial[] = new char[entreeChoice.length];
    
    public String displayMenu() throws MenuException
    {
        for (int x = 0; x < entreeChoice.length; ++x)
        {
            menu = menu + "\n" + (x + 1) + " for " + entreeChoice[x];
            initial[x] = entreeChoice[x].charAt(0);
        }
        String input = JOptionPane.showInputDialog(null, "Type your selection, then press Enter."
            + menu);
        for(int y = 0; y < entreeChoice.length; ++y)
            if(input.charAt(0) == initial[y])
                throw (new MenuException(entreeChoice[y]));
        choice = Integer.parseInt(input);
        return(entreeChoice[choice - 1]);
    } 
}





 