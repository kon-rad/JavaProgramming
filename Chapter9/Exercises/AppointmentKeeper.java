
/*
 * Created by Konrad Gnat
 * On:  November 7, 2016
 * Chapter: 9
 * Exercise: 10
 * Title: Java Programming: Level I
 *
 * Create a class named AppointmentKeeper that stores a two-dimensional 
 * String arrary with 31 rows and 24 columns. The program allows a user to 
 * choose a day and an hour continuously and then to enter a String value 
 * that describes an appointment. After the user finishes entering data, 
 * prompt the users continuously to enter a day, and show 24 appointment 
 * slots for the day. Save the file as AppointmentKeeper.java.
 * 
 *
 */ 
 
import java.util.*;  
 
public class AppointmentKeeper{ 
  public static void main(String[] args) {
    // Declare variables
    final int QUIT = 99;
    Scanner in = new Scanner(System.in);
    int dayIn, hourIn, day, hour;
    String nameIn;
    boolean enteringData = true, displayingData = true;
  
    String[][] appointments = { {"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""},{"", "","","","","","","","","","","","",
      "","","","","","","","","","",""}};
      
    // Enter schedule loop 
    while (enteringData) {
       System.out.println("Create a new appointment. Enter day or 99 to quit");
       dayIn = in.nextInt();
       if (dayIn == QUIT) {
          enteringData = false;
       } else {
          System.out.println("Enter hour");
          hourIn = in.nextInt();
          in.nextLine();
          System.out.println("Enter appointment name");
          nameIn = in.nextLine();
          appointments[dayIn - 1][hourIn] = nameIn;
       }
    } 
    
    // Display schedule loop
    while (displayingData) {
       System.out.println("\nEnter day to view appointments schedule or enter 99 to quit");
       day = in.nextInt(); 
       if (day == QUIT) {
         displayingData = false;
       } else {
          for (hour = 0; hour < appointments[day].length; ++hour) {
             if (appointments[day - 1][hour] == "") {
               System.out.print("\nDay: " + (day) + " Hour: " + hour + " " 
                 + "Nothing scheduled");
             } else {
               System.out.print("\nDay: " + (day) + " Hour: " + hour + " " 
                 + appointments[day - 1][hour]);
             } 
          }
       }
    }
  }
}

