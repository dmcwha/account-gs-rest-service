package accountService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionListController {
    TransactionListMockedData transactionListMockedData = TransactionListMockedData.getInstance();

    @RequestMapping("/transactions")
     public List<Transaction> accountList(@RequestParam(required = false) String accountNumber) {
        List<Transaction> filteredAccountList = null;
        if(accountNumber==null)
            filteredAccountList = transactionListMockedData.fetchAccountList();
        else
            filteredAccountList = transactionListMockedData.getTransactionListByAccountNumber(accountNumber);

        return filteredAccountList;
    }

}

