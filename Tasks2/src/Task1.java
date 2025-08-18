import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give temperature as Fahrenheit:");
        int fahrenheitDegree = Integer.parseInt(scanner.nextLine());

        //convert Fahrenheit to Celsius

        double celsius =  (fahrenheitDegree - 32) / (9.0/5.0);
        System.out.println("Degrees converted to Celsius: " + celsius);
    }
}