import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxAttempts = 5;
        int attemptCount = 0;
        int range = 100; // Set the range from 1 to 100
        int randomNumber = random.nextInt(range) + 1;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and " + range + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess the correct number.");

        boolean hasWon = false;

        while (attemptCount < maxAttempts) {
            System.out.print("\nEnter your guess: ");
            int userGuess = scanner.nextInt();
            attemptCount++;

            if (userGuess == randomNumber) {
                hasWon = true;
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try a higher number.");
            } else {
                System.out.println("Too high! Try a lower number.");
            }
            System.out.println("Attempts remaining: " + (maxAttempts - attemptCount));
        }

        if (hasWon) {
            System.out.println("\nCongratulations! You guessed the correct number in " + attemptCount + " attempts.");
        } else {
            System.out.println("\nSorry, you've used all attempts. The correct number was: " + randomNumber);
        }

        scanner.close();
    }
}
