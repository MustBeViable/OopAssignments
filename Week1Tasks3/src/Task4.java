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
        int num1;
        int num2;
        int product;
        boolean contin = true;
        while (contin) {
            num1 =  rand.nextInt(10);
            num2 =  rand.nextInt(10);
            product = num1 * num2;
            System.out.printf("What is %d * %d = ? : ", num1, num2);
            int answer = input.nextInt();
            if (answer == product) {
                System.out.println("Correct!");
            }
            else {
                System.out.println("Wrong!");
                System.out.printf("The correct answer is %d", answer);
            }
            System.out.println("Do you want to continue? (y/n)");
            char choice = input.next().charAt(0);
            if (choice == 'n') {
                contin = false;
            }
        }
    }
}
