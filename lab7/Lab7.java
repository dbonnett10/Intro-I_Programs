//****************************************************
// Honor Code: The work I am submitting is a result of my own thinking and efforts.
// Dan Bonnett
// CMPSC 111 Fall 2014
// Lab 7
// 10 28 2014

// Purpose: Create my own drawing.
//****************************************************
import java.awt.*;
import javax.swing.JApplet;

public class Lab7 extends JApplet
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

Lab7Drawing drawPicture = new Lab7Drawing(page, Color.blue);
drawPicture.drawHouse(houseX, houseY, houseW, houseH);
drawPicture.drawLeftTopWindow(leftTopWindowX, leftTopWindowY, leftTopWindowW, leftTopWindowH);
drawPicture.drawRightTopWindow(rightTopWindowX, rightTopWindowY, rightTopWindowW, rightTopWindowH);
drawPicture.drawLowerLeftWindow(lowerLeftWindowX, lowerLeftWindowY, lowerLeftWindowW, lowerRightWindowH);
drawPicture.drawLowerRightWindow(lowerRightWindowX, lowerRightWindowY, lowerRightWindowW, lowerRightWindowH);
drawPicture.drawDoor(doorX, doorY, doorW, doorH);
drawPicture.drawRoof(roofX, roofY, roofW, roofH);

  }
}
