 import javax.swing.*;  
/*
 * Created by Konrad Gnat
 * On:  October 28, 2016
 * Lesson: 9
 * Exercise: 6
 * Title: Java Programming: Level I
 *
 * Write an application that stores at least four different course names 
 * and meeting days and times in a two-dimensional array. Allow the 
 * user to enter a course name (such as 'CIS 110') and display the day 
 * of the week and time that the course is held (such as 'Th 3:30'). If
 * the course does not exist, display an error message. Save the file 
 * as Schedule.java. 
 * 
 * 
 *
 */
 
public class Schedule
{  
    public static void main(String[] args) 
    {
        String input; 
        int output = -1;
        String[][] schedule = { {"CIS 273",   "MAT 370",  "CIS 340", "CIS 304", "MAT 400"},
                                {"Tu 12:45", "Th 1:00", "Fr 11:00", "Th 9:00", "Mo 7:55"} };
        input = JOptionPane.showInputDialog(null, "Enter course name to see " 
            + "\nthe day and time that it is held"
            + "\n(Enter: CIS 273, MAT 370, CIS 340, CIS 304 or MAT 400");
        for (int i = 0; i < schedule[0].length; i++)
        {
            if (schedule[0][i].equals(input.toUpperCase()))
            {
                output = i;
                break;
            }
        }
        if (output != -1) 
        {
            JOptionPane.showMessageDialog(null, "Class meets on \n"
                + schedule[1][output]);
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "This course does not exist");
        }
    }
    
}
        