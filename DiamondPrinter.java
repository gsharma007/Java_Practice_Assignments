
//Programmer: Gaurav Sharma CSC110AB Module-4 Assignment
//Date: October 10,2018.
//Description: The program is to continue printing diamond shapes according to two user inputs (Character and Middle line length) until the user wants to stop.  
//Input: Length of the middle line and the character used for printing the diamond
//Data type used: a) int: for length of middle line b) char: for declaring character
//Output: diamond shape on the basis of mentioned inputs

import java.util.Scanner;

class DiamondPrinter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the diamond printing program!");
        char repeat = 'Y';
        // int userInput;

        do {
            System.out.print("With What character do you want to draw:");
            char userAnswer = keyboard.next().charAt(0);
            System.out.print("What will be the length of the middle line:");
            int userInput = keyboard.nextInt();
            System.out.println("Your diamond :");
            if (userInput % 2 == 0 || userInput < 0) {
                System.out.println("INVALID INPUT: Integer must be odd and positive");
            } else {
                for (int i = 1; i < userInput; i += 2) // This is the number of iterations needed to print the to
                                                       // diamond

                {
                    for (int j = 0; j < userInput - 1 - i / 2; j++) {
                        System.out.print(" ");// write a space
                    }
                    for (int j = 0; j < i; j++) {
                        System.out.print(userAnswer);// write an asterix
                    }

                    System.out.println("");
                }

                // Same logic apply here but backward as it is bottom of diamond
                for (int i = userInput; i > 0; i -= 2) {
                    for (int j = 0; j < userInput - 1 - i / 2; j++) {
                        System.out.print(" ");
                    }

                    for (int j = 0; j < i; j++) {
                        System.out.print(userAnswer);
                    }

                    System.out.print("\n");
                }
            }
            System.out.println("Do you want to display another diamond?");
            if (keyboard.next().charAt(0) == 'N') {
                System.out.println("Program Terminating.");
                repeat = 'N';
            }

        } while (repeat == 'Y');
    }
}