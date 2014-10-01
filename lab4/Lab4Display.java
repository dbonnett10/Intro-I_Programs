//************************************************
// Honor Code: The work I am submitting is a result of my own thinking and efforts. 
// Dan Bonnett
// CMPSC 111 Fall 2014
// Lab 4
// September 25 2014

// Purpose: To gain more experience using graphics methods in Java.
//************************************************


import javax.swing.*;

public class Lab4Display
{
    public static void main(String[] args)
    {
        	JFrame window = new JFrame(" Dan Bonnett ");

      		// Add the drawing canvas and do necessary things to
     		// make the window appear on the screen!
        	window.getContentPane().add(new Lab4());
        	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	window.setVisible(true);
			window.setSize(1000,800);
        	
    }
}

