//*****************************
// CMPSC 111
// Practical 6
// October 29, 2014
//
// Purpose: a program that determines what activities happen
// during a specific year.
//*****************************

import java.util.Date;
import java.util.Scanner;
public class Practical6Main
{
    public static void main ( String[] args)
    {
        //Variable dictionary
        Scanner scan = new Scanner(System.in);
        int userInput;


        System.out.println("Please enter a year between 1000 and 3000!");
        userInput = scan.nextInt();

        YearChecker activities = new YearChecker(userInput);

        activities.isLeapYear(userInput);
        if (activities.isLeapYear(userInput) == true)
        { System.out.println(userInput + " is a leap year"); }
        else { System.out.println(userInput + " is not a leap year"); }


        activities.isCicadaYear(userInput);
         if (activities.isCicadaYear(userInput) == true)
        { System.out.println(userInput + " is a Cicada year"); }
        else { System.out.println(userInput + " is not a Cicada year"); }



        activities.isSunspotYear(userInput);
         if (activities.isSunspotYear(userInput) == true)
        { System.out.println(userInput + " is a Sunspot year"); }
        else { System.out.println(userInput + " is not a Sunspot year"); }





        System.out.println("Thank you for using this program.");
    }
}
