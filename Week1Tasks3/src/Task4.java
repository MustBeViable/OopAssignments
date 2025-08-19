/*
 In primary school, students must memorize the multiplication tables for numbers 1 to 10. Create a program to assist
 primary school students that presents the user with ten randomly generated multiplication problems, where the factors
 are integers between one and ten. After each answer, the program indicates whether it was correct or not. The user
 receives one point for each correctly answered question. If the user scores ten points for the entire set of problems,
 the program congratulates them on mastering the multiplication tables and terminates. Otherwise, the program starts a
 new set of problems.
 */

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args ) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int userScore;
        do {
            userScore = testQuestions(input, rand);
            if (userScore >= 10) {
                System.out.println("Great job! You passed the hardest test in the world!");
            } else {
                System.out.println("You failed. Try again!");
            }
        } while (userScore < 10);
    }
    public static int testQuestions(Scanner input ,Random rand) {
        int num1;
        int num2;
        int product;
        int score = 0;
        for (int i = 0; i < 10; i++) {
            num1 =  rand.nextInt(10) + 1;
            num2 =  rand.nextInt(10) + 1;
            product = num1 * num2;
            System.out.printf("%d. What is %d * %d = ? : ", i+1, num1, num2);
            int answer = input.nextInt();
            if (answer == product) {
                System.out.println("Correct!");
                score += 1;
            }
            else {
                System.out.println("Wrong!");
                System.out.printf("The correct answer is %d\n", answer);
            }
        } return score;
    }
}
