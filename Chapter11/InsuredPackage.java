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
 
 
public class InsuredPackage extends Package
{
     // Data field
     private double insuredShippingCost;

     // Chain super class constructor
     public InsuredPackage(int w, char s)
     {
         super(w, s);
         this.calculateShippingCost();      
     }
     
     // Calculate insured shipping method
     public void calculateShippingCost() 
     {
          double preInsuranceCost = super.getShippingCost();
          if (preInsuranceCost <= 1.0)
          {
              insuredShippingCost = preInsuranceCost + 2.45;
          }
          else if (preInsuranceCost >= 1.01 || preInsuranceCost <= 3.00)
          {
              insuredShippingCost = preInsuranceCost + 3.95;
          }
          else if (preInsuranceCost >= 3.01)
          {
              insuredShippingCost = (preInsuranceCost + 5.55);
          }

     }
     
     // get method
     public double getInsuredShippingCost() 
     {
         return insuredShippingCost;
     }
     
    //display method
    public void display()
    {
        System.out.println("Weight: " + getWeight() + "\nShipping Method: " + getShippingMethod()
            + "\nInsured Shipping Cost: $" + getInsuredShippingCost() + "\n");
    }
    
}





