
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
 
public class Salesperson 
{
  private int idNumber; 
  private double annualSales;
  
  Salesperson(int id, double sal)
  {
    idNumber = id;
    annualSales = sal;
  }
  
  // get methods
  public int getIDNumber() 
  {
    return idNumber;
  }
  public double getAnnualSales()
  {
    return annualSales;
  }
  // set methods
  public void setIDNumber(int id) 
  {
    idNumber = id;
  }
  public void setAnnualSales(double sal)
  {
    annualSales = sal;
  }
}  
  
  