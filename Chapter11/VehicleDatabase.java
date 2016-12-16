/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On:  December 15, 2016 
 * Chapter: 11
 * Page: 563-564
 * Using Object References Exercise
 * Title: Java Programming: Level II 
 *
 *
 */  
import javax.swing.*;
 
 
public class VehicleDatabase
{ 
    public static void main(String[] args)
    {
        Vehicle[] vehicles = new Vehicle[5];
        int x;
        
        for(x = 0; x < vehicles.length; ++x)
        {
            String userEntry;
            int vehicleType;
            userEntry = JOptionPane.showInputDialog(null, "Please select the type of\n" 
                + "vehicle you want to enter: \n1 - Sailboat\n" + " 2 - Bicycle");
            vehicleType = Integer.parseInt(userEntry);
            if(vehicleType == 1)
                vehicles[x] = new Sailboat();
            else 
                vehicles[x] = new Bicycle();
        }
        
        StringBuffer outString = new StringBuffer();
        for(x = 0; x < vehicles.length; ++x)
        {
            outString.append("\n" + (x + 1) + " ");
            outString.append(vehicles[x].toString());
        }
        JOptionPane.showMessageDialog(null, "Our available Vehicles include:\n" 
            + outString); 
    }
}





 