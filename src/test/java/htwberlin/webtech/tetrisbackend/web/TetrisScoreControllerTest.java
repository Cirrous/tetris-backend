package htwberlin.webtech.tetrisbackend.web;

import htwberlin.webtech.tetrisbackend.models.TetrisScore;
import htwberlin.webtech.tetrisbackend.controllers.TetrisScoreController;
import htwberlin.webtech.tetrisbackend.models.TetrisScoreService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(TetrisScoreController.class)
public class TetrisScoreControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TetrisScoreService service;

    @BeforeEach
    void setUp() {
        TetrisScore score = new TetrisScore("testUser", 100, "abc123");
        when(service.login(score)).thenReturn(score);
        when(service.saveHighScore(score)).thenReturn(score);
        when(service.saveName(score)).thenReturn(score);
        when(service.getUser("abc123")).thenReturn(score);
        when(service.getAllScores()).thenReturn(Arrays.asList(score));
    }

    @Test
    void testGetScores() throws Exception {
        mockMvc.perform(get("/highscores"))
                .andExpect(status().isOk())
                .andExpect(content().json("[{\"identifier\":\"abc123\",\"highscore\":100}]"));
    }

    @Test
    void testGetScore() throws Exception {
        mockMvc.perform(get("/highscores/abc123"))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"identifier\":\"abc123\",\"highscore\":100}"));
    }
}