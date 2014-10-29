//****************************************
// Honor Code: The work I am submitting is a result of my own thinking and efforts.
// Dan Bonnett
// CMPSC 111 Fall 2014
// Lab 7
// Date: 10 28 2014
//
// Purpose: To gain more experience with writing Java classes and methods
//***************************************

import java.awt.*;

public class Lab7Drawing
{
    Color skyColor;
    Graphics page;

    public Lab7Drawing(Graphics pg, Color sc){
        page = pg;
        skyColor = sc;
        page.setColor(skyColor);
        page.fillRect(0,0,1000,600);    // draws the sky

        page.setColor(Color.green);
	    page.fillRect(0,600,1000,200);   // draws the grass

        page.setColor(Color.yellow);
	    page.fillOval(270,100,200,200);  // draws the sun

    }

    public void drawHouse(int houseX, int houseY, int houseW, int houseH){
        page.setColor(new Color(255,48,48));       //color of the house
        page.fillRect(houseX,houseY,houseW,houseH);
    }

    public void drawLeftTopWindow(int leftTopWindowX, int leftTopWindowY, int leftTopWindowW, int leftTopWindowH){
        	page.fillRect(leftTopWindowX,leftTopWindowY,leftTopWindowW,leftTopWindowH);
            page.setColor(Color.black);
    }

    public void drawRightTopWindow(int rightTopWindowX, int rightTopWindowY, int rightTopWindowW, int rightTopWindowH){
        	page.fillRect(rightTopWindowX,rightTopWindowY,rightTopWindowW,rightTopWindowH);
            page.setColor(Color.black);        //color of the upper windows
    }

    public void drawLowerLeftWindow(int lowerLeftWindowX, int lowerLeftWindowY, int lowerLeftWindowW, int lowerLeftWindowH){
        page.fillRect(lowerLeftWindowX,lowerLeftWindowY,lowerLeftWindowW,lowerLeftWindowH);
        page.setColor(Color.black);
    }

    public void drawLowerRightWindow(int lowerRightWindowX, int lowerRightWindowY, int lowerRightWindowW, int lowerRightWindowH){
        page.fillRect(lowerRightWindowX,lowerRightWindowY,lowerRightWindowW,lowerRightWindowH);
        page.setColor(Color.black);
    }


    public void drawRoof(int roofX, int roofY, int roofW, int roofH){
        page.setColor(Color.gray);       //color of the roof of the house
	    page.fillRect(roofX,roofY,roofW,roofH);
    }

    public void drawDoor(int doorX, int doorY, int doorW, int doorH){
        page.setColor(new Color(238,197,145));   //color of the door
	    page.fillRect(doorX,doorY,doorW,doorH);
    }

}




