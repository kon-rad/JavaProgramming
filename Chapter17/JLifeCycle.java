/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 19, 2017 
 * Chapter: 17
 * Page: 963
 * Title: Java Programming: Level II 
 *
 * You Do It
 * Understanding the Applet Life Cycle
 * 
 */   
import javax.swing.*;  
import java.awt.*; 
import java.awt.event.*;


public class JLifeCycle extends JApplet implements ActionListener
{  
    // Data Fields 
    JLabel showInit = new JLabel("init ");
    JLabel showStart = new JLabel("start ");
    JLabel showDisplay = new JLabel("display ");
    JLabel showAction = new JLabel("action ");
    JLabel showStop = new JLabel("stop ");
    JLabel showDestroy = new JLabel("destroy ");
    
    JButton pressButton = new JButton("Press");
    
    int countInit, countDisplay, countAction, countStart, countStop, countDestroy;
    
    public void init() 
    {
        Container con = getContentPane();
        con.setLayout(new FlowLayout());
        ++countInit;
        con.add(showInit);
        con.add(showStart);
        con.add(showDisplay);
        con.add(showAction);
        con.add(showStop);
        con.add(showDestroy);
        con.add(pressButton);
        pressButton.addActionListener(this);
        display();
    }
    public void start()
    {
        ++countStart;
        display();
    }
    public void display()
    {
        ++countDisplay;
        showInit.setText("init " + countInit);
        showStart.setText("Start " + countStart);
        showDisplay.setText("Display " + countDisplay);
        showAction.setText("Action " + countAction);
        showStop.setText("Stop " + countStop);
        showDestroy.setText("Destroy " + countDestroy);
    }
    public void stop()
    {
        ++countStop;
        display();
    }
    public void destroy()
    {
        ++countDestroy;
        display();
    }
    public void actionPerformed(ActionEvent e)
    {
        ++countAction;
        display();
    }
}
