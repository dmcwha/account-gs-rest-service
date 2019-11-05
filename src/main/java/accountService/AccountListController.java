/**
 * Controller for returning the list of accounts
 */
package accountService;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountListController {
AccountMockedData accountMockedData = AccountMockedData.getInstance();

    @RequestMapping("/accounts")
    public List<Account> accountList() {
        return accountMockedData.fetchAccountList();
    }



}
