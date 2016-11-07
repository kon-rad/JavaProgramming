
/*
 * Created by Konrad Gnat
 * On:  November 7, 2016
 * Chapter: 9
 * Exercise: 9
 * Title: Java Programming: Level I
 *
 * Create a class named Majors that includes an enumeration for the six majors offered
 * by a college as follows: ACC, CHEM, CIS, ENG, HIS, PHYS. Display the enumeration
 * values for the user, then prompt the user to enter a major. Display the college division
 * in which the major falls. ACC and CIS are in the Business Division, CHEM and PHYS
 * are in the Science Division, and ENG and HIS are in the Humanities Division. Save
 * the file as Majors.java.
 * 
 *
 */ 
 
import java.util.*;  
import javax.swing.*; 
 
public class Majors { 

  enum Major {ACC, CHEM, CIS, ENG, HIS, PHYS };
  
  public static void main(String[] args) {
    String response, displayMajors = "";
    Major userMajor;
    
    // Prompt user for entry and display majors
    for (Major m : Major.values())
      displayMajors += m + " ";
    
    response = JOptionPane.showInputDialog(null, "Select a major for more information\n"
      + displayMajors);
    
    userMajor = Major.valueOf(response.toUpperCase());
    
    //Switch case returns response
    switch(userMajor) {
      case ACC:
      case CIS:
        JOptionPane.showMessageDialog(null, userMajor + " is in the Business Division");
        break;
      case CHEM:
      case PHYS:
        JOptionPane.showMessageDialog(null, userMajor + " is in the Science Division");    
        break;   
      case ENG:
      case HIS:
        JOptionPane.showMessageDialog(null, userMajor + " is in the Humanities Division");
    }
  }
}
    