import java.util.*;
/*
 * Created by Konrad Gnat
 * On:  October 19, 2016
 * Lesson: 8
 * Exercise: 8
 * Title: Java Programming: Level I
 *
 * Write an application in which the user can enter a date using 
 * digits and slashes (for example, "6/24/2014"), and receive output that 
 * displays the date with the month shown as a word (such as "June 24, 2014" ). 
 * Allow for the fact that the user might or might not precede a month or day 
 * number with a zero (for example, the user might type "06/24/2012" or  
 * "6/24/2012"). Do not allow the user to enter an invalid date, defined as 
 * one for which the month is less than 1 or more than 12, or one for which the
 * day number is less than 1 or greater than the number of days in the specified month.
 * Also display the date's ordinal position in the year; for example, 6/24/14
 * is the 175th day. In this application, use your knowledge of arrays to 
 * store the month names,as well as values for the number of days in each 
 * month so that you can calculate the umber of days that have passed. 
 *  Save the application as  ConvertDate.java 
 *
 * Additional Requirements:
 * Use the GregorianCalendar class to determine the date's ordinal position in the year.
 *
 */
 
public class ConvertDate 
{
  public static Boolean inputDayInvalid = false;
  public static Boolean inputMonthInvalid = false;
  public static Boolean leapYear = false;
  public static int month = 1;
  public static int day = 1;
  public static int year = 1;
  public static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};  
 
  public static void main(String[] args)
  {
   
    String userDate;
    String[] monthNames = {"January", "February", "March", "April", "May", "June",
      "July", "August", "September", "October", "November", "December"};
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter date using digits and slashes >>");
    userDate = in.nextLine();
    checkInput(userDate);
    while (inputDayInvalid || inputMonthInvalid)
    { 
      if (inputDayInvalid && !inputMonthInvalid)
        System.out.println("Error: invalid day");
      else if (inputMonthInvalid && !inputDayInvalid)
        System.out.println("Error: invalid month");
      else
        System.out.println("Error: invalid day and month"); 
      System.out.println("Enter date using digits and slashes >>");
      userDate = in.nextLine();
      checkInput(userDate);
    }
    
    Calendar userCalendar = new GregorianCalendar(year, (month - 1), day);
    int ordinalDay = userCalendar.get(Calendar.DAY_OF_YEAR);
    System.out.println("You have entered: " + monthNames[month - 1] + " " + day 
      + ", " + year + "\nThis is the " + ordinalDay + "th day of the year");
    
  }
  // Method converts input to integers and checks if input is valid
  public static void checkInput(String date)
  {
    int count = 0;
    int j = 0;
    for (int i = 0; i < date.length(); i++)
    {
      if (date.charAt(i) == '/' && count == 0)
      {
        month = Integer.parseInt(date.substring(0, i));
        j = (i += 1);
        count++;
      }
      if (date.charAt(i) == '/' && count == 1)
      {
        day = Integer.parseInt(date.substring(j, i));
        year = Integer.parseInt(date.substring(i + 1));
      }
    }
    // Check if month entry is valid
    if (month < 1 || month > 12)
      inputMonthInvalid = true;
    else 
      inputMonthInvalid = false;
    // Check if leap year
    if (year % 400 == 0)
      leapYear = true;
    else if (year % 4 == 0 && year % 100 != 0)
      leapYear = true;
    else 
      leapYear = false;
    // Check if days entry is valid
    if (leapYear && month == 2)
    { 
      if (day < 1 || day > 29)
        inputDayInvalid = true;
      else
        inputDayInvalid = false;
    }    
    else if (day < 1 || day > daysInMonth[month - 1])
      inputDayInvalid = true;
    else 
      inputDayInvalid = false;
  }   
}