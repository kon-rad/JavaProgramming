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
    int count = 0;
    int[] pickedArray = new int[6];
    int matches = 0;
    String pickedNumbers = " ";
    String lotteryNumbers = " ";
    int[] randomNumbersArray = new int[6];
    JLabel labelPickedNumbers =  new JLabel(" ");
    JLabel labelLotteryNumbers = new JLabel(" ");
    JLabel[] checkLabels = new JLabel[30];
    JCheckBox[] checkBoxes = new JCheckBox[30];
    JLabel mainLabel = new JLabel("Pick six number");
    
    public void generateRandomNumbers() {
        for(int n = 0; n < 7; ++n) 
        {
            List<long> randomNumberList = Arrays.aslist(randomNumbersArray);
            int newNumber = Math.random() * 30 + 1;
            if( randomNumbersList.contains(newNumber))
                --n;
            else
                randomNumbersArray[n] = newNumber;
        }
    }
    
    public JLottery2() 
    {
        super("Six Check Boxes Lottery");
        generateRandomNumbers();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(mainLabel);
        for (int i = 0; i < 31; ++i) 
        {
            add(checkBoxes[i]);
            checkLabels[i].setText(" " + (i + 1));
            add(checkLabels[i]);
            checkLabels[i].addItemListener(this);
        }
        add(labelPickedNumbers);
        add(labelLotteryNumbers);
    }
    
    public void itemStateChanged(ItemEvent event) 
    {
        Object source = event.getSource();
        for(int j = 0; j < 31; ++j) 
        {
            if(source == checkBoxes[j])
            {
                pickedNumbers += " " + (j + 1) ;
                pickedArray[count] = (j + 1);
                count++;
            }
        }
        if(count == 6) 
        {
            for(int m = 0; m < 7; ++m) 
            {
                if(randomNumbersList.contains(pickedArray[m]))
                    matches++;
            }
            lotteryNumberss += " " + randomNumbersArray[m]; 
            labelLotteryNumbers.setText("Lottery Numbers: " + lotteryNumbers);
            labelPickedNumbers.setText("YourNumbers: " + pickedNumbers);
        }
    }

    
    public static void main(String[] args)
    { 
         // Run Application
         JLottery2 jl2= new JLottery2();
         jl2.setSize(400, 400);
         jl2.setVisible(true);
    } 
}
