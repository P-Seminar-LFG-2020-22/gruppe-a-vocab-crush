package com.example.vocabcrush;

/* Dies ist die zentrale Verwaltungsklasse der App, hier sind zentrale Funktionen geschrieben wie zB der Game-Loop
   Definitionen: Spiel = Mit Spiel ist die gesamte App bzw das gesamte Spiel gemeint
                 Quizspiel = EIn Quizspiel ist der Durchlauf wenn ein Spieler ein Deck welches er spielen will auswaehlt und es dann von ihm gespielt wird.
* */

public class Game {

    private int r; // zaehlt die Runden innerhalb eines Quizspieles

    /*Erlaeuterung zur gameLoop-Methode:
    Als Input wird das zu spielende Deck genommen
    * */

    void gameLoop(Carddeck deck){

    }

    // liest die im lokalen Speicher gespeicherten Daten und gibt sie an die process-Methode

    void readTxtToCarddeck(){}

    // nimmt die Rohdateien von der read-Methode und baut draus Kartendecks ( Eingabeparamter ???)

    void processRead(){}

    // Speichert die Kartendeck in der Spielinstanz als .txt datei im Speicher ( onPause(); oder onDestroy(); )

    void writeCarddeckToTxt(){}

    // Berechnet zum Schluss eines Quizspiels die Ergebnisse aus diesem Quizspiel wie zb Fehlerquote, Score etc und addiert diese zu den totalScore vom Spieler

    void calcEndscore(){}


}


