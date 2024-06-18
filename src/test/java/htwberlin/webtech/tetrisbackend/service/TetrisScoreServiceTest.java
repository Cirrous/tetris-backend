package htwberlin.webtech.tetrisbackend.service;

import htwberlin.webtech.tetrisbackend.models.TetrisScore;
import htwberlin.webtech.tetrisbackend.models.TetrisScoreRepository;
import htwberlin.webtech.tetrisbackend.models.TetrisScoreService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.stream.StreamSupport;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

@SpringBootTest
public class TetrisScoreServiceTest {
/**
    @Autowired
    private TetrisScoreService service;

    @MockBean
    private TetrisScoreRepository repository;

    @BeforeEach
    void setUpMockRepository() {
        final TetrisScore score1 = new TetrisScore("Anna", 100);
        final TetrisScore score2= new TetrisScore("Mark", 200);
        doReturn(List.of(score1 , score2)).when(repository).findAll();
        // doReturn(yoda).when(repository).findById(1L);   ?
    }

    @Test
    void testGetHeroesByAffiliation() {
        final List<TetrisScore> resultAsIterable = service.getAllScores();
        final List<TetrisScore> result = StreamSupport.stream(resultAsIterable.spliterator(), false).toList();
        assertSame(1, result.size(), "Number of heroes should be one for affiliation=rebellion");
        assertEquals(result.getFirst().getName(), "Han Solo");
    }
    */
}