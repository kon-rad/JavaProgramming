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
 * Description:
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

 
 
public class DoublesTennisGame extends TennisGame
{

    // Declare data fields
    private String player1Partner;
    private String player2Partner;
    
    // Get Methods
    public String getPlayer1Partner() 
    {
        return player1Partner;
    }
    public String getPlayer2Partner() 
    {
        return player2Partner;
    }
    
    // Set Methods
    public void setNames(String n1, String n1p, String n2, String n2p) 
    {
        super.setNames(n1, n2);
        player1Partner = n1p;
        player2Partner = n2p;
    }   
    
}


