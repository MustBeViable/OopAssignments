/*
 Write a program that takes an array of integers as input from the user and removes all the duplicate numbers from it.
 The program should work as follows:

 Ask the user for the size of the array.
 Prompt the user to enter the integers into the array.
 Remove all the duplicate numbers from the array using the following logic:
 Create a new array that stores only one occurrence of each number.
 Keep only the first occurrence of each number and discard any subsequent occurrences.
 Print the resulting array without the duplicate numbers.
 In this assignment, you can make the new array as big as the original array, even though it may not be completely
 filled.

 tee 2 listaa jossa sama pituus ja käyt vaa uniikit läpi, jollai arvolla mitä lisää i++ ja köyt vaa sen pituudeltaa.
 lista täyttää ite ittensä aina 0 (int kohalla ainaki).
 */
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give length of the list: ");
        int length = input.nextInt();
        int[] userList = new int[length];
        int[] uniqueNumbers = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.printf("Give %d. number: ", i+1);
            userList[i] = input.nextInt();
        }
        boolean isUnique;
        int currIndex = 0;
        for (int i = 0; i < length; i++) {
            isUnique = true;
            for (int j = 0; j < uniqueNumbers.length; j++) {
                if (userList[i] == uniqueNumbers[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueNumbers[currIndex] = userList[i];
                currIndex++;
            }
        }

        if (currIndex > 0) {
            System.out.println("\nThe array without duplicates:");
            for (int i = 0; i < currIndex; i++) {
                System.out.printf("%d ", uniqueNumbers[i]);
            }
        }

    }
}
