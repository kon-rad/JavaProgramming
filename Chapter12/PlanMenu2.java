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

 
 
public class PlanMenu2
{
    public static void main(String[] args)
    {
        Menu2 briefMenu = new Menu2();
        PickMenu2 entree = null;
        String guestChoice = new String();
        
        try 
        {
            PickMenu2 selection = new PickMenu2(briefMenu);
            entree = selection;
            guestChoice = entree.getGuestChoice();
        }
        catch(MenuException error)
        {
            guestChoice = error.getMessage();
        }
        catch(Exception error)
        {
            guestChoice = "an invalid selection";
        }
        
        JOptionPane.showMessageDialog(null, "You chose " + guestChoice);
    }
         
}





 