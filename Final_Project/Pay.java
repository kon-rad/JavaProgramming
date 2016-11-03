
/*
 * Created by Konrad Gnat
 * Course Number: CIS163AA
 * Section Number: Class # 36435
 * MEID: KON2155430
 * On:  November 2, 2016
 * Final Project 
 * Chapter: 5
 * Page: 292-293
 * Exercise: 6
 * Title: Java Programming: Level I 
 *
 * Barnhill Fastener Company runs a small factory. The company employs 
 * workers who are paid one of three hourly rates depending on skill level:
 * Skill Level       Hourly Pay Rate ($)
 *   1	            $17.00
 *   2	            $20.00
 *   3	            $22.00
 * 
 * Each factory worker might work any number of hours per week; any hours
 * over 40 are paid at one and one-half time the usual rate. In addition, 
 * workers in skill level 2 & 3 can elect the following insurance options:
 * Option	Explanation	                     Weekly cost to employee ($)
 *   1	   Medical Insurance	               $32.50
 *   2	   Dental Insurance	               $20.00
 *   3	   Long-term disability insurance	$10.00
 * 
 * Also, workers in skill level 3 can elect to participate in the retirement 
 * plan at 3% of their gross pay. Write an interactive Java payroll application 
 * that calculates the net pay for a factory worker. The program prompts the user
 * for skill level and hours worked, as well as the appropriate insurance and 
 * retirement options for the employee’s skill level category. The application
 * displays: (1) the hours worked, (2) the hourly pay rate, (3) the regular 
 * pay for 40 hours, (4) the overtime pay, (5) the total of regular and 
 * overtime pay, and (6) the total itemized deductions. If the deductions 
 * exceed the gross pay, display an error message; otherwise calculate and 
 * display (7) the net pay after all the deductions have been subtracted from 
 * the gross. Save the file as pay.java
 *
 * Additional Requirements: 
 * • Use three JOptionPane Confirm Dialog Boxes (using the JOptionPane.YES_NO_OPTION)
 * to ask the worker if they want medical insurance, dental insurance, and long-term 
 * disability insurance, as the worker can enroll in more than one insurance option.
 * • Use a do...while() loop to ask the user for their skill level. Keep looping 
 * until a valid skill level is provided.
 * • Use a JOptionPane to show the worker’s gross pay.
 * 
 *
 */ 
 
import java.util.*;
import javax.swing.*;
 
 
public class Pay
{
    public static void main(String[] args) 
    { 
        //Declare variables
        final int FULL_TIME_HOURS = 40;
        String skillLevel, hoursWorked;
        int skillLevelInt, medicalInsurance, dentalInsurance, disabilityInsurance,
            retirementPlan = 1;
        boolean validSkillLevel = false, skillLevel3 = false;
        double payRate = 0, regularPay, overtimePay, grossPay, deductionsTotal = 0, netPay,
            hoursWorkedDouble;
        
        //Skill level prompt loop
        do {
            skillLevel = JOptionPane.showInputDialog(null, "Enter skill level:\n" 
                + "\nSkill Level     Hourly Pay Rate" 
                + "\n    1                  17.00"
                + "\n    2                  20.00"
                + "\n    3                  23.00");
           if (skillLevel.equals("1"))
           {
               validSkillLevel = true;
               payRate = 17.00;
           }
           else if (skillLevel.equals("2"))
           {
               validSkillLevel = true; 
               payRate = 20.00;
           }
           else if (skillLevel.equals("3"))
           {
               validSkillLevel = true; 
               payRate = 23.00;
               skillLevel3 = true;
           }         
        }    
        while (!validSkillLevel);
        
        //Hours worked prompt
        hoursWorked = JOptionPane.showInputDialog(null, "Hours worked in week: ");
        
        //Display insurance options
        if (skillLevel3)
        {
           JOptionPane.showMessageDialog(null, 
                 "Option	Explanation	                         Weekly cost to employee ($)"
               + "\n1	   Medical Insurance	                     $32.50"
               + "\n2	   Dental Insurance	                       $20.00"
               + "\n3	   Long-term disability insurance	$10.00"
               + "\n4	   Retirement plan	                         %3 of gross pay");
        } 
        else
        {
            JOptionPane.showMessageDialog(null, 
                  "Option	Explanation	                        Weekly cost to employee ($)"
                + "\n1	   Medical Insurance	                    $32.50"
                + "\n2	   Dental Insurance	                     $20.00"
                + "\n3	   Long-term disability insurance	$10.00");
        }
        
        //Insurance options prompts    
        medicalInsurance = JOptionPane.showConfirmDialog(null, 
            "Choose medical insurance?", "Medical Insurance",
             JOptionPane.YES_NO_OPTION); 
        dentalInsurance = JOptionPane.showConfirmDialog(null, 
            "Choose dental insurance?", "Dental Insurance",
             JOptionPane.YES_NO_OPTION); 
        disabilityInsurance = JOptionPane.showConfirmDialog(null, 
            "Choose long-term disability insurance?", "Long-term Disability Insurance",
             JOptionPane.YES_NO_OPTION); 
        if (skillLevel3)
        {
            retirementPlan = JOptionPane.showConfirmDialog(null, 
                "Choose retirement plan?", "Retirement Plan",
                 JOptionPane.YES_NO_OPTION); 
        }       
        
        //Calculate pay 
        hoursWorkedDouble = Double.parseDouble(hoursWorked);
        if (hoursWorkedDouble > FULL_TIME_HOURS)
        {
            overtimePay = (hoursWorkedDouble - FULL_TIME_HOURS) * payRate * 1.5;
            regularPay = FULL_TIME_HOURS * payRate;
        }
        else 
        {
            overtimePay = 0;
            regularPay = hoursWorkedDouble * payRate;
        }
        grossPay = regularPay + overtimePay;
        
        //Calculate Deductions 
        if (medicalInsurance == 0)
        {
            deductionsTotal += 32.50;
        }
        if (dentalInsurance == 0)
        {
            deductionsTotal += 20.00;
        }
        if (disabilityInsurance == 0)
        {
            deductionsTotal += 10.00;
        } 
        if (retirementPlan == 0)
        {
            deductionsTotal += (grossPay * 0.03);
        } 
        
        netPay = grossPay - deductionsTotal;
        //Display negative net pay error
        if (netPay < 0) 
        {
            JOptionPane.showMessageDialog(null, 
                "ERROR: deductions exceed gross pay");
        }
        else
        {       
                
        //Display information 
            JOptionPane.showMessageDialog(null, "Your gross pay is: $"
                + grossPay);
           
            JOptionPane.showMessageDialog(null, "Detailed Information"
                + "\nHours worked:     " + hoursWorked
                + "\nPay rate:              $" + payRate
                + "\nRegular pay:        $" + regularPay
                + "\nOvertime pay:      $" + overtimePay
                + "\nGross pay:            $" + grossPay
                + "\nTotal deductions:$" + deductionsTotal
                + "\nNet pay:              $" + netPay); 
        }
    }
}