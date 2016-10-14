import java.util.Scanner;
/*
 * Created by Konrad Gnat
 * On:  October 13, 2016
 * Lesson: 7
 * Exercise: 1
 * Title: Java Programming: Level I
 *
 * Write an application that prompts a user for three first 
 * names and concatenates them in every possible two-name
 * combination so that new parents can easily compare them 
 * to find the most pleasing baby name. Save the file as
 * BabyNameComparison.java.
 */

public class BabyNameComparison {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name1;
        String name2;
        String name3;
        
        System.out.println("Please enter a name >>");
        name1 = in.nextLine();
        System.out.println("Please enter a second name >>");
        name2 = in.nextLine();
        System.out.println("Please enter a third name >>");
        name3 = in.nextLine();
          
        System.out.println(name1 + " " + name2);
        System.out.println(name1 + " " + name3);
        System.out.println(name2 + " " + name3);
        System.out.println(name2 + " " + name1);
        System.out.println(name3 + " " + name1);
        System.out.println(name3 + " " + name2);

    }
}