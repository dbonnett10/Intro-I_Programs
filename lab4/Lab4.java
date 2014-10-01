//****************************************************
// Honor Code: The work I am submitting is a result of my own thinking and efforts.
// Dan Bonnett
// CMPSC 111 Fall 2014
// Lab 4
// September 25 2014

// Purpose: Create my own drawing.
//****************************************************
import java.awt.*;
import javax.swing.JApplet;

public class Lab4 extends JApplet
{
    //-------------------------------------------------
    // Use Graphics methods to add content to the drawing canvas
    //-------------------------------------------------
    public void paint(Graphics page)
    {
	
	int houseX = 500;
	int houseY = 400;
	int houseW = 250;
	int houseH = 200;


	int leftTopWindowX = houseX + 50;
	int leftTopWindowY = houseY + 20;
	int leftTopWindowW = 50;
	int leftTopWindowH = 50;

	int rightTopWindowX = houseX + 150;
	int rightTopWindowY = houseY + 20;
	int rightTopWindowW = 50;
	int rightTopWindowH = 50;

	int lowerLeftWindowX = houseX + 20;
	int lowerLeftWindowY = houseY + 130;
	int lowerLeftWindowW = 70;
	int lowerLeftWindowH = 50;

	int lowerRightWindowX = houseX + 160;
	int lowerRightWindowY = houseY + 130;
	int lowerRightWindowW = 70;
	int lowerRightWindowH = 50;
	
	int doorX = houseX + 105;
	int doorY = houseY + 140;
	int doorW = 40;
	int doorH = 60;

	int roofX = houseX - 5;
	int roofY = houseY - 5;
	int roofW = 260;
	int roofH = 5;



	page.setColor(new Color(135,206,255));     //color of the sky
	page.fillRect(0,0,1000,600);
	page.setColor(Color.yellow);               //color of the sun
	page.fillOval(270,100,200,200);
	
	page.setColor(new Color(255,48,48));       //color of the house
	page.fillRect(houseX,houseY,houseW,houseH);
	page.setColor(Color.black);
	page.setColor(Color.gray);	       //color of the roof of the house
	page.fillRect(roofX,roofY,roofW,roofH);
	page.setColor(Color.black);        //color of the upper windows
	page.fillRect(rightTopWindowX,rightTopWindowY,rightTopWindowW,rightTopWindowH);
	page.fillRect(leftTopWindowX,leftTopWindowY,leftTopWindowW,leftTopWindowH);
	page.setColor(new Color(238,197,145));   //color of the door
	page.fillRect(doorX,doorY,doorW,doorH);
	page.setColor(Color.black);        //color of the lower windows
	page.fillRect(lowerLeftWindowX,lowerLeftWindowY,lowerLeftWindowW,lowerLeftWindowH);
	page.fillRect(lowerRightWindowX,lowerRightWindowY,lowerRightWindowW,lowerRightWindowH);
	page.setColor(Color.green);
	page.fillRect(0,600,1000,200);
    }
}
