import java.util.Random;
import java.util.Scanner;

public class numbergame {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        boolean playAgain = true;
        while (playAgain) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;

            System.out.println("I've selected a number between " + minRange + " and " + maxRange + ". Try to guess it!");

            for (attempts = 1; attempts <= maxAttempts; attempts++) 
            {
                System.out.print("Attempt #" + attempts + ": Enter your guess: ");
                int userGuess = sc.nextInt();

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score++;
                    break;
                } 
                else if (userGuess < targetNumber) 
                {
                    System.out.println("Your guess is too low. Try again.");
                } 
                else 
                {
                    System.out.println("Your guess is too high. Try again.");
                }
            }

            if (attempts > maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + targetNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainChoice = sc.next().toLowerCase();
            playAgain = playAgainChoice.equals("yes");
        }

        System.out.println("Thanks for playing! Your score: " + score + " rounds won.");
        sc.close();
    }
}
