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

 
 
public class MenuException extends Exception
{
    public MenuException(String choice)
    {
        super(choice);
    }
             
}





 