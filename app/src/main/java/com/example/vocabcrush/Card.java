package com.example.vocabcrush;

// Diese Klasse soll eine Quizkarte als Code darstellen

public class Card {

    private String ques; // Diese Variable stellt die Frage dar, zB "Welche Farbe hat eine Banane?"
    private String A; // Diese Variable stellt einer der moeglichen Antworten auf die Frage dar zB "blau"
    private String B; // Diese Variable stellt einer der moeglichen Antworten auf die Frage dar zB "rot"
    private String C; // Diese Variable stellt einer der moeglichen Antworten auf die Frage dar zB "gelb"
    private String D; // Diese Variable stellt einer der moeglichen Antworten auf die Frage dar zB "lila"
    private String sol; // Diese Variable stellt die Loesung auf die Frage dar, sie stimmt mit einer der oberen Antwortmoeglichkeiten ueberein zB "gelb"

    //Konstruktor

    public Card(String ques, String a, String b, String c, String d, String sol) {
        this.ques = ques;
        A = a;
        B = b;
        C = c;
        D = d;
        this.sol = sol;
    }

    // getter und setter:

    public String getQues() {
        return ques;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getB() {
        return B;
    }

    public void setB(String b) {
        B = b;
    }

    public String getC() {
        return C;
    }

    public void setC(String c) {
        C = c;
    }

    public String getD() {
        return D;
    }

    public void setD(String d) {
        D = d;
    }

    public String getSol() {
        return sol;
    }

    public void setSol(String sol) {
        this.sol = sol;
    }
}
