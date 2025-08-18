/*
 Write a program that prompts the user to enter two positive integers, start and end (where start < end). The program
 should generate and display all the prime numbers between start and end, inclusive.

 A prime number is a positive integer greater than 1 that has no positive divisors other than 1 and itself.

 Your program should use control structures (such as loops and conditional statements) to implement the logic for
 generating and checking prime numbers.
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give 2 positive integers starting with lower value. start.: ");
        int firstNumber = Integer.parseInt(input.nextLine());
        System.out.print("end.: ");
        int secondNumber = Integer.parseInt(input.nextLine());

        if (firstNumber <= 0 || secondNumber <= 0) {
            System.out.print("Invalid input");
            return;
        }
        else if (secondNumber <= firstNumber) {
            System.out.println("Invalid input");
            return;
        }

            int difference = secondNumber - firstNumber;

            boolean divisible;

            for (int i = 0; i <= difference; i++) {
                divisible = false;
                int iterableNumber = i + firstNumber;
                if (iterableNumber == 1) {
                    divisible = true;
                }
                for (int j = 2; j < iterableNumber; j++) {
                    if (iterableNumber % j == 0) {
                        divisible = true;
                        break;
                    }
                }
                if (!divisible) {
                    System.out.print(iterableNumber + ", ");
                }
            }
        }
    }
