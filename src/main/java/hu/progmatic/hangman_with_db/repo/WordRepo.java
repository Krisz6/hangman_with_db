package hu.progmatic.hangman_with_db.repo;

import hu.progmatic.hangman_with_db.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepo extends JpaRepository<Word, String> {
}
