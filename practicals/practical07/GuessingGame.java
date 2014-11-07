//***********************************
// Honor Code: The work I am submitting is a result of my own thinking and efforts
// Dan Bonnett
// CMPSC111 Fall 2014
// Practical 7
//
// Purpose: Practice implementing "while" loops and "if/else" statements
// **********************************

import java.util.Scanner;
import java.util.Random;

public class GuessingGame
{
    Random r = new Random();
    Scanner scan = new Scanner(System.in);

    int guess;
    int actual;
    int numTries;

    public GuessingGame()
    {
        guess = 0;
        actual = r.nextInt(100)+1;
        System.out.println("The actual value is: " + actual);
        numTries = 0;
    }

    public void GetCheckGuess()
    {
        System.out.println("Enter a number between 1 and 100");
        guess = scan.nextInt();
        numTries++;
        while (guess != actual)

        {
            numTries++;
            if (guess < actual)
            {
                System.out.println("Too low!!!!");
            }

            else if (guess > actual)
            {
                System.out.println("Too high!!!!");
            }
            System.out.println("Enter a number between 1 and 100");
            guess = scan.nextInt();
        }

        System.out.println("You guessed correctly in " + numTries + " tries");
    }
}




