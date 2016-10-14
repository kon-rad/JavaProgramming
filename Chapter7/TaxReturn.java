import javax.swing.JOptionPane;
/*
 * Created by Konrad Gnat
 * On:  October 14, 2016
 * Lesson: 7
 * Exercise: 13 pt.1
 * Title: Java Programming: Level I
 *
 * Create a TaxReturn class with fields that hold a taxpayer's Social 
 * Security number, last name, first name, middle initial, zip code, annual
 * income, marital status, number of vehicles owned, number of pets 
 * owned, and number of toasters owned. The StringBuilder class must be
 *  used in this Assignment. The program will calculate the tax liability
 *  based on annual income and the percentages in the following table: 
 */

public class TaxReturn {
    private String socialSecurity;
    private String lastName;
    private String firstName;
    private String streetAddress;
    private String city;
    private String state;
    private int zipCode;
    private int annualIncome;
    private String maritalStatus;
    private double taxLiability;
    
    public void displayTaxReturn() {
        System.out.println("Social Security: " + socialSecurity + 
            "\nName: " + firstName + " " + lastName + "\nAddress: "
            + streetAddress + "\nCity: " + city + "\nState: " + state
            + "\nZip Code: " + zipCode + "\nAnnual Income: " + 
            annualIncome + "\nMarital Status: " + maritalStatus +
            "\nTax Liability: " + taxLiability);
    }
    
    public TaxReturn(String soc, String las, String fir, String str, String cit,
        String sta, int zip, int ann, String mar) {
        
        socialSecurity = soc;
        lastName = las;
        firstName = fir;
        streetAddress = str;
        city = cit;
        state= sta;
        zipCode = zip;
        annualIncome = ann;
        maritalStatus = mar;
        
        if (maritalStatus == "Single") {
            if (annualIncome <= 20000)
                taxLiability = (annualIncome * 0.15);
            else if (annualIncome > 20000 && annualIncome <= 50000)
                taxLiability = (annualIncome * 0.22);
            else if (annualIncome > 50000)
                taxLiability = (annualIncome * 0.30);
        }
        else {
            if (annualIncome <= 20000)
                taxLiability = (annualIncome * 0.14);
            else if (annualIncome > 20000 && annualIncome <= 50000)
                taxLiability = (annualIncome * 0.20);
            else if (annualIncome > 50000)
                taxLiability = (annualIncome * 0.28);
        }

    }
}