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
 
 
public class Product
{  
    private int productNum;
    private double price;
    private String errorDescription = "";
    
    public Product(int pnm, double pri) throws ProductException
    {
        productNum = pnm;
        price = pri;
        
        if (productNum < 100 || productNum >= 1000) 
            throw (new ProductException("Error! Product Number: " + productNum + " is not three digits long"));
        else if (price < 0.01)
            throw (new ProductException("Error! Price: " + price + " is less than $0.01"));
        else if (price > 1000.0)
            throw (new ProductException("Error! Price: " + price + " is more than $1,000.00"));
    } 
    
    public int getProductNumber() 
    {
        return productNum;
    }
    public double getPrice() 
    {
        return price;
    }
}





 









