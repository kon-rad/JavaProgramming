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

 
 
public class TennisGame
{

    //Declare data fields
    private String player1;
    private String player2;
    private int player1FinalScoreInt;
    private String player1FinalScoreString;
    private int player2FinalScoreInt;
    private String player2FinalScoreString;
    
    // Get Methods
    public String getPlayer1() 
    {
        return player1;
    }
    public String getPlayer2() 
    {
        return player2;
    }
    public int getPlayer1FinalScoreInt() 
    {
        return player1FinalScoreInt;
    }
    public int getPlayer2FinalScoreInt() 
    {
        return player2FinalScoreInt;
    }
    public String getPlayer1FinalScoreString() 
    {
        return player1FinalScoreString;
    }
    public String getPlayer2FinalScoreString() 
    {
        return player2FinalScoreString;
    }
    
    // Set Methods
    public void setPlayer1(String nam) 
    {
        player1 = nam;
    }
    public void setPlayer2(String nam) 
    {
        player2 = nam;
    }
    public void setNames(String n1, String n2) 
    {
        player1 = n1;
        player2 = n2;
    }
    public void setFinalScores(int s1, int s2) 
    {
        if (s1 < 0 || s1 > 4 || s2 < 0 || s2 > 4) 
        {
            player1FinalScoreInt = 0;
            player1FinalScoreString = "error";
            player2FinalScoreInt = 0;
            player2FinalScoreString = "error";
        } 
        else if (s1 == 4 && s2 == 4) 
        {
            player1FinalScoreInt = 0;
            player2FinalScoreInt = 0;
            player1FinalScoreString = "error";
            player2FinalScoreString = "error";
        }
        else 
        {
            switch(s1) 
            {
                case 0:
                    player1FinalScoreInt = 0;
                    player1FinalScoreString = "love";
                    break;
                case 1:
                    player1FinalScoreInt = 1;
                    player1FinalScoreString = "15";
                    break;
                case 2:
                    player1FinalScoreInt = 2;
                    player1FinalScoreString = "30";
                    break;
                case 3:
                    player1FinalScoreInt = 3;
                    player1FinalScoreString = "40";
                    break;
                case 4:
                    player1FinalScoreInt = 4;
                    player1FinalScoreString = "game";
                    break;
            }
            switch(s2) 
            {
                case 0:
                    player2FinalScoreInt = 0;
                    player2FinalScoreString = "love";
                    break;
                case 1:
                    player2FinalScoreInt = 1;
                    player2FinalScoreString = "15";
                    break;
                case 2:
                    player2FinalScoreInt = 2;
                    player2FinalScoreString = "30";
                    break;
                case 3:
                    player2FinalScoreInt = 3;
                    player2FinalScoreString = "40";
                    break;
                case 4:
                    player2FinalScoreInt = 4;
                    player2FinalScoreString = "game";
                    break;
            }
        }
    }           
}


