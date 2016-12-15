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
import java.text.NumberFormat;
import javax.swing.*;

 
 
public class LuxuryCarRental extends CarRental
{

    // Declare data fields
    private boolean chauffeur;
    private final double LUXURY_DAILY_FEE = 79.99;
    private double luxuryTotalFee; 
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    // Constructor 
    public LuxuryCarRental(String name, int zip, int size, int days)
    {
        super(name, zip, size, days);
        String chauffeurInput = JOptionPane.showInputDialog(null, "Would you like a chauffeur? (y/n)");
        if (Character.toLowerCase(chauffeurInput.charAt(0)) == 'y')
        {
            chauffeur = true;
            luxuryTotalFee = days * (LUXURY_DAILY_FEE + 200);
        } 
        else
        {
            chauffeur = false;
            luxuryTotalFee = days * LUXURY_DAILY_FEE;
        }
    }
    
    // Get Methods
    public String getChauffeur()
    {
        if (chauffeur)
        {
            return "Yes";
        }
        else 
        {
            return "No";
        }
    }
    
    // Display Methods
    public void displayCarRental() 
    {
        System.out.println("Renter's Name: " + super.getRenterName() + "\nZip Code: "
            + super.getZipCode() + "\nCar Size: " + super.getCarSize() + "\nChauffeur: " + this.getChauffeur() 
            + "\nDaily Fee: " + LUXURY_DAILY_FEE + "\nNumber of days: " + super.getLengthDays() + "\nTotal Fee: " 
            + currency.format(luxuryTotalFee));
    }         
}





 