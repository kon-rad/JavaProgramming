/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 26, 2017 
 * Final Project
 * Page: 799, Chapter 14, Game Zone 2
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
 * 1. Add a menu bar to the program with a File menu.
 * 2. In the File menu, add a submenu (JMenuItem) called About.
 * 3. When the user clicks on the About menu item, display a
 * JOptionPane message dialog that contains your name, your
 * course, the section number, and MEID.
 * 
 * 
 */   
import javax.swing.*;  
import java.awt.*; 
import java.awt.event.*;
import java.util.List;
import java.util.Arrays;


public class JLottery2 extends JFrame implements ItemListener, ActionListener
{  
    int count = 0, p = 0, j = 0;
    int[] pickedArray = new int[6];
    int matches = 0;
    final int[] WIN = { 0, 0, 0, 100, 10000, 50000, 1000000 };
    String pickedNumbers = " ";
    String lotteryNumbers = " ";
    int[] randomNumbersArray = new int[6];
    JLabel labelPickedNumbers =  new JLabel(" ");
    JLabel labelLotteryNumbers = new JLabel(" ");
    JLabel labelMatches = new JLabel(" ");
    JCheckBox[] checkBoxes = new JCheckBox[30];
    JLabel mainLabel = new JLabel("Pick six numbers");
    List randomNumberList = Arrays.asList(randomNumbersArray);
    JPanel panelMain = new JPanel();
    JPanel subPanel = new JPanel();
    JPanel bottomPanel = new JPanel();
    JMenuBar mainBar = new JMenuBar();
    JMenu menu1 = new JMenu("File");
    JMenuItem about = new JMenuItem("About");
    JButton restart = new JButton("Play Again");
    
    
    public JLottery2() 
    {
        super("Six Check Boxes Lottery");
        generateRandomNumbers();
        composeMenus();
        addActionListeners();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panelMain);
        panelMain.setLayout(new BorderLayout());
        mainLabel.setFont(new Font("Arial", Font.PLAIN, 28));
        panelMain.add(mainLabel, BorderLayout.NORTH);
        for (int i = 0; i < checkBoxes.length; ++i) 
        {
            checkBoxes[i] = new JCheckBox(" " + (i + 1));
            subPanel.add(checkBoxes[i]);
            checkBoxes[i].addItemListener(this);
        }
        panelMain.add(subPanel, BorderLayout.CENTER);
        bottomPanel.add(labelPickedNumbers);
        bottomPanel.add(labelLotteryNumbers);
        bottomPanel.add(labelMatches);
   //      bottomPanel.add(restart);
//         restart.addActionListener(this);
        panelMain.add(bottomPanel, BorderLayout.SOUTH);
    }
    
    public void itemStateChanged(ItemEvent event) 
    {
        Object source = event.getSource();
        for(j = 0; j < checkBoxes.length; ++j) 
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
            for(int m = 0; m < randomNumbersArray.length; ++m) 
            {
                for(p = 0; p < pickedArray.length; ++p) 
                {
                    if(randomNumbersArray[m] == pickedArray[p])
                        matches++;
                }
                lotteryNumbers += " " + randomNumbersArray[m]; 
            }
            labelLotteryNumbers.setText("Lottery Numbers: " + lotteryNumbers);
            labelPickedNumbers.setText("Your Numbers: " + pickedNumbers);
            labelMatches.setText("There were " + matches + " matches!\n You win $" + WIN[matches] + "!");
        }
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        Object source = e.getSource();
        if (source == about)
            JOptionPane.showMessageDialog(null, "Name: Konrad Gnat\nCourse Number: CIS263AA" 
                + "\nSection Number: 36454\nMEID: KON2155430");
//         else if(source == restart) 
//         {
//             invalidate();
//             validate();
//             repaint();
//             matches = 0;
//             count = 0;
//             generateRandomNumbers();
//             for(j = 0; j < checkBoxes.length; ++j) 
//             {
//                   checkBoxes[j].setState(false);
//             }
//         }
            
    }

    
    public void generateRandomNumbers() 
    {
        for(int n = 0; n < randomNumbersArray.length; n++) 
        {
            int newNumber = (int) (Math.random() * 30 + 1);
            for(p = 0; p < randomNumbersArray.length; ++p) 
            {
                if (randomNumbersArray[p] == newNumber)
                {
                    --n;
                    break;
                }
            }
            randomNumbersArray[n] = newNumber; 
        }
    }

    public void composeMenus() 
    {
        setJMenuBar(mainBar);
        mainBar.add(menu1);
        menu1.add(about);
    }
    public void addActionListeners() 
    {
        about.addActionListener(this);
    }
    
    public static void main(String[] args)
    { 
         // Run Application
         JLottery2 jl2= new JLottery2();
         jl2.setSize(800, 200);
         jl2.setVisible(true);
    } 
}
