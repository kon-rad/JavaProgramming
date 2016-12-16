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

 
 
public abstract class Vehicle
{
    private String powerSource;
    private int wheels;
    protected int price;
    
    public Vehicle(String powerSource, int wheels)
    {
        setPowerSource(powerSource);
        setWheels(wheels);
        setPrice();
    }
    
    public String getPowerSource()
    {
        return powerSource;
    }
    public int getWheels()
    {
        return wheels;
    }
    public int getPrice()
    {
        return price;
    }
    
    public void setPowerSource(String source)
    {
        powerSource = source;
    }
    public void setWheels(int wls)
    {
        wheels = wls;
    }
    
    public abstract void setPrice();

}





 