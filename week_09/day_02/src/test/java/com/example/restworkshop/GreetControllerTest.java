package com.example.restworkshop;

import com.example.restworkshop.controller.GreetController;
//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(GreetController.class)
public class GreetControllerTest {
    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void greetingWithoutparameter() throws Exception {
        mockMvc.perform(get("/greeter"))
                .andExpect(MockMvcResultMatchers.status().isBadRequest())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error",
                        is("Please provide a name and a title!")));
    }

    @Test
    public void greetingWithNameAndTitle() throws Exception {
        mockMvc.perform(get("/greeter?name=Vader&title=Sith"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Vader, my dear Sith!")));
    }

    @Test
    public void greetingWithOneParam() throws Exception {
        mockMvc.perform(get("/greeter?name=Petike"))
                .andExpect(MockMvcResultMatchers.status().isBadRequest())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("Please provide a title!")));
    }

}
