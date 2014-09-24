
//*************************************
// Honor Code: The work I am submitting is a result of my own thinking and efforts.
// Dan Bonnett
//CMPSC 111 Fall 2014
// Lab #3
// Date: 09 18 2014
//
// Purpose: 
//*************************************
import java.util.Date;
import java.util.Scanner; 
public class Lab3
{
    //---------------------------
    //main method: program execution begins here
    //---------------------------
    public static void main(String[] args)
    {
       // Label output with name and date:
       System.out.println("Dan Bonnett\nLab 3\n" + new Date() + "\n");

       // Variable dictionary:
	Scanner scan = new Scanner(System.in);
	String name1;
	String welcome; 
	double bill;	        //The amount of the bill in dollars
	double percentage;	//The percentage of the bill that the user would like to tip in dollars
	double tip;	        //The amount of the tip in dollars
	double totalBill;       //The amount of the bill plus the amount of the tip in dollars
	int people;             //The number of people that will be splitting the bill
	double eachPerson;      //The amount that each person should pay in dollars

	System.out.println("Enter your name: ");
	name1 = scan.nextLine();
	System.out.println("Welcome to the Tip Calculator,"+" "+name1+"."+ "\n" + "Please enter the amount of your bill");
	bill = scan.nextDouble();
	System.out.println("Please enter the percentage that you want to tip as a decimal between number between 0 and 1: ");
	percentage = scan.nextDouble();
	tip = percentage * bill;
	System.out.println("Your original bill was: $" + bill);
	System.out.println("Your tip amount is: $" + tip);
	totalBill = bill + tip;
	System.out.println("Your total bill is: $" + totalBill);
	System.out.println("How many people will be splitting the bill?: ");
	people = scan.nextInt();
	eachPerson = totalBill/people;
	System.out.println("Each person should pay: $" + eachPerson);
	System.out.println("Have a fantastic day! Thank you for using the tip calculator created by Dan the Man. ");
 
     }
}

