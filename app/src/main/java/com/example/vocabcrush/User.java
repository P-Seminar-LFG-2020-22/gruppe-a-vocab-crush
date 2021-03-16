package com.example.vocabcrush;

// Diese Klasse ist die Benutzer/Spieler-Klasse

public class User {

    private String input; // Diese Variable stellt die Antwort des Spielers bei einem Quiz dar zB "lila"
    private int Score; // Diese Variable zaehlt den total score eines Spielers
    private int acc; // Diese Variable zwischen 0-100 stellt dar wie viel Prozent der Fragen ein Spieler im Durchschnitt richtig beantwortet
    private int gamesPlayed; // Diese Variable zaehlt die Menge an gespielten Spielen (egal wie gut abgeschlossen)

    // Konstruktor:

    public User(String input, int score, int acc, int gamesPlayed) {
        this.input = input;
        Score = score;
        this.acc = acc;
        this.gamesPlayed = gamesPlayed;
    }

    // getter und setter:

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    public int getAcc() {
        return acc;
    }

    public void setAcc(int acc) {
        this.acc = acc;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }
}
