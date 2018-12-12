//Programmer: Gaurav Sharma CSC110AB Module-4 Assignment
//Date: October 10,2018.
//Description: The program is to test the application for a simple number guessing game that allows the user to guess a number between 1 and 100
//Input: A guessed number between 1 and 100
//Data type used: int: for all the guessed number inputs
//Output: Number of valid guesses and out of ranges guesses, taken to correctly guess the number 

import java.util.Random;
import java.util.Scanner;

public class HighLoGame {

    public static void main(String[] args) {

        // Generating random number
        // Using Scanner for getting input from user

        Random randomNumber = new Random();
        Scanner keyboard = new Scanner(System.in);

        // Using the random generator to pick a number between 1 and 100

        int number = randomNumber.nextInt(100);
        int guess = 0;
        int lastLow = 0;
        int lastHigh = 100;
        int outOfBoundGuess = 0;
        int wrongGuess = 0;

        // Prompting the user to enter their next guess
        System.out.print("Enter a number between 1 and 100 >> ");

        // To Loop until the user has guessed the number

        while (guess != number) {

            // Reading the users guess

            guess = keyboard.nextInt();

            // Checking if the guess is high, low, correct or outofrange

            if (guess < lastLow || guess > lastHigh) {
                outOfBoundGuess++;
                System.out.println(guess + " is not between " + lastLow + " and " + lastHigh);
                System.out.print("Enter a number between " + lastLow + " and " + lastHigh + " >> ");
            } else if (guess < number) {

                // For Guess is too low
                lastLow = guess + 1;
                System.out.println(guess + " is too low ");
                System.out.print("Enter a number between " + lastLow + " and " + lastHigh + " >> ");
                wrongGuess++;

            } else if (guess > number) {

                // Guess is too high
                lastHigh = guess - 1;
                System.out.println(guess + " is too high ");
                System.out.print("Enter a number between " + lastLow + " and " + lastHigh + " >> ");
                wrongGuess++;
            } else {

                // Guess is correct

                System.out.println(number + " is correct ");
            }

        }
        System.out.println(" It took you " + wrongGuess + " valid guesses to find the number ");
        System.out.println(" You had " + outOfBoundGuess + " out of range guess ");

    }

}
