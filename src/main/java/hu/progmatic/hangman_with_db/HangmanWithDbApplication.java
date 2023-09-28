package hu.progmatic.hangman_with_db;

import hu.progmatic.hangman_with_db.model.Word;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HangmanWithDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(HangmanWithDbApplication.class, args);
    }
}
