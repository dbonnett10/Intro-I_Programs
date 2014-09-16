
//*************************************
// Honor Code: The work I am submitting is a result of my own thinking and efforts.
// Dan Bonnett
//CMPSC 111 Fall 2014
// Lab 2
// Date: September 11, 2014
//
// Purpose: To compute the average speed of three pitches in feet per second.
//*************************************
import java.util.Date; 

public class Lab2
{
    //---------------------------
    //main method: program execution begins here
    //---------------------------
    public static void main(String[] args)
    {
       // Label output with name and date:
       System.out.println("Dan Bonnett\nLab 2\n" + new Date() + "\n");
       // Variables:
       int pitch1 = 92;    // speed of pitch 1 in miler per hour
       int pitch2 = 93;    // speed of pitch 2 in miles per hour
       int pitch3 = 85;    // speed of pitch 3 in miles per hour
       int averageSpeed = (pitch1 + pitch2 + pitch3)/3;  // calculates the average speed in miles per hour
       int feetPerMile = 5280;
       int secondsPerHour = 3600;
       int finalAverageSpeed = averageSpeed * feetPerMile / secondsPerHour;  // converts the final average speed in feet per second
      
	 System.out.println("Pitch 1: " + pitch1);
	 System.out.println("Pitch 2: " + pitch2);
	 System.out.println("Pitch 3: " + pitch3);
	 System.out.println("Average Speed: " + averageSpeed);
	 System.out.println("Feet per Mile: " + feetPerMile);
	 System.out.println("Seconds per Hour: " + secondsPerHour);
	 System.out.println("Final Average Speed: " + finalAverageSpeed + " Feet per Second"); 

       
    }
}
