package friendsofmine.controllers;


import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(ActiviteController.class)
public class ActiviteControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ActiviteController activiteController;

    @Test
    public void list() throws Exception {
        when(activiteController.list(null)).thenReturn("activites");
        this.mockMvc.perform(get("/activites")).andDo(print()).
                andExpect(status().isOk())
                .andExpect(content().string(containsString("activites")));
    }
}