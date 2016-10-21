
/*
 * Created by Konrad Gnat
 * On:  October 20, 2016
 * Lesson: 8
 * Exercise: 7a
 * Title: Java Programming: Level I
 *
 * a)Create a CollegeCourse class. The class contains fields 
 * for the course ID (for example, "CIS 210"),credit hours (for
 * example, 3) and a letter grade (for example, 'A'). Include 
 * get() and set() methods for each field. Create a Student 
 * class containing an ID number and an array of five 
 * CollegeCourse objects. Create a get () and set() method 
 * for the Student ID number. Also create a get () method 
 * that returns one of the Student's CollegeCourses; the method
 *  takes an integer argument and returns the CollegeCourse in
 * that position(0 through 4). Next, create a set() method
 * that sets the value of one of the Student's 
 * CollegeCoursesl the method takes two arguments - a 
 * CollegeCourse and an integer representing the CollegeCourse's
 * position (0 through 4). Save the files as CollegeCourse.java 
 * and Student.java
 *
 */
 
public class CollegeCourse 
{
  private String courseID;
  private int creditHours;
  private char letterGrade;
  
  
  // get methods
  public String getCourseID()
  {
    return courseID;
  }
  public int getCreditHours()
  {
    return creditHours;
  }
  public char getLetterGrade()
  {
    return letterGrade;
  } 
  
  // set methods
  public void setCourseID(String i)
  {
    courseID = i;
  }
  public void setCreditHours(int c)
  {
    creditHours = c;
  }
  public void setLetterGrade(char l)
  {
    letterGrade = l;
  }
}  
  
  
  
