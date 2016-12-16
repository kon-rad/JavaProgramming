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
 
 
public class CarRental
{

    // Declare data fields
    private String renterName;
    private int zipCode;
    private int carSize;
    private double dailyFee;
    private int lengthDays;
    private double totalFee;
    private final double[] DAILY_FEE = { 29.99, 38.99, 43.50 };
    private final String[] CAR_SIZE = {"economy", "midsize", "full" };
    NumberFormat currency = NumberFormat.getCurrencyInstance();

    
    // Constructor 
    public CarRental(String name, int zip, int size, int days)
    {
        renterName = name;
        zipCode = zip;
        carSize = size;
        lengthDays = days;
        if (size == 1)
        {
            dailyFee = DAILY_FEE[0];
            totalFee = days * DAILY_FEE[0];
        } else if (size == 2)
        {
            dailyFee = DAILY_FEE[1];
            totalFee = days * DAILY_FEE[1];
        } else if (size == 3)
        {
            dailyFee = DAILY_FEE[2];
            totalFee = days * DAILY_FEE[2];
        } 
    }
    
    // Get Methods
    public String getRenterName()
    {
        return renterName;
    }
    public int getZipCode()
    {
        return zipCode;
    }
    public String getCarSize()
    {
        return CAR_SIZE[carSize - 1];
    }
    public double getDailyFee()
    {
        return dailyFee;
    }
    public int getLengthDays()
    {
        return lengthDays;
    }
    public double getTotalFee()
    {
        return dailyFee;
    } 
    
    // Display Methods
    public void displayCarRental() 
    {
        System.out.println("Renter's Name: " + renterName + "\nZip Code: "
            + zipCode + "\nCar Size: " + CAR_SIZE[carSize - 1] + "\nDaily Fee: " + currency.format(dailyFee) 
            + "\nNumber of days: " + lengthDays + "\nTotal Fee: " + currency.format(totalFee));
    }         
}





 