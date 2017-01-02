/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: December 31, 2016 
 * Chapter: 14
 * Page: 746
 * You Do It: Creating a JFrame II
 * Title: Java Programming: Level II 
 *
 * 
 * 
 * 
 */   
import javax.swing.*;

 
 
public class JDemoFrameThatCloses
{  
    public static void main(String[] args)
    {
        JFrame aFrame = new JFrame("This is a frame");
        final int WIDTH = 250;
        final int HEIGHT = 250;
        aFrame.setSize(WIDTH, HEIGHT);
        aFrame.setVisible(true);
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}
