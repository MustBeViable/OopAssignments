/*
 Write a program that prompts the user to enter a binary number (composed of 0s and 1s) and converts it to decimal.
 Display the decimal equivalent on the console. Hint: use the charAt method of the String class to retrieve the
 individual bits in the input string.
 */
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give a binary number: ");
        String number = input.nextLine();
        int decimal = 0;
        for (int i = 0; i < number.length(); i++) {
            int power = number.length() - i - 1;

            //Correcting the right value for bit in the string. Without this '1' equals to 49 and '0' to 48.
            int bit = number.charAt(i) - '0';
            decimal += (int) (bit * Math.pow(2, power));
        }
        System.out.printf("The decimal for given binary number is %d", decimal);
    }
}
