
/*
 * Created by Konrad Gnat
 * On:  October 28, 2016
 * Lesson: 9
 * Exercise: 8
 * Title: Java Programming: Level I
 *
 * Create an application that contains an enumeration that
 *	represents the days of the week. Display a list of the days, then prompt
 *	the user for a day. Display business hours for the chosen day. Assume 
 *	that the business is open from 11 to 5 on Sunday, 9 to 9 on weekdays, 
 *	and 9 to 6 on Saturday. Save the file as DayOfWeek.java
 * 
 * 
 *
 */
import javax.swing.*;  
 
 
public class DayOfWeek
{ 
    enum DaysOfWeek {MON, TUE, WED, THR, FRI, SAT, SUN}; 

    public static void main(String[] args) 
    {
        String input;
        DaysOfWeek daySearchFor;
        input = JOptionPane.showInputDialog(null, "Enter the first three letters"
            + " of the day of the week for business hours");
        daySearchFor = DaysOfWeek.valueOf(input.toUpperCase()); 
        switch(daySearchFor)
        {
            case MON:
            case TUE:
            case WED:
            case THR:
            case FRI:
                JOptionPane.showMessageDialog(null, "On " + input 
                    + "\nOpen from 9am to 9pm");
                break;
            case SAT:
                JOptionPane.showMessageDialog(null, "On " + input 
                    + "\nOpen from 9am to 6pm");
                break;
            case SUN:
                JOptionPane.showMessageDialog(null, "On " + input 
                    + "\nOpen from 11am to 5pm");
        }      
    }        
}
        