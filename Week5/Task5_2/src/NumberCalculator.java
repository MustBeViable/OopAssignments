import java.util.ArrayList;

public class NumberCalculator extends Thread{
    private static ArrayList<Integer> numbers;
    private final int START_INDEX;
    private final int END_INDEX;
    private long sum;

    public NumberCalculator (int startIndex, int END_INDEX) {
        this.START_INDEX = startIndex;
        this.END_INDEX = END_INDEX;
    }

    public static void setNumbers(ArrayList<Integer> list) {
        if (!list.isEmpty()) {
            numbers = list;
        }
    }

    @Override
    public void run() {
        for (int i = 0; (i + this.START_INDEX)< (this.END_INDEX); i++) {
            this.sum += numbers.get((i+this.START_INDEX));
        }
    }

    public long getSum () {
        return this.sum;
    }
}
