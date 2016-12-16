/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On:  December 15, 2016 
 * Chapter: 11
 * Page: 595
 * Exercise: 3
 * Title: Java Programming: Level II 
 *
 * Description:
 * Create an abstract Auto class with fields for the car make and price. Include get
 * and set methods for these fields; the setPrice() method is abstract. Create two 
 * subclasses for individual automobile makers (for example, Ford or Chevy), and 
 * include appropriate setPrice() methods in each subclass (for example, $20,000 or
 * $22,000). FInally, write an application that uses the Auto class and subclasses
 * to display information about different cars. Save the files as Auto.java, 
 * Ford.java, Chevy.java, and UseAuto.java.
 *
 */   

 
 
public abstract class Auto 
{
    private String make;
    protected double price;
    
    // Constructor
    public Auto(String m)
    {
        make = m;
    }
    
    // Get Methods
    public String getMake()
    {
        return make;
    }
    public double getPrice()
    {
        return price;
    }
    
    // Set Methods
    public void setMake(String mke)
    {
        make = mke;
    }
    public abstract void setPrice();
}





 