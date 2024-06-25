package htwberlin.webtech.tetrisbackend.controllers;

import htwberlin.webtech.tetrisbackend.models.TetrisScore;
import htwberlin.webtech.tetrisbackend.models.TetrisScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TetrisScoreController {

    @Autowired
    TetrisScoreService service;

    @PostMapping("/login")
    public TetrisScore sendLogin(@RequestBody TetrisScore user) {
        return service.login(user);
    }

    @PostMapping("/newhighscore")
    public TetrisScore createScore(@RequestBody TetrisScore score) {
        return service.saveHighScore(score);
    }

    @GetMapping("/highscores")
    public List<TetrisScore> getScores() {
        return service.getAllScores();
    }

    @GetMapping ("/highscores/{identifier}")
    public TetrisScore getScore(@PathVariable String identifier) {
        return service.getUser(identifier);
    }

}
