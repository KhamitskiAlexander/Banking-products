public class CreditCard extends BankProduct {
    private double interestRate;

    public CreditCard(String currency, double balance, String name, double interestRate) {
        super(currency, balance, name);
        this.interestRate = interestRate;
    }

    @Override
    public void recharge(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    public double getDebt() {
        return balance * interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}