package friendsofmine.controllers;


import friendsofmine.controllers.IndexController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Created by kotoly on 04/03/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest  //initialisation des classes qu'on a besoins pour lancer cette classe
@AutoConfigureMockMvc // pour initialiser le mockMvc
public class UtilisateurControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void list() throws Exception {
        this.mockMvc.perform(get("/utilisateurs")).
                andExpect(status().isOk()).andExpect(view().
                name("utilisateurs")).andDo(print());
    }

}