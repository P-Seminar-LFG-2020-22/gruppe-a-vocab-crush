package com.example.vocabcrush;

// Diese Klasse beschaeftigt sich mit den Monstern welche der Spieler waehrend eines Quizspieles besiegt

public class Monster {

    private String monName; //Der Name des Monsters
    private int HP; // Diese Variable stellt die maximalen Lebenspunkte eines Monsters da
    private int currHP; // Diese Variable zeigt die derzeitigen Lebenspunkte innerhalb eines Quizspieles
    private String monType; // Der Typ vom Monster zB "Normal", "Boss"

    // Konstruktor

    public Monster(String monName, int HP, int currHP, String monType) {
        this.monName = monName;
        this.HP = HP;
        this.currHP = currHP;
        this.monType = monType;
    }

    // getter und setter

    public String getMonName() {
        return monName;
    }

    public void setMonName(String monName) {
        this.monName = monName;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getCurrHP() {
        return currHP;
    }

    public void setCurrHP(int currHP) {
        this.currHP = currHP;
    }

    public String getMonType() {
        return monType;
    }

    public void setMonType(String monType) {
        this.monType = monType;
    }
}
