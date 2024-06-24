package htwberlin.webtech.tetrisbackend.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TetrisScoreRepository extends JpaRepository<TetrisScore, Long> {
    Optional<TetrisScore> findByIdentifier(String identifier);
}
