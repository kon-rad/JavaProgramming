/*
 * Created by Konrad Gnat
 * On:  October 13, 2016
 * Lesson: 7
 * Assignment: Exercise 7
 * Title: Java Programming: Level I
 *
 * Write an application that demonstrates each of the following
 * methods base on the following quote...
 */
 

public class DemonstratingStringMethods 
{
    public static void main(String[] args) 
    {
        String columbusQuote = "You can never cross the ocean until"
                             + " you have the courage to lose sight"
                             + " of the shore.";
        System.out.println(columbusQuote.indexOf('v'));
        System.out.println(columbusQuote.indexOf('x'));
        System.out.println(columbusQuote.charAt(16));
        System.out.println(columbusQuote.endsWith("bus"));
        System.out.println(columbusQuote.endsWith("car"));
        System.out.println(columbusQuote.replace('c', 'C'));
    }
}