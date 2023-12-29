import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankProductTest {
    private static final Logger logger = LoggerFactory.getLogger(BankProductTest.class);

    @Test
    void debitCardRechargeAndWithdraw() {
        DebitCard debitCard = new DebitCard("USD", 100.0, "MyDebitCard");
        debitCard.recharge(50.0);
        logger.info("Debit Card Balance after recharge: " + debitCard.checkBalance());
        assertEquals(150.0, debitCard.checkBalance(), 0.001);
        debitCard.withdraw(30.0);
        logger.info("Debit Card Balance after withdrawal: " + debitCard.checkBalance());
        assertEquals(120.0, debitCard.checkBalance(), 0.001);
    }

    @Test
    void currencyDebitCardRechargeAndWithdraw() {
        CurrencyDebitCard currencyDebitCard = new CurrencyDebitCard("EUR", 100.0, "MyCurrencyDebitCard");
        currencyDebitCard.recharge(30.0);
        logger.info("Currency Debit Card Balance after recharge: " + currencyDebitCard.checkBalance());
        assertEquals(130.0, currencyDebitCard.checkBalance(), 0.001);
        currencyDebitCard.withdraw(20.0);
        logger.info("Currency Debit Card Balance after withdrawal: " + currencyDebitCard.checkBalance());
        assertEquals(110.0, currencyDebitCard.checkBalance(), 0.001);
    }

    @Test
    void creditCardRechargeAndWithdraw() {
        CreditCard creditCard = new CreditCard("USD", 1000.0, "MyCreditCard", 0.12);
        creditCard.recharge(50.0);
        logger.info("Credit Card Balance after recharge: " + creditCard.checkBalance());
        assertEquals(1050.0, creditCard.checkBalance(), 0.001);
        creditCard.withdraw(30.0);
        logger.info("Credit Card Balance after withdrawal: " + creditCard.checkBalance());
        assertEquals(1020.0, creditCard.checkBalance(), 0.001);
    }

    @Test
    void creditCardGetDebtAndInterestRate() {
        CreditCard creditCard = new CreditCard("USD", 1000.0, "MyCreditCard", 0.12);
        logger.info("Initial Debt: " + creditCard.getDebt());
        logger.info("Initial Interest Rate: " + creditCard.getInterestRate());
        assertEquals(120.0, creditCard.getDebt(), 0.001);
        assertEquals(0.12, creditCard.getInterestRate(), 0.001);
    }

    @Test
    void depositAccountRechargeAndClose() {
        Deposit depositAccount = new Deposit("USD", 500.0, "MyDepositAccount");
        depositAccount.recharge(100.0);
        logger.info("Deposit Account Balance after recharge: " + depositAccount.checkBalance());
        assertEquals(600.0, depositAccount.checkBalance(), 0.001);
        depositAccount.close();
        logger.info("Deposit Account Balance after closure: " + depositAccount.checkBalance());
        assertEquals(0.0, depositAccount.checkBalance(), 0.001);
    }

    @Test
    void currencyDebitCardGetCurrencyType() {
        CurrencyDebitCard currencyDebitCard = new CurrencyDebitCard("BOB", 100.0, "MyCurrencyDebitCard");
        logger.info("Initial Currency Type: " + currencyDebitCard.getCurrencyType());
        assertEquals("BOB", currencyDebitCard.getCurrencyType());
    }
}
