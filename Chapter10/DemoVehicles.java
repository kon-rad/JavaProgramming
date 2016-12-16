/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On:  December 15, 2016 
 * Chapter: 11
 * Page: 552
 * Creating an Abstract Class Exercise
 * Title: Java Programming: Level II 
 *
 *
 */  
import javax.swing.*;
 
 
public class DemoVehicles
{ 
    public static void main(String[] args)
    {
        Sailboat aBoat = new Sailboat();
        Bicycle aBike = new Bicycle();
        
        JOptionPane.showMessageDialog(null, "\nVehicle descriptions:\n" + aBoat.toString() 
            + "\n" + aBike.toString());
    }
}





 