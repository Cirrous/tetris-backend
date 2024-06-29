package htwberlin.webtech.tetrisbackend.service;

import htwberlin.webtech.tetrisbackend.models.TetrisScore;
import htwberlin.webtech.tetrisbackend.models.TetrisScoreException;
import htwberlin.webtech.tetrisbackend.models.TetrisScoreRepository;
import htwberlin.webtech.tetrisbackend.models.TetrisScoreService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class TetrisScoreServiceTest {

    @MockBean
    private TetrisScoreRepository repository;

    @Autowired
    private TetrisScoreService service;


    @Test
    public void testGetUser() {
        TetrisScore score = new TetrisScore("test", 100, "abc123");
        Mockito.when(repository.findByIdentifier("test")).thenReturn(Optional.of(score));

        TetrisScore result = service.getUser("test");

        assertEquals(score, result);
    }

    @Test
    public void testGetUserNotFound() {
        Mockito.when(repository.findByIdentifier("test")).thenReturn(Optional.empty());

        assertThrows(TetrisScoreException.class, () -> service.getUser("test"));
    }

    @Test
    public void testGetAllScores() {
        TetrisScore score1 = new TetrisScore("test1", 100, "abc123");
        TetrisScore score2 = new TetrisScore("test2", 200, "abc123");
        Mockito.when(repository.findAll()).thenReturn(List.of(score1, score2));

        List<TetrisScore> result = service.getAllScores();

        assertEquals(2, result.size());
        assertEquals(score1, result.get(0));
        assertEquals(score2, result.get(1));
    }
}