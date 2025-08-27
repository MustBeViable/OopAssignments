public class BankAccount {
    private static int totalAccounts;
    static private int accountNumberIndex = 1000;

    private int accountNumber;
    private double accountBalance;

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public BankAccount(double balance) {
        this.accountBalance = balance;
        this.accountNumber = accountNumberIndex;
        accountNumberIndex++;
        totalAccounts++;
    }

    private void deposit(double money) {
        this.accountBalance += money;
    }

    public void withdraw(double money) {
        this.accountBalance -= money;
    }

    public double getBalance() {
        return this.accountBalance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}
