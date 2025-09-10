import java.util.ArrayList;

public class NumberCalculator extends Thread{
    private final ArrayList<Integer> numbers;
    private final int START_INDEX;
    private final int END_INDEX;
    private long sum;

    public NumberCalculator (ArrayList<Integer> numbers, int startIndex, int END_INDEX) {
        this.numbers = numbers;
        this.START_INDEX = startIndex;
        this.END_INDEX = END_INDEX;
    }

    @Override
    public void run() {
        for (int i = 0; (i + this.START_INDEX)< (this.END_INDEX); i++) {
            this.sum += this.numbers.get((i+this.START_INDEX));
        }
    }

    public long getSum () {
        return this.sum;
    }
}
