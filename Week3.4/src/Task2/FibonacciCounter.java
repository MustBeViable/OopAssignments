package Task2;

import java.io.*;

public class FibonacciCounter {
    static long lastNumber = 0;
    static long currNumber = 1;
    private final static String FILENAME = "fibonacci.cvs";

    public long counter () {
        long nextNumber = lastNumber + currNumber;
        lastNumber = currNumber;
        currNumber = nextNumber;
        return currNumber;
    }

    public static void main(String[] args) {
        FibonacciCounter fib = new FibonacciCounter();
        StringBuilder cvsString = new StringBuilder();
        File file = new File(FILENAME);

        int counter = 60;
        for (int i = 0; i < counter; i++) {
            cvsString.append(fib.counter()).append(";");
        }
        try (FileWriter writer = new FileWriter(FILENAME);
             ) {
            writer.write(cvsString.toString());

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
