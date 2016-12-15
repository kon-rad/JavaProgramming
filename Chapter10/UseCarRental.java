/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On:  December 15, 2016 
 * Chapter: 10
 * Page: 541
 * Exercise: 7
 * Title: Java Programming: Level II 
 *
 * Description:
 * Create a class named CarRental that contains fields that hold a renter’s 
 * name, zip code, size of the car rented, daily rental fee, length of rental
 * in days, and total rental fee. The class contains a constructor that requires
 * all the rental data except the daily rate and total fee, which are calculated,
 * based on the size of the car: economy at $29.99 per day, midsize at
 * $38.99 per day, or full size at $43.50 per day. The class also includes
 * a display() method that displays all the rental data.
 * 
 * Create a subclass named LuxuryCarRental. This class sets the rental 
 * fee at $79.99 per day and prompts the user to respond to the option of including
 * a chauffeur at $200 more per day. Override the parent class display() method 
 * to include chauffeur fee information.
 * 
 * Write an application named UseCarRental that prompts the user for the data 
 * needed for a rental and creates an object of the correct type. Display the 
 * total rental fee.
 *
 */  
import javax.swing.*;

 
 
public class UseCarRental
{

    public static void main(String args[]) 
    {
        carRental().displayCarRental();
        luxuryCarRental().displayCarRental();
    } 
     
    // Method creates car rental object  
    public static CarRental carRental()
    {
        String inputName, inputZip, inputSize, inputDays; 
        int inputZipInt, inputSizeInt, inputDaysInt;
        
        inputName = JOptionPane.showInputDialog(null, "Please enter your name:");
        inputZip = JOptionPane.showInputDialog(null, "Please enter your zip code:");
        inputZipInt = Integer.parseInt(inputZip);
        inputSize = JOptionPane.showInputDialog(null, "Please enter car size (1: economy 2: midsize 3: full):");
        inputSizeInt = Integer.parseInt(inputSize);
        inputDays = JOptionPane.showInputDialog(null, "Please enter number of days:");
        inputDaysInt = Integer.parseInt(inputDays);
        
        CarRental carRentalObject001 = new CarRental(inputName, inputZipInt, inputSizeInt, inputDaysInt);
        
        return carRentalObject001;

    }  
    
    // Method creates luxury car rental object  
    public static LuxuryCarRental luxuryCarRental()
    {
        String inputName, inputZip, inputSize, inputDays; 
        int inputZipInt, inputDaysInt;
        
        inputName = JOptionPane.showInputDialog(null, "Please enter your name:");
        inputZip = JOptionPane.showInputDialog(null, "Please enter your zip code:");
        inputZipInt = Integer.parseInt(inputZip);
        inputDays = JOptionPane.showInputDialog(null, "Please enter number of days:");
        inputDaysInt = Integer.parseInt(inputDays);
        
        LuxuryCarRental luxuryCarRentalObject001 = new LuxuryCarRental(inputName, inputZipInt, 1, inputDaysInt);
        
        return luxuryCarRentalObject001;
    } 
}





 