package singleton.game;

import java.util.Scanner;

public class GuessGame {

    private static GuessGame instance = new GuessGame();
    private int score = 0;
    Scanner scanner = new Scanner(System.in);

    private GuessGame() {}

    public static GuessGame getInstance() {
        return instance;
    }

    //Protection against serialization issue
    protected Object readResolve() {
        return getInstance();
    }

    public int getScore() {
        return score;
    }

    public void play() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Guess a number between 0-9: ");
            int guessedNumber = scanner.nextInt();
            int randomNumber = (int) (Math.random() * 9);
            System.out.println("The drawn number is: " + randomNumber);

            if (randomNumber == guessedNumber) {
                score++;
                System.out.println("You guessed!");
            } else {
                System.out.println("Try again.");
            }

            System.out.println("Your score is: " + score);
        }
    }
}
