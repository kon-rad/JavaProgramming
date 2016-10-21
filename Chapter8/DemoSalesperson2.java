
/*
 * Created by Konrad Gnat
 * On:  October 20, 2016
 * Lesson: 8
 * Exercise: 6b
 * Title: Java Programming: Level I
 *
 * B. Modify the DemoSalesperson application so each Salesperson 
 * has a successive ID number from 111 through 120 and a sales 
 * value that ranges from $25,000 to $70,000, increasing by $5,000 
 * for each successive Salesperson. Save the file 
 * as DemoSalesperson2.java.
 */
 
public class DemoSalesperson2 
{
  public static void main(String[] args)
  {
    final int SALE_ID = 111;
    final double ANN_SALE = 25000;
    
    Salesperson[] sal = new Salesperson[10];
    for (int i = 0; i < 10; i++)
    {
      sal[i] = new Salesperson(SALE_ID + i, (ANN_SALE + (i * 5000)));
    }
    for (int i = 0; i < 10; i++)
    {
      System.out.println("Salesperson " + (i + 1) + " ID: " + sal[i].getIDNumber() 
        + ", Annual Sales: " + sal[i].getAnnualSales()); 
    }
  }
} 