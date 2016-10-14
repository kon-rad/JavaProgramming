import javax.swing.JOptionPane;
/*
 * Created by Konrad Gnat
 * On:  October 14, 2016
 * Lesson: 7
 * Exercise: 13 pt.2
 * Title: Java Programming: Level I
 *
 * Prompt the user to enter the data needed to output a summary 
 * of the information gathered. Make sure to ask for the information 
 * in the format you would like it from the user and adhere to the 
 * following:... 
 */

public class PrepareTax {
    public static String soc;
    public static int zip;
    public static String mar;
    public static int ann;
    public static boolean correctSoc = false;
    public static boolean correctZip = false;
    public static boolean correctMar = false;
    public static boolean correctAnn = false;

    public static void main(String[] args) {
        String fir, las, str, cit, sta;
        
        fir = JOptionPane.showInputDialog(null, "Please enter first name:");
        las = JOptionPane.showInputDialog(null, "Please enter last name:");
        str = JOptionPane.showInputDialog(null, "Please enter street address:");
        cit = JOptionPane.showInputDialog(null, "Please enter city:");
        sta = JOptionPane.showInputDialog(null, "Please enter state:");
        
        promptSoc();
        checkSoc(soc);
        while (!correctSoc) {
            errorMessage();
            promptSoc();
            checkSoc(soc);
        }
        promptZip();
        checkZip(zip);
        while (!correctZip) {
            errorMessage();
            promptZip();
            checkZip(zip);
        }
        promptMar();
        checkMar(mar);
        while (!correctMar) {
            errorMessage();
            promptMar();
            checkMar(mar);
        }
        promptAnn();
        checkAnn(ann);
        while (!correctAnn) {
            errorMessage();
            promptAnn();
            checkAnn(ann);
        }  

        TaxReturn tax001 = new TaxReturn(soc, las, fir, str, cit, sta, zip, ann, mar);
        tax001.displayTaxReturn();
    }

    public static void errorMessage() {
         JOptionPane.showMessageDialog(null, "Error, incorrect entry");
    }
    
    // Methods prompt user for information
        
    public static void promptSoc() {
        soc = JOptionPane.showInputDialog(null, "Please enter social security number:\n(xx-xx-xxxx)");
    }
    public static void promptZip() {
        String temp; 
        temp = JOptionPane.showInputDialog(null, "Please enter zip code:");
        zip = Integer.parseInt(temp);
    }
    public static void promptMar() {
         mar = JOptionPane.showInputDialog(null, "Please enter marital status:\n(Single or Married)");
    }
    public static void promptAnn() {
        String temp; 
        temp = JOptionPane.showInputDialog(null, "Please enter annual income:");
        ann = Integer.parseInt(temp);
    }
    
    // Method check for valid input
    
    public static void checkSoc(String soc) { 
        if (soc.length() == 11) {
            if(soc.charAt(3) != '-')
                return;
            if(soc.charAt(6) != '-')
                return;
            for (int i = 0; i < 3; i++) {
                if (!Character.isDigit(soc.charAt(i)))
                    return;
            }
            for (int i = 4; i < 6; i++) {
                if (!Character.isDigit(soc.charAt(i)))
                    return;
            } 
            for (int i = 7; i < 10; i++) {
                if (!Character.isDigit(soc.charAt(i)))
                    return;
            }
            correctSoc = true; 
        }    
    }
    public static void checkZip(int zip) {
        if (String.valueOf(zip).length() == 5)
            correctZip = true;
    }
    public static void checkMar(String mar) {
        if (Character.toUpperCase(mar.charAt(0)) == 'S' || 
            Character.toUpperCase(mar.charAt(0)) == 'M')
            correctMar = true; 
    }
    public static void checkAnn(int ann) {
        if (ann > 0)
            correctAnn = true;
    }

}

