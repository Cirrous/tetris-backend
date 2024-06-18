package htwberlin.webtech.tetrisbackend.web;

import htwberlin.webtech.tetrisbackend.controllers.TetrisScoreController;
import htwberlin.webtech.tetrisbackend.models.TetrisScore;
import htwberlin.webtech.tetrisbackend.models.TetrisScoreService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.equalTo;

@WebMvcTest(TetrisScoreController.class)
public class TetrisScoreControllerTest {
/**
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TetrisScoreService service;

    @BeforeEach
    void setUpMockRepository() {
        final TetrisScore  tetrisScore1 = new TetrisScore( "Hanz", 185);
        when(service.getScore(1L)).thenReturn(tetrisScore1);
    }

    @Test
    void testGetHeroById() throws Exception {
        final String expectation = "{\"id\":1,\"name\":\"Han Solo\",\"affiliation\":\"Rebellion\",\"heightInM\":1.85}";
        this.mockMvc.perform(get("/highscores/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string(equalTo(expectation)));
    }
    */
}