package htwberlin.webtech.tetrisbackend.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  java.util.List;
import java.util.Optional;

@Service
public class TetrisScoreService {

    @Autowired
    TetrisScoreRepository repo;


    public TetrisScore saveHighScore(TetrisScore data) {
        String identifier = data.getIdentifier();
        Optional<TetrisScore> existingScore = repo.findByIdentifier(identifier);
        if (existingScore.isPresent()) {
            TetrisScore scoreToUpdate = existingScore.get();
            scoreToUpdate.setHighscore(data.getHighscore());
            return repo.save(scoreToUpdate);
        } else {
            throw new TetrisScoreException("Score could not be saved. User does not exist.");
        }
    }

    public TetrisScore saveName(TetrisScore data) {
        String identifier = data.getIdentifier();
        Optional<TetrisScore> existingName = repo.findByIdentifier(identifier);
        if (existingName.isPresent()) {
            TetrisScore nameToUpdate = existingName.get();
            nameToUpdate.setName(data.getName());
            return repo.save(nameToUpdate);
        } else {
            throw new TetrisScoreException("Score could not be saved. User does not exist.");
        }
    }

    public TetrisScore login(TetrisScore data) {
        String identifier = data.getIdentifier();
        Optional<TetrisScore> existingScore = repo.findByIdentifier(identifier);
        if (existingScore.isPresent()) {
            return existingScore.get();
        } else {
            data.setIdentifier(identifier);
            return repo.save(data);
        }
    }

    public TetrisScore getUser(String identifier) {
        return repo.findByIdentifier(identifier).orElseThrow(() -> new TetrisScoreException("User does not exist"));
    }

    public List<TetrisScore> getAllScores() {
        return repo.findAll(); }
}