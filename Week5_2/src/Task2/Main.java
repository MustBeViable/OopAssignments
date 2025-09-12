package Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ThreadClass> threads = new ArrayList<>();
        int processors = Runtime.getRuntime().availableProcessors();
        for (int i=0; i<processors;i++) {
            threads.add(new ThreadClass());
        }

        for (ThreadClass t : threads) {
            t.start();
        }
    }
}
