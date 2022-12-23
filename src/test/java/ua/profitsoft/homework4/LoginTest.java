package ua.profitsoft.homework4;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import ua.profitsoft.homework4.controller.UserController;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@SpringBootTest
@AutoConfigureMockMvc
public class LoginTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private UserController controller;

    @Test
    public void controllerShouldNotBeNull() {
        assertThat(controller).isNotNull();
    }

    @Test
    public void shouldRedirectToWelcome() throws Exception {
        this.mockMvc.perform(get("/"))
                .andDo(print())
                .andExpect(status().is3xxRedirection());
    }

    @Test
    public void accessDeniedTest() throws Exception {
        this.mockMvc.perform(get("/welcome"))
                .andDo(print())
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/login"));
        this.mockMvc.perform(get("/users"))
                .andDo(print())
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/login"));
    }

    @Test
    public void correctLoginTest() throws Exception {
        this.mockMvc.perform(post("/login")
                .param("login", "admin")
                .param("password", "admin"))
                .andDo(print())
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/welcome"));
    }

    @Test
    public void badCredentials() throws Exception {
        this.mockMvc.perform(post("/login")
                .param("login", "spider"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
}
