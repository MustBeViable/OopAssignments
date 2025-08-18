/*
 Write a program that prompts the user to enter the coefficients of a quadratic equation (ax^2 + bx + c = 0) and
 calculates its roots using the quadratic formula. Display the roots on the console. If the equation has no real roots,
 display the message "No real roots".
 */
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Please enter the coefficients of the quadric equation.\na: ");
        double aVariant = Double.parseDouble(userInput.nextLine());
        System.out.print("b: ");
        double bVariant = Double.parseDouble(userInput.nextLine());
        System.out.print("c: ");
        double cVariant = Double.parseDouble(userInput.nextLine());

        if (aVariant == 0) {
            System.out.println("No real roots");
        }

        else {
            double discriminant = Math.pow(bVariant, 2) - 4 * aVariant*cVariant;
            System.out.println("The discriminant is: " + discriminant);
            if (discriminant < 0) {
                System.out.println("No real root");
            }
            else {
                double plus = (-1* bVariant + Math.sqrt(discriminant)) / (2 * aVariant);
                double minus = (-1* bVariant - Math.sqrt(discriminant)) / (2 * aVariant);
                System.out.printf("Roots are: %.2f and %.2f", plus, minus);
            }
        }

    }
}
