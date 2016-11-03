
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
 
import javax.swing.*;
 
 
public class SalonReport
{
    public static void main(String[] args)
    {
        //Declare variables
        int i, j;
        boolean running = true;
        String sortOrder;
        Service temp;
        Service[] serviceMenu = new Service[6];
        serviceMenu[0] = new Service("Cut", 8.00, 15);
        serviceMenu[1] = new Service("Shampoo", 4.00, 10); 
        serviceMenu[2] = new Service("Manicure", 18.00, 30); 
        serviceMenu[3] = new Service("Style", 48.00, 55); 
        serviceMenu[4] = new Service("Permanent", 18.00, 35);
        serviceMenu[5] = new Service("Trim", 6.00, 5);  
       
        //Program loop
        do
        {
            //Display sort user prompt
            sortOrder   = JOptionPane.showInputDialog(null, "Welcome "
                + "Salon Report\nHow would you like to sort the menu?"
                + "\nEnter description, price or time"
                + "\nTo quit enter '0'"); 
            //Bubble sort cases
            for   (i = 0; i < serviceMenu.length - 1; i++) 
            {
                for (j =   0; j < serviceMenu.length - 1;   j++) 
                {
                    if (sortOrder.equals("description"))
                    {   
                        if (serviceMenu[j].getServiceDescription().compareTo(serviceMenu[j   + 1].getServiceDescription()) > 0 ) 
                        {  
                            temp = serviceMenu[j];
                            serviceMenu[j]   = serviceMenu[j + 1];
                            serviceMenu[j + 1] =   temp;
                        }
                    }
                    else if (sortOrder.equals("price"))
                    { 
                        if (serviceMenu[j].getServicePrice() > serviceMenu[j + 1].getServicePrice()) 
                        {  
                            temp = serviceMenu[j];
                            serviceMenu[j]  = serviceMenu[j + 1];
                            serviceMenu[j + 1] =  temp;
                        }
                    }
                    else if (sortOrder.equals("time"))
                    { 
                        if (serviceMenu[j].getServiceTime() > serviceMenu[j + 1].getServiceTime()) 
                        {  
                            temp = serviceMenu[j];
                            serviceMenu[j]  = serviceMenu[j + 1];
                            serviceMenu[j + 1] =  temp;
                        }
                    } 
                }
            } 
            //Quit option
            if (sortOrder.equals("0"))
            {
                running = false;
                continue;
            }  
            //Display service menu 
            String displayServiceMenu = "Service Description-Price($)-Time(Minutes)";       
            for (i = 0; i < serviceMenu.length; i++)
            {
                displayServiceMenu += "\n        " + serviceMenu[i].getServiceDescription()
                + "-$" + serviceMenu[i].getServicePrice()
                + "-" + serviceMenu[i].getServiceTime(); 
            } 
            JOptionPane.showMessageDialog(null, displayServiceMenu);  
        }
        while(running);  
    }
}