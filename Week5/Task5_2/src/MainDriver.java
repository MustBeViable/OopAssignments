import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainDriver {


    public static ArrayList<Integer> numberListMaker (int numberCount) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < numberCount; i++) {
            numbers.add(random.nextInt(Integer.MAX_VALUE));
        }
        return numbers;
    }


    public static void main(String[] args) {
        final int nanoToMillisConvertor = 1_000_000;
        ArrayList<NumberCalculator> threads= new ArrayList<>();
        int processors = Runtime.getRuntime().availableProcessors();
        Scanner input = new Scanner(System.in);
        System.out.println("Currently treads available to make: " + processors);
        System.out.println("Give a integer how many numbers do you want to generate: ");
        int num = 0;
        do {
            CorrectInt.correctInt(input);
            if (CorrectInt.isCorrectInt()) {
                num = CorrectInt.getCorrectInt();
            }
        } while (!CorrectInt.isCorrectInt());

        long startTime = System.nanoTime();

        ArrayList<Integer> nums = numberListMaker(num);

        NumberCalculator.setNumbers(nums);

        System.out.println("Size of number list: " + nums.size());



        int startIndex = 0;
        if (nums.size()%processors!=0) {
            for (int i = 0; i < (processors-1); i++) {
                threads.add(new NumberCalculator(startIndex, (startIndex +(nums.size()/processors))));
                startIndex += nums.size()/processors;
            }
            threads.add(new NumberCalculator(startIndex, (nums.size())-1));
        } else {
            for (int i = 0; i < processors; i++) {
                threads.add(new NumberCalculator(startIndex, (startIndex + (nums.size()/processors))));
                startIndex += nums.size()/processors;
            }
        }

        for (NumberCalculator t : threads) {
            t.start();
        }

        for (NumberCalculator t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }

        long endSum = 0;

        for (NumberCalculator t : threads) {
            endSum += t.getSum();
        }

        long endTime = System.nanoTime();

        long totalTime = ((endTime - startTime)/nanoToMillisConvertor);


        System.out.println("The sum of given amount of randomized integers is: " + endSum);
        if (totalTime > 1000) {
            int totalTimeSec = (int) (totalTime/1000);
            int totalTimeMillis = (int) Math.abs((1000*(totalTime/1000))-totalTime);
            System.out.printf("Operation lasted %d s and %d ms", totalTimeSec, totalTimeMillis);
        } else {
            System.out.println("Operation lasted: " + totalTime + " ms");
        }

    }

}
