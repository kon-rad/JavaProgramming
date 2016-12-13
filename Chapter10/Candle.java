/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On:  December 12, 2016 
 * Chapter: 10
 * Page: 539
 * Exercise: 2
 * Title: Java Programming: Level II 
 *
 * Description:
 * Mick's Wicks makes candles in various sizes. Create a class for the 
 * business named Candle that contains data fields for color, height, and
 * price. Create get methods for all three fields. Create set methods for
 * color and height, but not for price. Instead, when height is set, 
 * determine the price as $2 per inch. Create a child class named 
 * ScentedCandle that contains an additional data field named scent and
 * methods to get and set it. In the child class, override the parent's 
 * setHeight() method to set the price of a ScentedCandle object at $3
 * per inch. Write an application that instantiates an object of each
 * type and displays the details. Save the files as Candle.java, 
 * ScentedCandle.java, and DemoCandles.java.
 *
 */  
 
 
public class Candle
{
     // Data field
     private String color;
     private double height;
     private double price;

     // Get methods
     public String getColor()
     {
         return color;      
     }     
     public double getHeight()
     {
         return height;      
     }
     public double getPrice()
     {
         return price;      
     }
     
     
     // Set methods
     public void setColor(String col)
     {
         color = col;
     }
     public void setHeight(double hei)
     {
         height = hei;
         price = hei * 2;
     }    
}







