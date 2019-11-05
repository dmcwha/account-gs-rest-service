package accountService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class AccountListControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void paramAccountsShouldReturnList() throws Exception {
        this.mockMvc.perform(get("/accounts")).andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.[:1].accountNumber").value("585309209"))
                .andExpect(jsonPath("$.length()", is(3)));

    }


}
