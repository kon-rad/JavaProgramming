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
 
 
public class Bicycle extends Vehicle
{
        
    public Bicycle()
    {
        super("a person", 2); 
    }
    
    // Set Methods
    public void setPrice()
    {
        String entry;
        final int MAX = 4000;
        entry = JOptionPane.showInputDialog(null, "Enter bicycle price");
        price = Integer.parseInt(entry);
        if(price > MAX)
            price = MAX;
    }   
    
    public String toString()
    {
        return("The bicycle is powered by " + getPowerSource() + 
            "; it has " + getWheels() + " wheels and costs $" + getPrice());
    }
    
}





 