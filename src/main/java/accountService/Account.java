/**
 * Details for each account
 */
package accountService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Currency;

public class Account {
    private final String accountNumber;
    private final String accountName;
    private final AccountType accountType;
    private final LocalDate balanceDate; //may need to be ZonedDateTime if timezones are important
    private final Currency currency;
    private final BigDecimal openingAvailableBalance;

    enum AccountType {Savings, Current}


    public Account(String accountNumber, String accountName, AccountType accountType, LocalDate balanceDate, Currency currency, BigDecimal openingAvailableBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountType = accountType;
        this.balanceDate = balanceDate;
        this.currency = currency;
        this.openingAvailableBalance = openingAvailableBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public LocalDate getBalanceDate() {
        return balanceDate;
    }

    public Currency getCurrency() {
        return currency;
    }

    public BigDecimal getOpeningAvailableBalance() {
        return openingAvailableBalance;
    }
}
