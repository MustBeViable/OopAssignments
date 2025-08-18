import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner weightInGrams = new Scanner(System.in);

        System.out.print("Give the wight in grams (g): ");
        int weight = Integer.parseInt(weightInGrams.nextLine());

        //multiplier/divider values

        double leiviskaMultiplier = 20.0;
        double naulaMultiplier = 32.0;
        double luotiMultiplier = 13.28;

        //Converting first to leiviska

        double leiviska = (weight/(leiviskaMultiplier * naulaMultiplier * luotiMultiplier));

        //Taking full leiviskas out from the equation

        int leiviskaInteger = (int)leiviska;

        //further conversion values

        double naula = (leiviska - leiviskaInteger) * (leiviskaMultiplier);

        int naulaInteger = (int)naula;

        double luoti = (naula - naulaInteger) * (naulaMultiplier);

        //printing result with correct refactoring
        System.out.printf("Given weight %d g is %d leiviskä, %d naula and %.2f luoti.", weight, leiviskaInteger, naulaInteger, luoti);

    }
}