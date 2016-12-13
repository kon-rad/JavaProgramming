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
 
import java.util.*;
 
public class DemoCandles
{
    public static void main(String[] args) 
    {
        ScentedCandle candle001 = new ScentedCandle();
        candle001.setColor("Blue");
        candle001.setHeight(4);
        candle001.setScent("Roses");
        
        Candle candle002 = new Candle();
        candle002.setColor("Orange");
        candle002.setHeight(13);
        
        System.out.println("Your scented candle has a " + candle001.getColor() 
            + " it is " + candle001.getHeight() + " inches tall, it has the scent of "
            + candle001.getScent() + " and it costs " + candle001.getScentedPrice() + " dollars.");
            
        System.out.println("Your non-scented candle has a " + candle002.getColor() 
            + " it is " + candle002.getHeight() + " inches tall and it costs " 
            + candle002.getPrice() + " dollars.");
          
    }    
}







