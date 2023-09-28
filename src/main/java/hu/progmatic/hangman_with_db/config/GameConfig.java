package hu.progmatic.hangman_with_db.config;

import hu.progmatic.hangman_with_db.model.Game;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {
    @Bean
    public Game gameBean(){
        return new Game();
    }
}
