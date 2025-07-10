package api.mywebapp.controller.template.v1;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@Slf4j
@ActiveProfiles("test")
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Integration Testing on Ping Endpoint")
class PingControllerV1Test {

    @Autowired
    private MockMvc mockMvc;

    @Order(1)
    @Test
    @DisplayName(" get a simple ping in the controller")
    void getPing() throws Exception {
        mockMvc.perform(get("/v1/pingController/ping"))
                .andExpect(status().isAccepted());
    }
}
