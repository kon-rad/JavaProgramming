/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On:  December 15, 2016 
 * Chapter: 11
 * Page: 595
 * Exercise: 3
 * Title: Java Programming: Level II 
 *
 * Description:
 * Create an abstract Auto class with fields for the car make and price. Include get
 * and set methods for these fields; the setPrice() method is abstract. Create two 
 * subclasses for individual automobile makers (for example, Ford or Chevy), and 
 * include appropriate setPrice() methods in each subclass (for example, $20,000 or
 * $22,000). Finally, write an application that uses the Auto class and subclasses
 * to display information about different cars. Save the files as Auto.java, 
 * Ford.java, Chevy.java, and UseAuto.java.
 *
 */   
import javax.swing.*;

 
 
public class UseAuto
{
    
    public static void main(String[] args)
    {
        Nissan aNissan = new Nissan();
        Tesla aTesla = new Tesla(); 
    }
}





 