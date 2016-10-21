import javax.swing.*; 
/*
 * Created by Konrad Gnat
 * On:  October 19, 2016
 * Lesson: 8
 * Exercise: 10
 * Title: Java Programming: Level I
 *
 * Write a Java application that contains three parallel arrays 
 * that hold 10 elements each. The first array holds four-digit 
 * student ID numbers, the second holds first names, and the third 
 * holds the students' grade point averages. Use dialog prompts 
 * to accept a student ID number, and display the student's first 
 * name and grade point average. If a match is not found, display “No 
 * match found” and allow the user to search for a new ID number. 
 * Save the file as StudentIDArray.java  
 *
 */
 
public class StudentIDArray 
{  
  public static String searchName = "";
  public static double searchGPA = 0.0;
  public static boolean inputInvalid = false;
  public static int searchID;
  public static final int STUDENT_NUMBER = 10;
  public static int[] studentID = {3421, 4535, 9231, 9872, 4998, 1265, 3233, 
    9583, 1845, 6232};
  public static String[] studentName = {"Jack", "Amy", "Matt", "Mohammed", 
    "Pat", "Ryan", "Joy", "Marie", "Bobby", "Roger"};
  public static double[] studentGPA = {2.5, 3.4, 3.25, 3.6, 3.9, 2.2, 2.7, 3.85, 3.1, 4.0};
  public static String strID; 

  // Main method
  public static void main(String[] args)
  {  
    strID = JOptionPane.showInputDialog( null, "Enter student ID number");
    searchID = Integer.parseInt(strID);
    checkInput(searchID);
    while (inputInvalid)
    {
    strID = JOptionPane.showInputDialog( null, "No match found "
        + "\nTry again\nEnter student ID number");
    searchID = Integer.parseInt(strID);
    checkInput(searchID);
    }
    JOptionPane.showMessageDialog(null, "Student Name: " + searchName 
      +"\nStudent GPA: " + searchGPA);
  }
  
  // Method finds elements corresponding to student ID and checks 
  // if input is valid
  public static void checkInput(int id)
  {
    inputInvalid = true;
    for (int i = 0; i < STUDENT_NUMBER; i++)
    {
      if (searchID == studentID[i])
      {
        searchName = studentName[i];
        searchGPA = studentGPA[i];
        inputInvalid = false;
      }
    }
  }
}
        