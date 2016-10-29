 import javax.swing.*;  
/*
 * Created by Konrad Gnat
 * On:  October 28, 2016
 * Lesson: 9
 * Exercise: 3b
 * Title: Java Programming: Level I
 *
 * b. Write an application that instantiates five Recording objects and prompts the user for
 * values for the data fields. Then prompt the user to enter which field
 * the Recordings should be sorted by'song title, artist, or playing time. Perform the
 * requested sort procedure, and display the Recording objects. Save the file
 * as RecordingSort.java.
 * 

 *
 */
 
public class RecordingSort
{  
    public static void main(String[] args) 
    {
        String input, sort;
        double inputDouble; 
        Recording[] recordings = new Recording[5];
        for (int i = 0; i < recordings.length; i++) {
            recordings[i] = new Recording();
            input = JOptionPane.showInputDialog(null, "Recording no. " 
                + (i + 1) +"\nEnter title: ");
            recordings[i].setTitle(input);
            input = JOptionPane.showInputDialog(null, "Recording no. " 
                + (i + 1) +"\nEnter artist: ");
            recordings[i].setArtist(input);
            input = JOptionPane.showInputDialog(null, "Recording no. " 
                + (i + 1) +"\nEnter playing time: ");
            inputDouble = Double.parseDouble(input);
            recordings[i].setPlayingTime(inputDouble);
        }
        sort = JOptionPane.showInputDialog(null, "How to sort? "
            + "\n(Select: artist, title or playing time)"); 
        bubbleSort(recordings, sort);
    }
    
    public static void bubbleSort(Recording[] array, String sort) 
    {
        int i, j;
        Recording temp;
        int length = array.length - 1;
        if (sort.toLowerCase().equals("artist")) 
        {
            for (i = 0; i < length; i++) 
            {
                for (j = 0; j < length; j++) 
                {
                    if (array[j].getArtist().compareTo(array[j + 1].getArtist()) > 0 ) 
                    {  
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                    
                }
            }         
        } else if (sort.toLowerCase().equals("title")) 
        {
            for (i = 0; i < length; i++) 
            {
                for (j = 0; j < length; j++) 
                {
                    if (array[j].getTitle().compareTo(array[j + 1].getTitle()) > 0 ) 
                    {  
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                    
                }
            }         
        } else if (sort.toLowerCase().equals("playing time")) 
        {
            for (i = 0; i < length; i++) 
            {
                for (j = 0; j < length; j++) 
                {
                    if (array[j].getPlayingTime() > array[j + 1].getPlayingTime()) 
                    {  
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                    
                }
            }         
        }
        String output = "";
        for (i = 0; i <= length; i++)
        {
             output += "\nRecording no. " 
                + (i + 1) + " title: " + array[i].getTitle() + 
                 "\nRecording no. " 
                + (i + 1) + " artist: " + array[i].getArtist() + 
                "\nRecording no. " 
                + (i + 1) + " playing time: " + array[i].getPlayingTime();
        }
        JOptionPane.showMessageDialog(null, output);
                
    }
}

