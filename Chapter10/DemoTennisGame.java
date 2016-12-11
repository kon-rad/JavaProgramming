/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On:  December 10, 2016 
 * Chapter: 10
 * Page: 539
 * Exercise: 3
 * Title: Java Programming: Level II 
 *
 * 
 * Create a class named TennisGame that holds data about a single tennis game. The
 * class has six fields: the names of the two players, the integer final scores for the
 * players, and the String values of the final scores. Include a get method for each of
 * the six fields. Also include a set method that accepts two players' names, and
 * another set method that accepts the two integer final score values. The integer final
 * score for a player is the number of points the player won during the game; this value
 * should be in the range of 0 through 4. If either of the set method parameters for a
 * score is not in the range of 0 through 4, assign 0 to both scores and assign "error" to
 * the String scores. If both players' score parameters are 4, assign 0 to both scores
 * and "error" to the String scores. The String score values are set by the method that
 * sets the integer score values. The String final score for each player contains the
 * traditional names for points in tennis: love, 15, 30, 40, or game, respectively, for the
 * values 0 through 4. Create a subclass named DoublesTennisGame that includes two
 * additional fields for the names of the first two players' partners. Include get methods
 * for the names. Override the parent class setNames() method to accept the names of
 * all four players. Write an application named DemoTennisGames that instantiates
 * several objects of each of these classes. Demonstrate that all the methods assign
 * correct values. Save the files as TennisGame.java, DoublesTennisGame.java,
 * and DemoTennisGames.java. 
 *
 */  
import javax.swing.*;
 
 
public class DemoTennisGame
{
    public static void main(String[] args)
    {
    //Demo of DoublesTennisGame subclass object
    DoublesTennisGame doublesGame = new DoublesTennisGame();
    doublesGame.setNames("Jack", "Jessi", "Peter", "Patti");
    doublesGame.setFinalScores(2, 4);
    
    JOptionPane.showMessageDialog(null, "Player 1: " 
        + doublesGame.getPlayer1() + "\nPartner: " + doublesGame.getPlayer1Partner() 
        + "\nPlayer 2: " + doublesGame.getPlayer2() + "\nPartner: " 
        + doublesGame.getPlayer2Partner() + "\nTeam 1 Score: " + doublesGame.getPlayer1FinalScoreString() 
        + "\nTeam 2 Score: " + doublesGame.getPlayer2FinalScoreString());
        
    //Demo of DoublesTennisGame subclass object with incorrect score input
    DoublesTennisGame doublesGameError = new DoublesTennisGame();
    doublesGameError.setNames("Adam", "Eric", "Joy", "Tony");
    doublesGameError.setFinalScores(4, 4);
    
    JOptionPane.showMessageDialog(null, "Player 1: " 
        + doublesGameError.getPlayer1() + "\nPartner: " + doublesGameError.getPlayer1Partner() 
        + "\nPlayer 2: " + doublesGameError.getPlayer2() + "\nPartner: " 
        + doublesGameError.getPlayer2Partner() + "\nTeam 1 Score: " + doublesGameError.getPlayer1FinalScoreString() 
        + "\nTeam 2 Score: " + doublesGameError.getPlayer2FinalScoreString());
    
    //Demo of TennisGame superclass object   
    TennisGame tennis = new TennisGame();
    tennis.setNames("Paul", "Micheal");
    tennis.setFinalScores(4, 3);
     
    JOptionPane.showMessageDialog(null, "Player 1: " 
        + tennis.getPlayer1() + "\nPlayer 2: " + tennis.getPlayer2() 
        + "\nTeam 1 Score: " + tennis.getPlayer1FinalScoreString() 
        + "\nTeam 2 Score: " + tennis.getPlayer2FinalScoreString());

    //Demo of TennisGame superclass object with incorrect score input  
    TennisGame tennisError = new TennisGame();
    tennisError.setNames("Frank", "Suzie");
    tennisError.setFinalScores(5, 2);
     
    JOptionPane.showMessageDialog(null, "Player 1: " 
        + tennisError.getPlayer1() + "\nPlayer 2: " + tennisError.getPlayer2() 
        + "\nTeam 1 Score: " + tennisError.getPlayer1FinalScoreString() 
        + "\nTeam 2 Score: " + tennisError.getPlayer2FinalScoreString());
    }
}


