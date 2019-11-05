package accountService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TransactionListControllerTests {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void noParamTransactionsShouldReturn3List() throws Exception {
        this.mockMvc.perform(get("/transactions")).andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.[:1].accountNumber").value("585309209"))
                .andExpect(jsonPath("$.length()", is(3)));

    }

    @Test
    public void account1TransactionsShouldReturn2List() throws Exception {
        this.mockMvc.perform(get("/transactions?accountNumber=585309209")).andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.[:1].accountNumber").value("585309209"))
                .andExpect(jsonPath("$.length()", is(2)));

    }

    @Test
    public void account2TransactionsShouldReturn1List() throws Exception {
        this.mockMvc.perform(get("/transactions?accountNumber=791066619")).andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.[:1].accountNumber").value("791066619"))
                .andExpect(jsonPath("$.length()", is(1)));

    }

    @Test
    public void account3TransactionsShouldReturnEmptyList() throws Exception {
        this.mockMvc.perform(get("/transactions?accountNumber=321143048")).andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.length()", is(0)));

    }

}
