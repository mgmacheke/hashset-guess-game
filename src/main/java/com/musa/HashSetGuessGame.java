package com.musa;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class HashSetGuessGame {
    public static void main(String[] args) {
        HashSet<Integer> generateNumbers = new HashSet<>();
        HashSet<Integer> playerGuess = new HashSet<>();
        Random rand = new Random();
        int attempts = 7;
        Scanner scanner = new Scanner(System.in);

        while (generateNumbers.size() < 5){
            generateNumbers.add(rand.nextInt(20) + 1);
        }
        System.out.println("Welcome to the HashSet Guess Game!");

        while (attempts > 0 && playerGuess.size() < 5) {
            System.out.println("Please enter a number between 1 and 20: ");
            int guess = scanner.nextInt();

            if (playerGuess.contains(guess)) {
                System.out.println("You've already guessed the number " + guess);
                continue;
            }

            if (generateNumbers.contains(guess)) {
                System.out.println("Correct guess");
                playerGuess.add(guess);
            }else {
                System.out.println("Incorrect guess");
            }
            attempts--;
            System.out.println("number of attempts: " + attempts);
        }
        System.out.println("Game over!");
        System.out.println("GeneratedNumbers: " + generateNumbers);
        System.out.println("PlayerGuess: " + playerGuess);

        if (playerGuess.equals(generateNumbers)) {
            System.out.println("Congratulations! You won!");
        }else {
            System.out.println("Better luck next time!");
        }
        scanner.close();
    }
}
