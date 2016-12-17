/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: December 17, 2016 
 * Chapter: 11
 * Page: 598
 * Exercise: 12
 * Title: Java Programming: Level II 
 *
 * Description:
 * Create an interface called Player.  The interface has an abstract method called
 * play() that displays a message describing the meaning of “play” to the class.  
 * Create classes called Child, Musician and Actor that all implement Player.  
 * Create an application that demonstrates the use of the classes.  Save the files
 * as Player.java, Child.java, Actor.java, Musician.java and UsePlayer.java
 *
 */   

 
 
public class Actor implements Player
{
    public void play()
    {
        System.out.println("I am an actor that plays a part in a drama.");
    }
}





 

