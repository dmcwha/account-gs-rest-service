/**
 * Hardcoded account data for test purposes
 * Replace with external data source eg database
 */
package accountService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class AccountMockedData {
    private List<Account> accountList;

    private static AccountMockedData instance = null;
    public static AccountMockedData getInstance(){
        if(instance == null){
            instance = new AccountMockedData();
        }
        return instance;
    }


    public AccountMockedData(){
        accountList = new ArrayList<Account>();
        accountList.add(new Account("585309209", "SGSavings726", Account.AccountType.Savings,
                LocalDate.of(2018,11,8), Currency.getInstance("SGD"), new BigDecimal("84327.51")));
        accountList.add(new Account("791066619", "AUSavings933", Account.AccountType.Savings,
                LocalDate.of(2018,11,8), Currency.getInstance("AUD"), new BigDecimal("88005.93")));
        accountList.add(new Account("321143048", "AUSCurrent433", Account.AccountType.Current,
                LocalDate.of(2018,11,8), Currency.getInstance("AUD"), new BigDecimal("38010.62")));


    }

    /**
     *  return all accounts
     */
    public List<Account> fetchAccountList() {
        return accountList;
    }

}
