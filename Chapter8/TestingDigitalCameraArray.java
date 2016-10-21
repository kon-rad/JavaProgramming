import javax.swing.*;
import java.util.*;

/*
 * Created by Konrad Gnat
 * On:  October 20, 2016
 * Lesson: 8
 * Exercise: 13
 * Title: Java Programming: Level I
 *
 * In the exercises in chapter 5, you created a Digital 
 * Camera class and a TestDigitalCamera application 
 * that accepted and displayed data for four DigitalCamera
 * objects. Now, modify the TestDigitalCamera application 
 * to use an array of four DigitalCamera objects instead 
 * of four individual ones. Save the application as 
 * TestDigitalCameraArray.java.
 */
 
public class TestingDigitalCameraArray 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    String camBrand;
    int camResolution;
    DigitalCamera[] camArray = new DigitalCamera[4];
     
    for (int i = 0; i < camArray.length; i++)
    {
      System.out.println("Enter camera " + (i + 1) 
        + " brand: >>");
      camBrand = input.nextLine();
      System.out.println("Enter camera " + (i + 1)
        + " resolution: >>");
      camResolution = input.nextInt(); 
      camArray[i] = new DigitalCamera(camBrand, camResolution);
      input.nextLine();
    }
       
    for (int i = 0; i < camArray.length; i++)
    {
      camArray[i].displayDigitalCamera();
    }
  }
}  