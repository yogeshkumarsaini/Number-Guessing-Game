# Number-Guessing-Game

A simple command-line Number Guessing Game written in Java. The program picks a random number within a configurable range (default 1–100) and prompts the player to guess until they find the correct number. The game gives feedback for each guess (too low / too high) and reports the number of attempts when the player wins.

## Features

- Picks a random integer between a configurable minimum and maximum (default 1–100).
- Accepts integer guesses from the user.
- Validates guesses and informs the user if they're out of range.
- Gives hints: "Too low" or "Too high".
- Counts and displays the number of attempts.

## Prerequisites

- Java Development Kit (JDK) 8 or newer installed.
- Terminal / Command Prompt access.

Verify Java is installed:

```bash
java -version
javac -version
```

## How to run

1. Save the game to a file named `GuessTheNumber.java` (the code you provided).
2. Open a terminal in the directory containing `GuessTheNumber.java`.
3. Compile:

```bash
javac GuessTheNumber.java
```

4. Run:

```bash
java GuessTheNumber
```

Alternatively, use an IDE (IntelliJ IDEA, Eclipse, VS Code with Java extension) to import and run the class.

## Gameplay

- The program prints a welcome message and the range of the secret number.
- Enter integer guesses when prompted.
- If you enter a non-integer, the program will report invalid input and prompt again.
- If your guess is outside the allowed range, you'll be reminded of the valid bounds.
- When you guess the correct number, the program congratulates you and shows how many attempts it took.

Example session:

```
Welcome to the Number Guessing Game!
I have picked a number between 1 and 100.
Try to guess it!
Enter your guess: 50
Too high! Try a lower number.
Enter your guess: 25
Too low! Try a higher number.
Enter your guess: 37
Congratulations! You guessed the number 37 correctly.
It took you 3 attempts.
```

## Code overview

The main program flow in `GuessTheNumber.java`:

- Uses `Random` to generate the secret number within `minRange` and `maxRange`.
- Uses `Scanner` to read user input from the console.
- Validates that the input is an integer using `scanner.hasNextInt()`.
- Keeps track of attempts and uses a loop until the correct guess is made.
- Closes the `Scanner` at the end to free resources.

Key variables:
- `minRange`, `maxRange` — define the inclusive bounds for the secret number.
- `numberToGuess` — the randomly chosen secret number.
- `userGuess` — the player's current guess.
- `attempts` — number of guesses made.
- `hasGuessedCorrectly` — loop control boolean.

## Customization ideas

- Add difficulty levels that change the range (Easy 1–20, Medium 1–100, Hard 1–1000).
- Implement a maximum attempts limit and reveal the number if attempts run out.
- Keep a high-score list (fewest attempts) persisted to a file.
- Add a graphical UI (Swing/JavaFX) or convert to a web-based version.
- Allow replaying without restarting the program.

## Contributing

Contributions, bug reports, and improvements are welcome. To contribute:

1. Fork the repository.
2. Create a branch for your feature/fix.
3. Submit a pull request with a clear description of changes.

If you'd like, I can help generate issues or PR templates, or add tests.

## License

This project is provided as-is. Add a license file (e.g., MIT) if you want to specify terms.

Enjoy the game — happy guessing!
