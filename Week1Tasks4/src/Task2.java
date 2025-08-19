/*
 Write a program that takes an array of integers as input from the user and finds the subarray with the maximum sum. A
 subarray is a portion of an array, which consists of contiguous elements from the original array in the same order. The
 program should work as follows:

 Ask the user for the number of integers in the array.
 Prompt the user to enter the integers into the array.
 Find the subarray with the maximum sum using the following logic:
 Iterate through all possible subarrays in the array.
 Calculate the sum of each subarray.
 Keep track of the maximum sum found and the corresponding subarray indices.
 Print the maximum sum and the corresponding indices. (Use the indices shown to the user, i.e., starting from 1.)
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxSum = Integer.MIN_VALUE;
        int currentSum;
        int length;
        int[] numbers = {};
        String index = "";
        do {
            System.out.print("Give length of the array: ");
            length = input.nextInt();
            if (length > 0) {
                numbers = listMaker(length, input);
            } else {
                System.out.println("Give a positive integer");
            }
        } while (length <= 0);

        for (int i = 0; i < numbers.length; i++) {
            currentSum = 0;
            for (int j = i; j < numbers.length; j++) {
                currentSum += numbers[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    index = (i+1) + " - " + (j+1);
                }
            }
        }
        System.out.printf("\nBiggerestest number is: %d\n", maxSum);
        System.out.printf("Number was found %s", index);
    }
    public static int[] listMaker(int length, Scanner input) {
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Give the %d. number: ", i+1);
            numbers[i] = input.nextInt();
        }
        return numbers;
    }
}