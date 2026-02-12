package com.narxoz.rpg.character;

public abstract class GameCharacter {

    protected String name;
    protected int health;
    protected int mana;
    protected int strength;
    protected int intelligence;

    public GameCharacter(String name, int health, int mana, int strength, int intelligence) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.strength = strength;
        this.intelligence = intelligence;
    }

    public void getStats() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    public abstract void useSpecialAbility();
}
