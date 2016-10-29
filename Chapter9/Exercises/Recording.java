/*
 * Created by Konrad Gnat
 * On:  October 28, 2016
 * Lesson: 
 * Exercise: 3a
 * Title: Java Programming: Level I
 *
 * a. Radio station JAVA wants a class to keep track of recordings it plays. Create a
 * class named Recording that contains fields to hold methods for setting and getting
 * a Recording's title, artist, and playing time in seconds. Save the file as
 * Recording.java.
 * 

 *
 */
 
public class Recording 
{  
    private String title;
    private String artist;
    private double playingTime;
    
    public void setTitle(String t)
    {
        title = t;
    }
    public void setArtist(String a)
    {
        artist = a;
    }
    public void setPlayingTime(double p)
    {
        playingTime = p;
    }
    
    public String getTitle()
    {
        return title;
    }
    public String getArtist()
    {
        return artist;
    }
    public double getPlayingTime()
    {
        return playingTime;
    }
}
