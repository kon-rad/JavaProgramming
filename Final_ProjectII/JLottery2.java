/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 10, 2017 
 * Chapter: 16
 * Page: 939
 * Exercise 7b
 * Title: Java Programming: Level II 
 *
 * Description:
 * In Chapter 5, you created a lottery game application. Create a similar game using 
 * check boxes. For this game, generate six random numbers, each between 0 and 30 
 * inclusive. Allow the user to choose six check boxes to play the game. (Do not 
 * allow the user to choose more than six boxes.) After the player has chosen six 
 * numbers, display the randomly selected numbers, the player ’ s numbers, and the 
 * amount of money the user has won, as follows: Matching Numbers Three matches Four 
 * matches Five matches Six matches Zero, one, or two matches Award ($) 100 10,000 
 * 50,000 1,000,000 0

 * Additional requirements are as follows:
 * Add a menu bar to the program with a File menu.
 * In the File menu, add a submenu (JMenuItem) called About.
 * When the user clicks on the About menu item, display a
 * JOptionPane message dialog that contains your name, your
 * course, the section number, and MEID.
 * 
 * 
 */   
import javax.swing.*;  
import java.awt.*; 
import java.awt.event.*;
import java.awt.Color;


public class JLottery2 extends JFrame implements ItemListener
{  

    
    public static void main(String[] args)
    { 
         // Run Application
         JSmileFace2 jnc= new JSmileFace2();
         jnc.setSize(400, 400);
         jnc.setVisible(true);
    } 
}
