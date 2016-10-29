
/*
 * Created by Konrad Gnat
 * On:  October 29, 2016
 * Chapter: 9
 * Exercise: 4
 * Title: Java Programming: Level I
 *
 * In Chapter 8, you created a Salesperson class with fields for 
 * an ID number and sales values. Now, create an application that 
 * allows a user to enter values for an array of seven Salesperson 
 * objects. Offer the user the choice of displaying the objects in 
 * order by either ID number or sales value. Save the application
 * as SalespersonSort.java
 * 
 * 
 *
 */
import java.util.*; 
import javax.swing.*; 
 
 
public class SalespersonSort {
  public static void main(String[] args) { 
    final int NUMBER_OF_SALESMEN = 7;
    Salesperson[] array = new Salesperson[NUMBER_OF_SALESMEN];
    String inputID, inputSales, inputSort, display = " ";
    int inputIDInt;
    double inputSalesDouble;
    
    
    for (int i = 0; i < array.length; i++) {
      inputID = JOptionPane.showInputDialog(null, "Enter salesperson no. " 
        + (i + 1) + " ID number");
      inputSales = JOptionPane.showInputDialog(null, "Enter salesperson no. " 
        + (i + 1) + " annual sales");
      inputIDInt = Integer.parseInt(inputID);
      inputSalesDouble = Double.parseDouble(inputSales);
      array[i] = new Salesperson(inputIDInt, inputSalesDouble);
    }
    inputSort = JOptionPane.showInputDialog(null, "How to display information?"
      + "\n(enter ID number or annual sales");
    
    if (inputSort.toLowerCase().equals("id number")) {
      for (int i = 0; i < array.length - 1; i++) {
        for (int j = 0; j < array.length - 1; j++) {
          if (array[j].getIDNumber() > array[j + 1].getIDNumber()) {
            Salesperson temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
          }
        }
      }
    } else if (inputSort.toLowerCase().equals("annual sales")) {
      for (int i = 0; i < array.length - 1; i++) {
        for (int j = 0; j < array.length - 1; j++) {
          if (array[j].getAnnualSales() > array[j + 1].getAnnualSales()) {
            Salesperson temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
          }
        }
      }
    }
    for (Salesperson i : array) {
      display += "\nID Number: " + i.getIDNumber();
      display += "\nAnnual sales: " + i.getAnnualSales();
    }
    JOptionPane.showMessageDialog(null, "Salespeople list in order of " 
      + inputSort + display);
     
  }
}



