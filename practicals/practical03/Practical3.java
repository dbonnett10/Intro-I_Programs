
//*************************************
// Honor Code: The work I am submitting is a result of my own thinking and efforts.
// Dan Bonnett
//CMPSC 111 Fall 2014
// Practical 3
// Date: 09 18 2014
//
// Purpose: 
//*************************************
import java.util.Date; 
import java.util.Scanner;
public class Practical3
{
    //---------------------------
    //main method: program execution begins here
    //---------------------------
    public static void main(String[] args)
    {
       // Label output with name and date:
       System.out.println("Dan Bonnett\npractical 3\n" + new Date() + "\n");

       // Variable dictionary:
	Scanner scan = new Scanner(System.in);
	String noun1;
	String adjective1;
	int number1;
	String adjective2;
	int number2;
	String verb1;
	String noun2;
	double value;
	String noun3;


	System.out.println("Enter a plural noun: ");
	noun1 = scan.next();
	System.out.println("Enter an adjective: ");
	adjective1 = scan.next();
	System.out.println("Enter a number: ");
	number1 = scan.nextInt();
	System.out.println("Enter another adjective: ");
	adjective2 = scan.next();
	System.out.println("Enter another number: ");
	number2 = scan.nextInt();
	System.out.println("Enter a singular verb: ");
	verb1 = scan.next();
	System.out.println("Enter another plural noun: ");
	noun2 = scan.next();
	System.out.println("Enter a decimal value: ");
	value = scan.nextDouble();
	System.out.println("Enter a singular noun: ");
	noun3 = scan.next();
	System.out.println("If you have " + number1+" " + adjective1+" " + noun1+", ");
	System.out.println("and you have " + number2+" " + adjective2+" " + noun1+", ");
	System.out.println("then you need " + value+" " + noun2+" in order to"+" " + verb1+" a"+" " + noun3);
     }
}

