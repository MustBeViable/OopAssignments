import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Creating scanner instance
        Scanner scanner = new Scanner(System.in);

        //Asking user values for the triangle
        System.out.print("Give the length of the triangle: ");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.print("Give the height of the triangle: ");
        double height = Double.parseDouble(scanner.nextLine());
        //Calculating area of the given triangle
        double area = (length * height) / 2.0;

        System.out.println("Given triangle area is: " + area);
    }
}
