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
 
 
public class ScentedCandle extends Candle
{
     // Data field
     private String scent;
     private double scentedPrice;
     private double height;

     // Get methods
     public String getScent()
     {
         return scent;      
     }     
     public double getScentedPrice()
     {
         return scentedPrice;
     }
     
     // Set methods
     public void setScent(String sce)
     {
         scent = sce;
     }
     public void setHeight(double hei)
     {
         super.setHeight(hei);
         scentedPrice = hei * 3;
     }    
}







