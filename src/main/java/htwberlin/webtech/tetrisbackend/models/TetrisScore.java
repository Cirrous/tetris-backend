package htwberlin.webtech.tetrisbackend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TetrisScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int highscore;

    public TetrisScore() {
    }

    public TetrisScore(String name, int highscore) {
        this.name = name;
        this.highscore = highscore;

    }
}