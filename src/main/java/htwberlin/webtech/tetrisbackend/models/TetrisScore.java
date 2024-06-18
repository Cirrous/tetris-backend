package htwberlin.webtech.tetrisbackend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class TetrisScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String name;
    private int highscore;

    public TetrisScore() {
    }

    public TetrisScore(String name, int highscore, String email, String password) {
        this.name = name;
        this.highscore = highscore;
        this.email = email;
        this.password = password;


    }
}