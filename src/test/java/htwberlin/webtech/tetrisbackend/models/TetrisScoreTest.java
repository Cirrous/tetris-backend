package htwberlin.webtech.tetrisbackend.models;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TetrisScoreTest {
    @Test
    void testTetrisToString() {
        final TetrisScore tetrisScore= new TetrisScore("Max Mustermann", 100, "7465737440746573742e636f6d");
        final String expectation = "TetrisScore(id=null, identifier=7465737440746573742e636f6d, name=Max Mustermann, highscore=100)";
        final String result = tetrisScore.toString();
        assertEquals(expectation, result);
    }

}
