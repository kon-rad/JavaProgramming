/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On:  December 14, 2016 
 * Chapter: 10
 * Page: 540
 * Exercise: 5
 * Title: Java Programming: Level II 
 *
 * Description:
 * Every summer, Leeland Lakeside resort rents cabins by the week. 
 * Create a class named CabinRental that includes an integer field for 
 * the cabin number and a double field for the weekly rental rate.
 * Include get methods for these fields and a constructor that requires
 * an integer argument representing the cabin number. The constructor
 * sets the weekly rate based on the cabin number; cabins numbered 1, 2,
 * and 3 are $950 per week, and others are $1,100 per week. 
 *  
 * Write a Java file named DemoCabinRental that creates an 
 * object of each class, and demonstrate that all the methods work correctly. 
 * Save the files as CabinRental.java, HolidayCabinRental.java, 
 * and DemoCabinRental.java.
 *
 */  

 
 
public class CabinRental
{

    // Declare data fields
    private int cabinNumber;
    private double rentalRate;
    
    // Constructor 
    public CabinRental(int num)
    {
        cabinNumber = num;
        if (num == 1 || num == 2 || num == 3)
        {
            rentalRate = 950.00;
        } 
        else 
        {
            rentalRate = 1000.00;
        }
    }
    
    // Get Methods
    public int getCabinNumber() 
    {
        return cabinNumber;
    }
    public double getRentalRate() 
    {
        return rentalRate;
    }         
}


