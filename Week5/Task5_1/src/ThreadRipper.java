public class ThreadRipper extends Thread {
    private static int even = 0;
    private static int odd = 1;
    private boolean isOdd;
    private boolean isEven;
    private int maxNumber;

    public ThreadRipper(boolean isEven, boolean isOdd, int maxNumber) {
        this.isEven = isEven;
        this.maxNumber = maxNumber;
        this.isOdd  = isOdd;
    }

    @Override
    public void run() {
        while (true) {
                if (this.isOdd) {
                    System.out.println("Odd Thread: " + odd);
                    odd++; odd++;
                    if (odd >= (this.maxNumber+1)) {
                        break;
                    }
                } else if (this.isEven) {
                    System.out.println("Even Thread: " + even);
                    even++; even++;
                    if (even >= (this.maxNumber+1)) {
                        break;
                    }
                }
            }
    }

    public static void main(String[] args) {
        ThreadRipper t1 = new ThreadRipper(true, false, 20);
        ThreadRipper t2 = new ThreadRipper(false, true, 20);
        t1.start(); t2.start();
        try {
            t1.join();
            t2.join();
            System.out.println("Printing stopped.");
        } catch (InterruptedException e) {
            e.getStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
