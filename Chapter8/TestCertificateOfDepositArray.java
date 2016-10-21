import java.util.*;
/*
 * Created by Konrad Gnat
 * On:  October 20, 2016
 * Lesson: 8
 * Exercise: 12
 * Title: Java Programming: Level I
 *
 * In the Exercises in Chapter 4, you created a CertificateOfDeposit
 * class and a TestCertificateOfDeposit application that instantiated 
 * two CertificateOfDeposit objects. Now, modify the application to 
 * accept data for an array of five CertificateOfDeposit objects, 
 * and then display the data. Save the application as 
 * TestCertificateOfDepositArray.java
 *
 */

public class TestCertificateOfDepositArray
{
  public static void main(String[] args) 
  {
    CertificateOfDeposit[] certArray = new CertificateOfDeposit[1];
  
    int certNum1, certNum2, year1, year2, month1, month2, day1, day2;
    double bal1, bal2;
    String name1, name2;
    Scanner key = new Scanner(System.in);
   
    for (int i = 0; i < certArray.length; i++)
    { 
      System.out.println("Certificate no."+ (i + 1) + " Enter "
      + "certificate number: >>");
      certNum1 = key.nextInt();
      key.nextLine();
      System.out.println("Certificate no."+ (i + 1) + " Enter holders last name: >>");
      name1 = key.nextLine();
      System.out.println("Certificate no."+ (i + 1) + " Enter balance: >>");
      bal1 = key.nextDouble();
      System.out.println("Certificate no."+ (i + 1) + " Enter year: >>");
      year1 = key.nextInt();
      System.out.println("Certificate no."+ (i + 1) + " Enter month: >>");
      month1 = key.nextInt();
      System.out.println("Certificate no."+ (i + 1) + " Enter day: >>");
      day1 = key.nextInt();
   
      certArray[i] = new CertificateOfDeposit(certNum1, name1, bal1, year1, month1, day1);
    }
    for (int j = 0; j < certArray.length; j++)
    {
      System.out.println("Information on certificate: " + (j + 1) + "\n\tCertificate Number "
      + certArray[j].getCertificateNumber() + "\n\tHolders last name: " + 
      certArray[j].getHoldersLastName() + "\n\tBalance: " + certArray[j].getBalance() 
      + "\n\tDate issued: " + certArray[j].getIssueDate() + "\n\tMaturity date: " + 
      certArray[j].getMaturityDate());
    }  
  }
}
