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

 
 
public class PickMenu2
{
    private Menu2 briefMenu;
    private String guestChoice = new String();
    
    public PickMenu2(Menu2 theMenu) throws MenuException
    {
        briefMenu = theMenu;
        setGuestChoice();
    }
    
    public void setGuestChoice() throws MenuException
    {
        JOptionPane.showMessageDialog(null, "Choose from the following menu:");
        guestChoice = briefMenu.displayMenu();
    }
    public String getGuestChoice()
    {
        return(guestChoice);
    } 
}



