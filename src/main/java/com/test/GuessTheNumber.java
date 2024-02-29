package com.test;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt (500) + 1;
        Scanner scanner = new Scanner(System.in);
        int guesses = 0;
        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            guesses++;
            if(guess == secretNumber) {
                System.out.println("Congratulation! you guessed the Number in " + guesses + " guesses.");
                break;
            }
                else if (guess < secretNumber) {
                System.out.println("Your guess was too small.");
            } else {
                System.out.println("Your guess was too big.");
            }
        }
    }


}