public class BankAccountProxy implements BankAccount {
    private RealBankAccount realBankAccount;

    public BankAccountProxy(RealBankAccount realBankAccount) {
        this.realBankAccount = realBankAccount;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Proxy: Logging access request...");
        realBankAccount.withdraw(amount);
    }
}
