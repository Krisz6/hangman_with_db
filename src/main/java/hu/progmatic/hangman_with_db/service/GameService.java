package hu.progmatic.hangman_with_db.service;

import hu.progmatic.hangman_with_db.model.Game;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class GameService {
    private WordService wordService;
    private Game game;

    public GameService(WordService wordService, Game game) {
        this.wordService = wordService;
        this.game = game;
        newGame();
    }

    public Game getGame() {
        return game;
    }

    public void newGame() {
        game.setEnd(false);
        game.setLife(10);
        game.setInputs(new HashSet<>());
        game.setWord(wordService.getRandomWord().getWord());
        game.setWordAtLine("_".repeat(game.getWord().length()));
    }

    public void useInput(char input) {
        if (game.addInput(input)) {
            if (isInTheWord(input)) {
                showInWordAtLine(input);
            } else {
                game.setLife(game.getLife() - 1);
            }
            if (game.getLife() == 0 ||
                    game.getWord().equals(game.getWordAtLine())) {
                game.setEnd(true);
            }
        }
    }
    private void showInWordAtLine(char input) {
        String word = game.getWord();
        String wordAtLine = game.getWordAtLine();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == input) {
                wordAtLine = wordAtLine.substring(0, 1) +
                        input +
                        wordAtLine.substring(i + 1);
            }
        }
        game.setWordAtLine(wordAtLine);
    }

    private boolean isInTheWord(Character input) {
        return game.getWord().contains(input.toString());
    }

}
