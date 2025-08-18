import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

            /*After user declaration for numbers program calculates sum, product and average,
              and rounds up correctly using double and wrong by using float
             */

        int sum = first + second + third;
        int product = first * second * third;

        //Correctly rounds by using double

        double average = ((first + second + third) / 3.0);

        //Wrongly rounds up too much in the bit conversion phase.

        float averageFloat = (float) ((first + second + third) / 3.0);

        System.out.println("The sum of the numbers is " + (sum));
        System.out.println("The product of the numbers is " + (product));
        System.out.println("The average of the numbers using double is " + (average));
        System.out.println("Somehow float rounds up too early by converting to bits and answer is different");
        System.out.println("The average of the numbers using float is " + (averageFloat));
    }

}
