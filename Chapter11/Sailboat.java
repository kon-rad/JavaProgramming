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
package com.vehicleswesell.vehicle;
import javax.swing.*;
 
 
public class Sailboat extends Vehicle
{
    private int length;
    
    public Sailboat()
    {
        super("wind", 0);
        setLength();
    }
    
    // Set Methods
    public void setLength()
    {
        String entry;
        entry = JOptionPane.showInputDialog(null, "Enter sailboat length infeet ");
        length = Integer.parseInt(entry);
    }
    public int getLength()
    {
        return length;
    }
    
    public void setPrice()
    {
        String entry;
        final int MAX = 100000;
        entry = JOptionPane.showInputDialog(null, "Enter sailboat price");
        price = Integer.parseInt(entry);
        if(price > MAX)
            price = MAX;
    }   
    public String toString()
    {
        return("The " + getLength() + " foot sailboat is powered by " + getPowerSource() 
            + "; it has " + getWheels() + " wheels and costs $" + getPrice());
    }
}





 