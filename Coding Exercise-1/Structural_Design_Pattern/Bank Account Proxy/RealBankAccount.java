public class RealBankAccount implements BankAccount {
    private double balance;

    public RealBankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
