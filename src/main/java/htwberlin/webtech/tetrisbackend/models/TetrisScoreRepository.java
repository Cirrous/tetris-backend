package htwberlin.webtech.tetrisbackend.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TetrisScoreRepository extends CrudRepository<TetrisScore, Long> {
}
