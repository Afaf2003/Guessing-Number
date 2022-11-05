package Oasis_Internship;

import java.util.Scanner;

public class NumberGuessing {

    public static void guessingNumberGame() {

        Scanner sc = new Scanner(System.in);
        
        // Here we generating the random or guess number ranging from 1 to 100.
        int number = 1 + (int) (100 * Math.random());
        
        int ch = 5;//here we are defining the number of trials
        
        int i, guess, count = 0;
        System.out.println("A number is chosen between 1 to 100. sGuess the number within 5 trials.");
        
        do {
            System.out.println("Guess the number:");
            guess = sc.nextInt(); // Taking input as Guessing Number
            if (number == guess) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            }
            else if (number > guess) {
                System.out.println("The number is greater than " + guess);
                count++;
            } 
            else if (number < guess) {
                System.out.println("The number is less than " + guess);
                count++;
            }
            
        }while (ch != count);

        if  (count == ch) {
            System.out.println( "You have exhausted 5 trials.");

            System.out.println("The number was " + number);
        }
    }

    public static void
            main(String arg[]) {
        guessingNumberGame();
    }
}
