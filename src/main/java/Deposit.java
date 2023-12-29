public class Deposit extends BankProduct {
    public Deposit(String currency, double balance, String name) {
        super(currency, balance, name);
    }

    public void close() {
        balance = 0.0;
    }

    @Override
    public void recharge(double amount) {
        balance += amount;
    }
}

