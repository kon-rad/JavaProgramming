/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On:  December 10, 2016 
 * Chapter: 10
 * Page: 540
 * Exercise: 6
 * Title: Java Programming: Level II 
 *
 * Description:
 * Create a class named "Package" with data fields for 
 * weight in ounces, shipping method, and shipping cost. The shipping method is
 * a character: 'A' for air, 'T' for truck, or 'M' for mail. The "Package" 
 * class contains a constructor that requires arguments for weight and shipping
 * method. The constructor calls a calculateCost() method that determines the 
 * shipping cost, based on the following table:
 * 
 * Weight(oz.)		Air($)		Truck($)		Mail($)
 * 1 to 8			2.00		1.50			.50
 * 9 to 16			3.00		2.35			1.50
 * 17 and over		4.50		3.25			2.15
 * 
 * The "Package" class also contains a "display()" method that displays the 
 * values in all four fields. Create a subclass named "InsuredPackage" that 
 * adds an insurance cost to the shipping cost, based on the following table:
 * 
 * Shipping Cost Before Insurance($)	Additional Cost($)
 * 0 to 1.00							2.45
 * 1.01 to 3.00						3.95
 * 3.01 and over						5.55
 * 
 * Write an application named "UsePackage" that instantiates at least three 
 * objects of each type (Package and InsuredPackage) using a variety of weights
 * and shipping method codes. Display the results for each "Package" and 
 * "InsuredPackage." Save the files as "Package.java", "InsuredPackage.java", 
 * and "UsePackage.java."
 *
 */  
 
 
public class Package
{
    // Data Fields
    private int weight;  
    private char shippingMethod;
    private double shippingCost;
    
    // Constructor
    Package(int w, char s)
    {
        weight = w;
        shippingMethod = s;
        shippingCost = calculateCost(w, s);
    }
    
    // calculate cost method
    public double calculateCost(int w, char s)
    {
        final double[] AIR = {
            2.00, 3.00, 4.50
        };
        final double[] TRUCK = {
            1.50, 2.35, 3.25
        };
        final double[] MAIL = {
            .50, 1.50, 2.15
        };
        if (s == 'A') 
        {
            if (w >= 1 && w <= 8)
            {
                return AIR[0];
            }
            else if (w >= 9 && w <= 16) 
            {
                return AIR[1];
            }
            else if (w >= 17) 
            {
                return AIR[2];
            }
        } 
        else if (s == 'T') 
        {
            if (w >= 1 && w <= 8)
            {
                return TRUCK[0];
            }
            else if (w >= 9 && w <= 16) 
            {
                return TRUCK[1];
            }
            else if (w >= 17) 
            {
                return TRUCK[2];
            }
        }
        else if (s == 'M') 
        {
            if (w >= 1 && w <= 8)
            {
                return MAIL[0];
            }
            else if (w >= 9 && w <= 16) 
            {
                return MAIL[1];
            }
            else if (w >= 17) 
            {
                return MAIL[2];
            }
        }
        return 0.0;
        
    }
    
    //Get methods
    public int getWeight()
    {
        return weight;
    }
    public char getShippingMethod()
    {
        return shippingMethod;
    }   
    public double getShippingCost()
    {
        return shippingCost;
    } 
    //display method
    public void display()
    {
        System.out.println("Weight: " + getWeight() + "\nShipping Method: " + getShippingMethod()
            + "\nShipping Cost: $" + getShippingCost() + "\n");
    }
    
}





