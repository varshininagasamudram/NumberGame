package game;

import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int randomNumber = 91;
        int guess;
        int attempts = 5;

        System.out.println("Welcome to the Number Game!");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("You have only 5 chances!");

        while (attempts > 0) {

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100");
                continue;
            }

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed correctly!");
                break;
            }
            else if (guess > randomNumber) {
                System.out.println("Too high!");
            }
            else {
                System.out.println("Too low!");
            }

            attempts--;

            System.out.println("Remaining chances: " + attempts);
        }

        if (attempts == 0) {
            System.out.println("Game Over!");
            System.out.println("The correct number was: " + randomNumber);
        }

        scanner.close();
    }
}