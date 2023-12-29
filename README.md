## Bank Products System

This project represents a simple system for managing bank products. The implemented bank products include:

1. **BankProduct:**
    - Abstract class serving as the base class for all bank products.
    - Properties: `currency` (currency type), `balance` (current balance), `name` (product name).

2. **DebitCard:**
    - Subclass of `BankProduct` representing a debit card.
    - Additional property: None.
    - Methods: `recharge(double amount)` (add funds), `withdraw(double amount)` (withdraw funds).

3. **CreditCard:**
    - Subclass of `BankProduct` representing a credit card.
    - Additional properties: `interestRate` (interest rate for debt).
    - Methods: `recharge(double amount)` (add funds), `withdraw(double amount)` (withdraw funds), `getDebt()` (check debt), `getInterestRate()` (get interest rate).

4. **CurrencyDebitCard:**
    - Subclass of `DebitCard` representing a debit card with a specific currency type.
    - Additional property: `currencyType` (currency type).
    - Methods: `getCurrencyType()` (get currency type).

5. **Deposit:**
    - Subclass of `BankProduct` representing a deposit account.
    - Additional property: None.
    - Methods: `recharge(double amount)` (add funds), `close()` (close the account).

6. **Rechargeable:**
    - Interface defining a common method `recharge(double amount)`.

### Unit Tests (BankProductTest)

The project includes a set of unit tests to ensure the functionality of the implemented classes. The tests cover various scenarios for recharging, withdrawing, checking balances, and specific functionalities such as debt calculation and currency type retrieval.

Feel free to explore the unit tests in the `BankProductTest` class (or you can use _./gradlew test --info_), which includes tests for:

- DebitCard: Recharge and Withdraw
- CurrencyDebitCard: Recharge, Withdraw and GetCurrencyType
- CreditCard: Recharge, Withdraw, GetDebt, and GetInterestRate
- Deposit: Recharge and Close

The console output in the tests provides insights into the balance changes and other relevant information during test execution.
