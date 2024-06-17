package htwberlin.webtech.tetrisbackend.model;

import htwberlin.webtech.tetrisbackend.models.TetrisScore;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TetrisScoreTest {
    @Test
    void testTetrisToString() {
        final TetrisScore tetrisScore= new TetrisScore("Max Mustermann", 100);
        final String expectation = "TetrisScore(id=null, name=Max Mustermann, highscore=100)";
        final String result = tetrisScore.toString();
        assertEquals(expectation, result);
    }
}
