
/*
 * Created by Konrad Gnat
 * On:  November 7, 2016
 * Chapter: 9
 * Exercise: 5
 * Title: Java Programming: Level I
 *
 * Create an application that allows you to store an array that 
 * acts as a database of any number of Salesperson objects up to 
 * 20. While the user decides to continue, offer three options: 
 * to add a record to the database, to delete a record from the
 *  database, or to change a record in the database. Then proceed
 * as follow:
 *
 * - If the user selects the add option, issue an error message 
 * if the database is full. Otherwise, prompt the user for an ID
 * number. If the ID number already exists in the database, 
 * issue an error message. Otherwise, prompt the user for a 
 * sales value, and add the new record to the database.
 *
 * - If the user selects the delete option, issue an error message
 * if the database is empty. Otherwise prompt the user for an ID 
 * number. If the ID number does not exist, issue an error message.
 *  Otherwise, do not access the record for any future processing.
 *
 * - If the user selects the change option, issue an error message 
 * if the database is empty. Otherwise prompt the user for an ID
 * number. If the requested record does not exist, issue an error
 * message. Otherwise, prompt the user for a new sales value, 
 * and change the sales value for the record.
 *
 * After each option executes, display the updated database in 
 * ascending order by Salesperson ID number, and prompt the user 
 * to select the next action. Save the application as 
 * SalespersonDatabase.java.
 * 
 *
 */ 
 
import java.util.*;  
import javax.swing.*; 
 
public class SalespersonDatabase { 
  public static void main(String[] args) {
    // Initialize variables
    String idNum = "",annSal = "";
    int idNumInt = -2, i = 0, j = 0;
    double annSalDouble = 0;
    boolean running = true, idTaken = false;
    ArrayList<Salesperson> database = new ArrayList<Salesperson>(20);
    String[] options = new String[] {"Add a record"
      , "Delete a record", "Change a record", "Quit"};
      
    while (running) { 
       // Show options menu
       int response = JOptionPane.showOptionDialog(null, "Welcome to "
         + "the salesperson database", "Salesperson Database",
         +  JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
           null, options, options[0]);
       // Add a record
       if (response == 0) {
         // Check if database is empty
         if (database.size() == 20) {
           JOptionPane.showMessageDialog(null, "The database is full"); 
         } else {
           // Prompt for new entry info
           idTaken= false;
           idNum = JOptionPane.showInputDialog(null, "Enter ID number");
           idNumInt = Integer.parseInt(idNum);
           // Check if ID number is taken
           for (i = 0; i < database.size(); i++) {
             if (database.get(i).getIDNumber() == idNumInt) {
               JOptionPane.showMessageDialog(null, "ID Number "  
                 + idNumInt + " is taken");
               idTaken = true;
               break;
             }
           }
           if (!idTaken) {
             annSal = JOptionPane.showInputDialog(null, "Enter annual sales");
             annSalDouble = Double.parseDouble(annSal); 
             database.add(new Salesperson(idNumInt, annSalDouble));
           }
         }
       // Delete a record
       } else if (response == 1) {
         // Check if database is empty
         if (database.size() == 0) {
           JOptionPane.showMessageDialog(null, "No entries in database");
         } else {
           // Search for desired ID number
           idNum = JOptionPane.showInputDialog(null, "Enter ID number");
           idNumInt = Integer.parseInt(idNum);
           for (i = 0; i < database.size(); i++) {
             // Remove desired entry
             if (database.get(i).getIDNumber() == idNumInt) {
               database.remove(i);
               break;
             }
               // check if entry not found
             if (i == (database.size() - 1) && database.get(i).getIDNumber() != idNumInt) 
               JOptionPane.showMessageDialog(null, "This entry does not exist");
           }
             
       } 
       // Change a record
       } else if (response == 2) {
         // Check if database is empty
         if (database.size() == 0) {
           JOptionPane.showMessageDialog(null, "No entries in database");
         } else {
           // Search for desired ID number
           idNum = JOptionPane.showInputDialog(null, "Enter ID number");
           idNumInt = Integer.parseInt(idNum); 
           for (i = 0; i < database.size(); i++) {
             if (database.get(i).getIDNumber() == idNumInt) {
               // Enter new ID number and annual sales
               String newID = JOptionPane.showInputDialog(null, "Enter new ID number");
               int newIDInt = Integer.parseInt(newID);
               annSal = JOptionPane.showInputDialog(null, "Enter annual sales");
               annSalDouble = Double.parseDouble(annSal); 
               Salesperson entry = new Salesperson(newIDInt, annSalDouble);
               database.set(i, entry); 
               break; 
             }
             // Check if entry not found
             if (i == (database.size() - 1) && database.get(i).getIDNumber() != idNumInt) 
               JOptionPane.showMessageDialog(null, "This entry does not exist");
           }    
         } 
       // Quit
       } else if (response == 3) {
         running = false;
       }

       // Sort by custom comparator
       Collections.sort(database, new Comparator<Salesperson>(){
         public int compare(Salesperson o1, Salesperson o2){
            if(o1.getIDNumber() == o2.getIDNumber())
                return 0;
            return o1.getIDNumber() < o2.getIDNumber() ? -1 : 1;
         }
       });
       
       // Display Database
       String display = "";
       for (i = 0; i < database.size(); i++) {
         display += "\nID Number: " + database.get(i).getIDNumber() + " - Annual Sales: " 
           + database.get(i).getAnnualSales();
       }
       JOptionPane.showMessageDialog(null, "Database:" + display);
    } //Program ends
       
  }  
}
