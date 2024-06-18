package org.example.soldier;



public class Soldier {
    protected int health = 300;
    private int strength = 150;


    public Soldier(int health, int strength) {
        this.strength = strength;
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int attack() {
        return this.strength;
    }

    public String receiveDamage(int damage) {
       this.health -= damage;
        return null;
    }

}





