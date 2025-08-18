import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner weightInGrams = new Scanner(System.in);

        System.out.print("Give the wight in grams (g): ");
        int weight = Integer.parseInt(weightInGrams.nextLine());

        //multiplier/divider values

        final double LEIVISKÄ_MULTIPLIER = 20.0;
        final double NAULA_MULTIPLIER = 32.0;
        final double LUOTI_MULTIPLIER = 13.28;

        //Converting first to leiviska

        double leiviska = (weight/(LEIVISKÄ_MULTIPLIER * NAULA_MULTIPLIER * LUOTI_MULTIPLIER));

        //Taking full leiviskas out from the equation

        int leiviskaInteger = (int)leiviska;

        //further conversion values

        double naula = (leiviska - leiviskaInteger) * (LEIVISKÄ_MULTIPLIER);

        int naulaInteger = (int)naula;

        double luoti = (naula - naulaInteger) * (NAULA_MULTIPLIER);

        //printing result with correct refactoring
        System.out.printf("Given weight %d g is %d leiviskä, %d naula and %.2f luoti.", weight, leiviskaInteger, naulaInteger, luoti);

    }
}