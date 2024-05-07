package htwberlin.webtech.tetrisbackend.controllers;

import htwberlin.webtech.tetrisbackend.models.PlayerScore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {
    @GetMapping("/highscores")
    public List<PlayerScore> index() {
        PlayerScore score1 = new PlayerScore(99);
        PlayerScore score2 = new PlayerScore(88);
        PlayerScore score3 = new PlayerScore(77);
        List highsScores = new ArrayList<PlayerScore>();
        highsScores.add(score1);
        highsScores.add(score2);
        highsScores.add(score3);
        return highsScores;
    }

}
