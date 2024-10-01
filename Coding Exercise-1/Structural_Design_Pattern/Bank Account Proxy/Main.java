public class Main {
    public static void main(String[] args) {
        RealBankAccount realAccount = new RealBankAccount(1000);
        BankAccountProxy proxyAccount = new BankAccountProxy(realAccount);

        proxyAccount.withdraw(100);
        proxyAccount.withdraw(900);
    }
}
