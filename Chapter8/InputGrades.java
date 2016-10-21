import javax.swing.*;
import java.util.*;
/*
 * Created by Konrad Gnat
 * On:  October 20, 2016
 * Lesson: 8
 * Exercise: 7b
 * Title: Java Programming: Level I
 *
 * b)Write an application that prompts a professor to enter grades
 * for five different courses each for 10 students. Prompt the 
 * professor to enter grades for five different couses each for 
 * 10 students. Prompt the professor to enter data for one student
 * at a time, including student ID and course data for five 
 * courses. Use prompts containing the number of the student 
 * whose data is being entered and the course number - for 
 * example, "Enter ID for student #s", where s is an integer 
 * from 1 through 10, indicating the student, and "Enter course 
 * ID #n", where n is an integer from 1 through 5, indicating the 
 * course number. Verify that the professor enters only A, B, C, 
 * D, or F for the grade value for each course. Save the file as 
 * InputGrades.java.
 *
 */
 
public class InputGrades 
{
  public static void main(String[] args)
  {
    String userInput;
    int userInt;
    final int COURSES = 5;
    final int STUDENTS_NUMBER = 10;
    Student[] students = new Student[STUDENTS_NUMBER];
    for (int i = 0; i < students.length; i ++)
    {
      userInput = JOptionPane.showInputDialog(null, 
        "Enter student " + (i + 1) + " id number: ");
      userInt = Integer.parseInt(userInput); 
      students[i] = new Student();
      students[i].setStudentID(userInt);  
      for (int j = 0; j < COURSES; j++) 
      { 
         CollegeCourse c = new CollegeCourse(); 
         userInput = JOptionPane.showInputDialog(null, 
           "Enter student " + (i + 1) + " Course " + (j + 1)
           + "Course ID: "); 
         c.setCourseID(userInput); 
         userInput = JOptionPane.showInputDialog(null, 
           "Enter student " + (i + 1) + " Course " + (j + 1)
           + " Credit hours: "); 
         c.setCreditHours(Integer.parseInt(userInput)); 
         userInput = JOptionPane.showInputDialog(null, 
           "Enter student " + (i + 1) + " Course " + (j + 1)
           + " Letter grade: "); 
         while (userInput.charAt(0) != 'A' && userInput.charAt(0) != 'B' &&
           userInput.charAt(0) != 'C' &&  userInput.charAt(0) != 'D' &&  
           userInput.charAt(0) != 'E' &&  userInput.charAt(0) != 'F')
         {
           userInput = JOptionPane.showInputDialog(null, 
           "Error: wrong input try again \nEnter student " + (i + 1) 
             + " Course " + (j + 1) + " grade: ");
         }    
         c.setLetterGrade(userInput.charAt(0)); 
         students[i].setCourse(c, j);  
      }
    }
    for (int i = 0; i < students.length; i ++)
    {
      System.out.println("student id " + students[i].getStudentID());
      for (int j = 0; j < COURSES; j++)
      {
        System.out.println("\tCourse ID: " + students[i].getCourse(j).getCourseID() 
          + "\n\t\tCredit Hours: " + students[i].getCourse(j).getCreditHours()
          + "\n\t\tLetter grade: " + students[i].getCourse(j).getLetterGrade());
      }
    }      
  }        
}
  
  
  