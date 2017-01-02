/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: December 31, 2016 
 * Chapter: 14
 * Page: 765
 * You Do It: Adding Components to a JFrame
 * Title: Java Programming: Level II 
 *
 * 
 * 
 * 
 */   
import javax.swing.*; 

 
 
public class CreateJFrameWithComponents
{ 
    public static void main(String[] args)
    {
        JFrameWithComponents aFrame = new JFrameWithComponents();
        final int WIDTH = 350;
        final int HEIGHT = 100;
        aFrame.setSize(WIDTH, HEIGHT);
        aFrame.setVisible(true);
    }
}
