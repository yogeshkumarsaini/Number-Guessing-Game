import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        // 1. Initialize variables and utilities
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        // Define the range for the random number (1 to 100)
        int minRange = 1;
        int maxRange = 100;
        int userGuess = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have picked a number between " + minRange + " and " + maxRange + ".");
        System.out.println("Try to guess it!");

        // 2. The main game loop
        while (playAgain) {
            int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            
                // Validate input
                if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                attempts++;

                // 3. Compare the guess to the number
                if (userGuess < minRange || userGuess > maxRange) {
                    System.out.println("Your guess is outside the valid range. Please guess between " + minRange + " and " + maxRange + ".");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try a higher number.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try a lower number.");
                } else {
                    hasGuessedCorrectly = true;
                    System.out.println("Congratulations! You guessed the number " + numberToGuess + " correctly.");
                    System.out.println("It took you " + attempts + " attempts.");
                    System.out.print("Do you want to play again? (yes/no): ");
                scanner.nextLine(); // consume newline
                String choice = scanner.nextLine();
                    if (!choice.equalsIgnoreCase("yes")) {
                   playAgain = false;
                    }
                }
                } else {
                System.out.println("Invalid input. Please enter an integer number.");
                // Consume the invalid input to prevent an infinite loop
                scanner.next(); 
            }
        }
    }
        // 4. Close the scanner resource
        scanner.close();
    }
}