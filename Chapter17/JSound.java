/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 19, 2017 
 * Chapter: 17
 * Page: 978
 * Title: Java Programming: Level II 
 *
 * You Do It
 * Adding sound to JApplets
 * 
 */   
import javax.swing.*;  
import java.awt.*; 
import java.applet.*;


public class JSound extends JApplet 
{  
    // Data Fields 
    AudioClip sound;
    
    public void init()
    {
        sound = getAudioClip(getCodeBase(), "mysteryTune.au");
    }
    public void start()
    {
         sound.loop();
    }
    public void stop()
    {
        sound.stop();
    }
    
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2D = (Graphics2D)g;
        g2D.drawString("Listen to the mystery tune ", 10, 10);
    }
    
}
