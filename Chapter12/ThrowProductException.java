/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: December 21, 2016 
 * Chapter: 12
 * Page: 667
 * Exercise: 6
 * Title: Java Programming: Level II 
 *
 * Description:
 * Create a ProductException class whose constructor receives a String that 
 * consists of a product number and price. Save the file as 
 * ProductException.java. Create a Product class with two fields, productNum
 * and price. The Product constructor requires values for both fields.
 * Upon construction, throw a ProductException if the product number 
 * does not consist of three digits, if the price is less than $0.01,
 * or if the price is over $1,000. Save the class as Product.java.
 * Write an application that establishes at least four Product objects
 * with valid and invalid values. Display an appropriate message when 
 * a Product object is created successfully and when one is not. Save 
 * the file as ThrowProductException.java. thanks. 
 * 
 * 
 */   
import javax.swing.*;
 
 
public class ThrowProductException
{  
    public static void main(String[] args)
    {
        String productNumberString, priceString, display = "";
        int productNumberInt = 0;
        double priceDouble; 
        
        while (productNumberInt != 99)
        {
           try
           { 
               
                productNumberString = JOptionPane.showInputDialog(null, 
                     "Please enter a three digit product number");
                productNumberInt = Integer.parseInt(productNumberString);
                if(productNumberInt == 99)
                    break;
                priceString = JOptionPane.showInputDialog(null, 
                     "Please enter a price between $0.01 and $1,000");
                priceDouble = Double.parseDouble(priceString);
                
   
                Product productObject001 = new Product(productNumberInt, priceDouble); 
                
                display = "";
                display += "You have entered:\nProduct number " + productObject001.getProductNumber() 
                    + "\nPrice " + productObject001.getPrice();
            }
            catch(ProductException error)
            {
                display = "";
                display += error.getMessage();
            }
            JOptionPane.showMessageDialog(null, display);
         }
         JOptionPane.showMessageDialog(null, "Goodbye!");

    } 
}





 









