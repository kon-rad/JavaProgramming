/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 26, 2017 
 * Final Project
 * Page: 989
 * Chapter 15, Game Zone 2 (Part A only)
 * Title: Java Programming: Level II 
 *
 * Description:
 * In Chapter 5, you created a Rock Paper Scissors game. Now create it as a JApplet 
 * in which the user can click one of three buttons labeled "Rock", "Paper", or 
 * "Scissors". The computer's choice is still randomly generated. Figure 17-23 shows
 * a typical execution after the user has played a few games. Save the applet as
 * JRockPaperScissors.java.
 *
 * Additional requirements are as follows:
 * 1. Keep a tally that shows the number of games that the player has won, tied, or lost.
 * 2. Use the drawString() method to display your name, course, section number, and MEID in the
 * lower left-hand corner of the applet.
 * 
 * 
 */ 
   
import javax.swing.*;  
import java.awt.*; 
import java.awt.event.*;
import java.util.List;
import java.util.Arrays;


public class JRockPaperScissors extends JApplet implements ActionListener
{  
    JLabel main = new JLabel("Rock, Paper, Scissors");
    JLabel instructions = new JLabel("Select one button");
    JLabel youLabel = new JLabel("");
    JLabel compLabel = new JLabel("");
    JLabel winnerLabel = new JLabel("");
    JLabel scoreLabel = new JLabel("");
    JButton rock = new JButton("Rock");
    JButton paper = new JButton("Paper");
    JButton scissors = new JButton("Scissors");
    Container con = getContentPane();
    int you, comp, youWins = 0, compWins = 0, ties = 0;
    String[] choicesArray = {"", "Rock", "Paper", "Scissors"};
    String winner = "", name = "Name: Konrad Gnat", course = "Course Number: CIS263AA", 
    section = "Section Number: 36454", MEID = "MEID: KON2155430";
    JPanel top = new JPanel();
    JPanel center = new JPanel();
    
    public void init() 
    {
        setSize(300, 500);
        con.setLayout(new BorderLayout());
        top.add(main);
        top.add(instructions);
        center.add(rock);
        center.add(paper);
        center.add(scissors);
        center.add(youLabel);
        center.add(compLabel);
        center.add(winnerLabel);
        center.add(scoreLabel);
        con.add(top, BorderLayout.NORTH);
        con.add(center, BorderLayout.CENTER);
        rock.addActionListener(this);
        paper.addActionListener(this);
        scissors.addActionListener(this);
    }
    
    public void paint(Graphics brush)
    {
        super.paint(brush);
        brush.drawString(name, 20, 420);
        brush.drawString(course, 20, 440);
        brush.drawString(section, 20, 460);
        brush.drawString(MEID, 20, 480);
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        Object source = e.getSource();
        if(source == rock) 
        {
            you = 1;
        } 
        else if(source == paper)
        {
            you = 2;
        } 
        else if(source == scissors)
        {
            you = 3;
        }
        comp = (int) (Math.random() * 3 + 1);
        if(you == comp)
        {
            winner = "Tie";
            ties++;
        }
        else if((you == 1 && comp == 3) || (you == 2 && comp == 1) 
            || (you == 3 && comp == 2))
        {
            winner = "You";
            youWins++;
        }
        else if((you == 1 && comp == 2) || (you == 2 && comp == 3) 
            || (you == 3 && comp == 1))
        {
            winner = "Computer";
            compWins++;
        }
        youLabel.setText("You chose: " + choicesArray[you]);
        compLabel.setText("Computer chose: " + choicesArray[comp]);
        winnerLabel.setText("Winner: " + winner);
        scoreLabel.setText("Score - You: " + youWins + " Computer: " + compWins 
            + " Ties: " + ties);
    }
}
