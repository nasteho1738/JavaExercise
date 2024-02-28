package com.test;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println("Ali");
    }
}
    public class LeapYear {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a year: ");
                int year = scanner.nextInt();
                if (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);
                    System.out.println(year +"is a leap year.");
                } else
                System.out.println(year + "is not a leap year.");

            }
        }
}
        public class BasicArithmetic {
    public static viod main(String[] args) {
        int num1 = 45, num2 = 11;
        System.out.println(num1 + " + " + num2 + " = " +(num1 + num2 ));
        System.out.println(num1 + " * " + num2 + " = " +(num1 * num2 ));
        System.out.println(num1 + " / " + num2 + " = " +(num1 / num2 ));
        System.out.println(num1 + " - " + num2 + " = " +(num1 - num2 ));
    }
}
public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        int num1 = 23, num2 = 11, num3 = 77;
        double avarage = (num1 + num2 + num3) / 3.0;
        System.out.println("(" + num1 + " + "  + num2 + " + " + num3 + ") / 3 = + avarage);
    }
}

import java.util.Scanner;

public class DynamicGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in):
        System,out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}

import java.util.Scanner;
public class UserInputArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println(num1 + " + " + num2 + " = " +(num1 + num2 ));
        System.out.println(num1 + " * " + num2 + " = " +(num1 * num2 ));
        System.out.println(num1 + " / " + num2 + " = " +(num1 / num2 ));
        System.out.println(num1 + " - " + num2 + " = " +(num1 - num2 ));
    }
}
public class TimeConversation {
    public static void main(String[] args) {
        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minutes = (totalseconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.printf("%02d:%02d", hours, minutes,seconds);
    }
}
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random,nextInt(500) + 1;
        Scanner scanner = new Scanner(System.in);
        int guesses = 0;
        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner,nextint();
            guesses++;
            If (guess == secretNumber) {
                System.out.println("Congratulation! you guessed the Number in " + guesses + " guesses.");
                break;
            }
                else if ( guess < secretNumber) {
                    System.out.println("Your guess was too small.");
                } else {
                    System.out.printIn("Your guess was too big.");
            }

        }
    }
}
