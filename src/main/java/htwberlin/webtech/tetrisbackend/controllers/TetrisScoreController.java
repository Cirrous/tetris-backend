package htwberlin.webtech.tetrisbackend.controllers;

import htwberlin.webtech.tetrisbackend.models.TetrisScore;
import htwberlin.webtech.tetrisbackend.models.TetrisScoreRepository;
import htwberlin.webtech.tetrisbackend.models.TetrisScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TetrisScoreController {

    @Autowired
    TetrisScoreService service;

    @PostMapping("/newhighscore")
    public TetrisScore createScore(@RequestBody TetrisScore score) {
        return service.saveScore(score);
    }

    @GetMapping("/highscores")
    public List<TetrisScore> getScores() {
        return service.getAllScores();
    }

    @GetMapping ("/highscores/{id}")
    public TetrisScore getScore(@PathVariable String id) {
        Long scoreId = Long.parseLong(id);
        return service.getScore(scoreId);
    }

}
