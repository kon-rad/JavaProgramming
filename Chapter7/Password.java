import javax.swing.JOptionPane;
/*
 * Created by Konrad Gnat
 * On:  October 14, 2016
 * Lesson: 7
 * Exercise: 12
 * Title: Java Programming: Level I
 *
 * Write an application that accepts a user's password from the keyboard.
 * When the password entered is less than six characters, more than 10 
 * characters, or does not contain at least one letter and one digit, 
 * prompt the user again. When the user's entry meets all the password 
 * requirements, prompt the user to re-enter the password, and do not 
 * let the user continue until the second password matches the first one.
 * Save the file as Password.Java.
 */

public class Password {
    public static boolean passwordCorrect = false;
    public static String password;
    public static boolean passwordReenter = false; 
    public static String secondPassword;


    public static void main(String[] args) { 
        passwordPrompt();
        checkPassword(password);            
        while (!passwordCorrect) {
            JOptionPane.showMessageDialog(null, "INVALID: " + password);
            passwordPrompt();
            checkPassword(password);
        }
        passwordReenterPrompt();
        checkReentry(secondPassword);
        while (!passwordReenter) {
             JOptionPane.showMessageDialog(null, "Error: passwords do not match. ");
             passwordReenterPrompt();
             checkReentry(secondPassword);
        }
        JOptionPane.showMessageDialog(null, "Success: your new password is: " +
            password);

    }
    
    public static void passwordPrompt() {
    
        password = JOptionPane.showInputDialog(null, "Please enter new " 
            + "password. \nPassword needs to be more than six characters,"
            + " and less \nthan ten characters long. It needs to contain "
            + "at least \none letter and one digit.");
    }
    
    
    
    public static void checkPassword(String pass) {
        int characters = 0, letters = 0, digits = 0;
        for (int i = 0; i < pass.length(); i++) {
             if (Character.isLetter(pass.charAt(i))) {
                characters++;
                letters++;    
             }
             if (Character.isDigit(pass.charAt(i))) {
                characters++;
                 digits++;    
             }
        }
        if ( characters >= 6 && characters <= 10 && letters > 0
             && digits > 0) {
             passwordCorrect = true;
        }
     } 
     
     public static void passwordReenterPrompt() {  
         secondPassword = JOptionPane.showInputDialog(null, "VALID PASSWORD\nPlease reenter to varify: ");
    }
    
    public static void checkReentry(String secPass) {
        if (password.regionMatches(0, secPass, 0, secPass.length())) {
             passwordReenter = true;
        }
    } 
     
       
       

}        