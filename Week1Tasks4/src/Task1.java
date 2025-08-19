/*
 Write a program that generates random names by combining first and last names from hard-coded name arrays. The program
 should work as follows:

 Create two arrays, firstNames and lastNames, which contain first and last names.

 Ask the user how many random names the program should generate.

 Generate random names using the following logic:

 Choose the index value for the first name randomly.
 Choose the index value for the last name randomly.
 Use the index values to create a random full name (i.e. first name and last name).
 Print the generated full name.
 Repeat these steps as many times as the user-specified number of names to generate.
 */

import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        String[] firstNames = {"Elias", "Juho", "Leevi", "Sakari", "Aleksi"};
        String[] lastNames = {"Rinne", "Hill", "Best", "Kuningas", "Rinne-Rinne"};
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Give me a number of names to be generated: ");
        int userInput = input.nextInt();
        System.out.println("Random names are:");
        for (int i = 0; i < userInput; i++) {
            int firstIndex = rand.nextInt(4);
            int lastIndex = rand.nextInt(4);
            System.out.printf("   %d. %s %s\n", i+1, firstNames[firstIndex], lastNames[lastIndex]);
        }
    }
}
