package accountService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Currency;

public class Transaction {
    private final String accountNumber;
    private final String accountName; //could come from account
    private final LocalDate valueDate; //may need to be ZonedDateTime if timezones are important
    private final Currency currency; //could come from account
    private final BigDecimal amount; //UI should decide whether to display in credit or debit column
    private final DebitCreditType debitCreditType;
    private final String transactionNarrative;

    enum DebitCreditType{ Debit, Credit}

    public Transaction(String accountNumber, String accountName, LocalDate valueDate, Currency currency, BigDecimal debitAmount,  DebitCreditType debitCreditType, String transactionNarrative) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.valueDate = valueDate;
        this.currency = currency;
        this.amount = debitAmount;
        this.debitCreditType = debitCreditType;
        this.transactionNarrative = transactionNarrative;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public LocalDate getValueDate() {
        return valueDate;
    }

    public Currency getCurrency() {
        return currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

     public DebitCreditType getDebitCreditType() {
        return debitCreditType;
    }

    public String getTransactionNarrative() {
        return transactionNarrative;
    }
}
