//*****************************
// CMPSC 111
// Practical 6
// October 29, 2014
//
// Purpose: determine if user's year input is a leap year,
// cicada brood II emergence year, or a peak sunspot year.
//*****************************

import java.util.Scanner;

public class YearChecker
{
    //Create instance variables
    int year;


    //Create a constructor
    public YearChecker(int y)
    {
        year = y;

    }

    // a method that checks if the user's input year is a leap year
    public boolean isLeapYear(int y)
    {
        if (y%100==0 && y%400==0)
        {
            return true;
        }
        if (y%4==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // a method that checks if the user's input year is a cicada year
    public boolean isCicadaYear(int y)
    {
        if ((y-2013)%17==0)
        {
            return true;
        }
        if ((2013-y)%17==0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    // a method that check if the user's input year is a sunspot year
    public boolean isSunspotYear(int y)
    {
        if ((y-2013)%11==0)
        {
            return true;
        }
        if ((2013-y)%11==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
