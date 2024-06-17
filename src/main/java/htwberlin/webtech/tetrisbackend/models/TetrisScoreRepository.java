package htwberlin.webtech.tetrisbackend.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TetrisScoreRepository extends JpaRepository<TetrisScore, Long> {
}
