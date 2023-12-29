public class DebitCard extends BankProduct {
    public DebitCard(String currency, double balance, String name) {
        super(currency, balance, name);
    }

    @Override
    public void recharge(double amount) {
        balance += amount;
    }
}