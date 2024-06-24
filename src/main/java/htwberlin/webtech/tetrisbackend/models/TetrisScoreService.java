package htwberlin.webtech.tetrisbackend.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  java.util.List;
import java.util.Optional;

@Service
public class TetrisScoreService {

    @Autowired
    TetrisScoreRepository repo;


    public TetrisScore saveData(TetrisScore data) {
        return repo.save(data);
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