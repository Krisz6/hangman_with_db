package hu.progmatic.hangman_with_db.model;

import java.util.Set;

public class Game {
    private String word;
    private String wordAtLine;
    private Set<Character> inputs;
    private int life;
    private boolean isEnd;

    //üres konstruktor
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWordAtLine() {
        return wordAtLine;
    }

    public void setWordAtLine(String wordAtLine) {
        this.wordAtLine = wordAtLine;
    }

    public Set<Character> getInputs() {
        return inputs;
    }

    public void setInputs(Set<Character> inputs) {
        this.inputs = inputs;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }
    public boolean addInput(char input){
        return inputs.add(input);
    }
}
