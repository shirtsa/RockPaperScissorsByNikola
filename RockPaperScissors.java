package MoreExerciseDataTypesAndVariables;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");

        String playerMove = scanner.nextLine();

        switch (playerMove) {
            case "r", "rock" -> playerMove = ROCK;
            case "p", "paper" -> playerMove = PAPER;
            case "s", "scissors" -> playerMove = SCISSORS;
            default -> {
                System.out.println("Invalid Input. Try Again...");
                return;
            }
        }

        Random randomPick = new Random();
        int computerRandomNumber = randomPick.nextInt(3);
        String computerMove = switch (computerRandomNumber) {
            case 0 -> ROCK;
            case 1 -> PAPER;
            case 2 -> SCISSORS;
            default -> "";
        };
        System.out.printf("The computer chose %s.%n", computerMove);

        if ((playerMove.equals(ROCK) && computerMove.equals(SCISSORS)) ||
                (playerMove.equals(PAPER) && computerMove.equals(ROCK)) ||
                (playerMove.equals(SCISSORS) && computerMove.equals(PAPER))) {
            System.out.println("You win.");
        } else if ((playerMove.equals(ROCK) && computerMove.equals(PAPER)) ||
                (playerMove.equals(PAPER) && computerMove.equals(SCISSORS)) ||
                (playerMove.equals(SCISSORS) && computerMove.equals(ROCK))) {
            System.out.println("You lose.");
        } else {
            System.out.println("This game was a draw.");
        }
    }

    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";
}
