
/*
 * Created by Konrad Gnat
 * On:  October 29, 2016
 * Chapter: 9
 * Exercise: 1
 * Title: Java Programming: Level I
 *
 * Write an application containing an array of 10 String values,
 * and display them in ascending order. Save the file as 
 * SortStrings.java.
 * 
 * 
 *
 */
import java.util.*;  
 
 
public class SortStrings {
  public static void main(String[] args) {
    String[] statesOfUSA = {"Illinois", "Florida", "New York", 
      "Kansas", "New Hampshire", "Oregon", "Carolina", "North Dakota", 
      "California", "Texas" };
    Arrays.sort(statesOfUSA, String.CASE_INSENSITIVE_ORDER);
    for (String a : statesOfUSA) {
      System.out.println(a + " ");
    }
  }
}
      
    



    
