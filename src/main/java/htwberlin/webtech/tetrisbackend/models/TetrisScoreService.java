package htwberlin.webtech.tetrisbackend.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  java.util.List;

@Service
public class TetrisScoreService {

    @Autowired
    TetrisScoreRepository repo;

    public TetrisScore saveScore(TetrisScore score) {
        return repo.save(score);
    }

    public TetrisScore getScore(Long id) {
        return repo.findById(id).orElseThrow(() -> new TetrisScoreException("Score does not exist"));
    }

    public List<TetrisScore> getAllScores() {
        return repo.findAll(); }
}