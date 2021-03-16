package com.example.vocabcrush;

// Wie der Name schon impliziert stellt diese Klasse ein Deck aus Karten dar

import java.util.ArrayList;

public class Carddeck extends ArrayList{

    private String deckType; // bestimmt den Typen vom Deck zB "MultipleChoice" "UserEingabe"

    // getter und setter:

    public String getDeckType() {
        return deckType;
    }

    public void setDeckType(String deckType) {
        this.deckType = deckType;
    }
}
