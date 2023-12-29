public class CurrencyDebitCard extends DebitCard {
    private String currencyType;

    public CurrencyDebitCard(String currencyType, double balance, String name) {
        super("USD", balance, name);
        this.currencyType = currencyType;
    }

    public String getCurrencyType() {
        return currencyType;
    }
}