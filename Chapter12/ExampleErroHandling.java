/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On:  December 20, 2016 
 * Chapter: 12
 * Title: Java Programming: Level II 
 *
 * Description:
 * Exception Handling Exercises
 *
 */  
import java.util.*;
import javax.swing.*;

 
 
public class ExampleErroHandling
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int x = 1; 
        
        do
        {
        
           try
           {
              System.out.println("Enter first num: ");
              int n1 = input.nextInt();
              System.out.println("Enter second num: ");
              int n2 = input.nextInt();
              
              int sum = n1/n2;
              
              System.out.println(sum);
              x = 2; 
           }
           catch(Exception e) 
           {
               System.out.println("Error: Something went wrong");
           } 
        }
        while(x == 1);
    }
       
}





 