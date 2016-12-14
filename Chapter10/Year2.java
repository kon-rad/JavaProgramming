/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On:  December 12, 2016 
 * Chapter: 10
 * Page: 539
 * Exercise: 4a
 * Title: Java Programming: Level II 
 *
 * Description:
 * a) Create class named year that contains a data field that holds the number 
 * of days in a year. Include a get method that displays the number of days and 
 * a constructor that sets the number of days to 365. Create a subclass named 
 * LeapYear. LeapYear's constructor overrides Year's Constructor and sets the 
 * number of days to 366. Write an application named UseYear that instantiates 
 * one object of each class and displays their data. save the files as Year.java,
 * LeapYear.java, UseYear.java.
 * 
 * b) Add a method named daysElapsed() to the year in Exercise 4a. The day Elapsed()
 * method accepts two arguments representing a month and a day; it returns an integer
 * indicating the number of days elapsed since January 1 of that year. For example,
 * On march 3 in nonleap years, 61 days have elapsed (31 in January, 28 in Feburary,
 * and 2 in March). Create dayElapsed method for the LeapYear class that overrides
 * the method in the year class. For example, on March 3 in a LeapYear, 62 days 
 * have elapsed (31 in January, 29 in Feburary and 2 in March). Write an 
 * application named UseYear2 that prompt the user for a month and day and 
 * calculates the days elapsed in a year and in a LeapYear. Save the files as 
 * Year2.java, LeapYear.java, and UseYear2.java.
 * 
 * 
 */  
 
 
public class Year2
{
     // Data field
     private int numberOfDays;
     
     // Days elapsed method
     public int daysElapsed(int mon, int day)
     {
         int days = 0;
         int[] daysInMonths = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 
             31, 30, 31 };
         for (int i = 1; i <= mon; i++)
         {
             days += daysInMonths[i - 1];
         }
         return days + day;
     }
   
     // Get methods
     public int getNumberOfDays()
     {
         return numberOfDays;      
     } 
     
     // Constructor
     public Year2() 
     {
         numberOfDays = 365;
     }   
       
}











