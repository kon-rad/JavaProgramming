/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On:  December 15, 2016 
 * Chapter: 11
 * Page: 581-583
 * Using an Interface
 * Title: Java Programming: Level II 
 *
 *
 */   
import javax.swing.*;
 
public class InsuredCar extends Vehicle implements Insured
{ 
    public int coverage;
    
    public InsuredCar()
    {
        super("gas", 4);
        setCoverage();
    }
    
    public void setPrice()
    {
        String entry;
        final int MAX = 60000;
        entry = JOptionPane.showInputDialog(null, "Enter car price ");
        price = Integer.parseInt(entry);
        if(price > MAX)
            price = MAX;
    }
    
    public void setCoverage()
    {
        coverage = (int)(price * 0.9);
    }
    public int getCoverage()
    {
        return coverage;
    }
    
    public String toString()
    {
        return("The insured car is powered by " + getPowerSource() + 
            "; it has " + getWheels() + " wheels, costs $" + 
            getPrice() + " and is insured for $" + getCoverage());
    }
}





 