package hu.progmatic.hangman_with_db.service;

import hu.progmatic.hangman_with_db.model.Word;
import hu.progmatic.hangman_with_db.repo.WordRepo;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class WordService {
    private WordRepo wordRepo;

    public WordService(WordRepo wordRepo) {
        this.wordRepo = wordRepo;
    }
    public List<Word> getAllWord(){
        return wordRepo.findAll();
    }
    public Word getRandomWord(){
        List<Word> words = getAllWord();
        Collections.shuffle(words);
        return words.get(0);
    }
}
