package accountService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class TransactionListMockedData {
    private List<Transaction> transactionList;

    private static TransactionListMockedData instance = null;
    public static TransactionListMockedData getInstance(){
        if(instance == null){
            instance = new TransactionListMockedData();
        }
        return instance;
    }


    public TransactionListMockedData(){
        transactionList = new ArrayList<Transaction>();
        transactionList.add(new Transaction("585309209", "SGSavings726", LocalDate.of(2018,11,8),
                Currency.getInstance("SGD"), new BigDecimal("9540.98"), Transaction.DebitCreditType.Credit, "Transaction1"));
        transactionList.add(new Transaction("585309209", "SGSavings726", LocalDate.of(2018,11,6),
                Currency.getInstance("SGD"), new BigDecimal("7497.82"), Transaction.DebitCreditType.Debit, "Transaction2"));
        transactionList.add(new Transaction("791066619", "AUSavings933", LocalDate.of(2018,10,8),
                Currency.getInstance("AUD"), new BigDecimal("5564.79"), Transaction.DebitCreditType.Credit, "Transaction3"));

    }

    public List<Transaction> fetchAccountList() {
        return transactionList;
    }

    /**
     * Returns a list of transactions filtered by account number
     * When a database backend is used this would be easily done using a database operation
     * @param accountNumber
     * @return
     */
    public List<Transaction> getTransactionListByAccountNumber(String accountNumber) {
        List<Transaction> filteredTransactionList = new ArrayList<>(transactionList);
        filteredTransactionList.removeIf(n -> (!n.getAccountNumber().equals(accountNumber)));
        System.out.println("accountNumber=" + accountNumber);
        System.out.println(filteredTransactionList.toString());
        return filteredTransactionList;
    }

}
