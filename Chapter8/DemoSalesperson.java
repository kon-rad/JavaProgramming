
/*
 * Created by Konrad Gnat
 * On:  October 20, 2016
 * Lesson: 8
 * Exercise: 6a
 * Title: Java Programming: Level I
 *
 * Create a class named Salesperson. Data fields for Salesperson 
 * include an integer ID number and a double annual sales amount. 
 * Methods include a constructor that requires values for both data
 * fields, as well as get and set methods for each of the data 
 * fields. Write an application named DemoSalesperson that declares
 * an array of 10 Salesperson objects. Set each ID number to 
 * 9999 and each sales value to zero. Display the 10 Salesperson
 * objects. Save the files as Salesperson.java and 
 * DemoSalesperson.java. *
 */
 
public class DemoSalesperson 
{
  public static void main(String[] args)
  {
    final int SALE_ID = 9999;
    final double ANN_SALE = 0;
    
    Salesperson[] sal = new Salesperson[10];
    for (int i = 0; i < 10; i++)
    {
      sal[i] = new Salesperson(SALE_ID, ANN_SALE);
    }
    for (int i = 0; i < 10; i++)
    {
      System.out.println("Salesperson " + (i + 1) + " ID: " + sal[i].getIDNumber() 
        + ", Annual Sales: " + sal[i].getAnnualSales()); 
    }
  }
} 