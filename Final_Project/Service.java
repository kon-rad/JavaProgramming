
/*
 * Created by Konrad Gnat
 * Course Number: CIS163AA
 * Section Number: Class # 36435
 * MEID: KON2155430
 * On:  November 2, 2016
 * Final Project 
 * Chapter: 9
 * Page: 493
 * Exercise: 7
 * Title: Java Programming: Level I 
 *
 * 
 * a. Table 9-6 shows the various services offered by a hair salon, 
 * including its prices and times required:
 * 
 * Service Description       Price($)          Time(Minutes)
 * Cut                       8.00              15      
 * Shampoo                   4.00              10
 * Manicure                  18.00             30
 * Style                     48.00             55
 * Permanent                 18.00             35
 * Trim                      6.00              5
 * 
 * Create a class that holds the service description, price, and number
 * of minutes it takes to perform the service. Include a constructor 
 * that requires arguments for all three data fields and three get 
 * methods that each return one of the data field’s values. Save 
 * the class as Service.java.
 * 
 * b. Write an application named SalonReport that contains an array 
 * to hold six Service objects, and fill it with the data from Table 
 * 9-6. Include methods to sort the array in ascending order by each 
 * of the data fields. Prompt the user for the preferred sort order, 
 * and display the list of services in the requested order. Save the 
 * program as SalonReport.java.
 *
 * Additional Requirements: 
 * Enhance the program by displaying a menu that asks the user how 
 * they want to sort the services menu. 1) Sort by Service Description,
 * 2) Sort by Price, 3) Sort by Time (Minutes), or 0) to Exit. Add a 
 * do...while() loop that keeps prompting the user for the next 
 * preferred sort order until the user finally chooses “0” to
 * exit. 
 * 
 *
 */ 
 
import java.util.*;
import javax.swing.*;
 
 
public class Service
{
    //Data fields
    private String serviceDescription;
    private double servicePrice;
    private int serviceTime; 
    
    //Constructor
    public Service(String sd, double sp, int st)
    {
        serviceDescription = sd;
        servicePrice = sp;
        serviceTime = st; 
    }
    
    //Set methods
    public void setServiceDescription(String sd)
    {
        serviceDescription = sd;
    }
    public void setServicePrice(double sp)
    {
        servicePrice = sp;
    }
    public void setServiceTime(int st)
    {
        serviceTime = st;
    }
    //Get methods
    public String getServiceDescription()
    {
        return serviceDescription;
    }
    public double getServicePrice()
    {
        return servicePrice;
    }
    public int getServiceTime()
    {
        return serviceTime;
    }
}