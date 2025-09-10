import java.util.Scanner;

public class CorrectInt {
    static private int num;
    static private boolean correctInt;

   public static void correctInt (Scanner input) {
        try {
            num = input.nextInt();
            correctInt = true;
        } catch (Exception e) {
            System.out.println("Not correct number please try again: ");

            //Jos tätä ei tee, input saattaa jäädä eikä koskaan "kuluteta" pois
            if (input.hasNext()) {
                input.nextLine();
            }
            correctInt = false;
        }
    }

    public static int getCorrectInt() {
       return num;
    }

    public static boolean isCorrectInt() {
        return correctInt;
    }
}
