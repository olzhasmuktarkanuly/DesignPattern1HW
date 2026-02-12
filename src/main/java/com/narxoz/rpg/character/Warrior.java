package com.narxoz.rpg.character;

public class Warrior extends GameCharacter {

    public Warrior(String name) {
        super(name, 150, 30, 120, 20);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Special Ability: Power Strike!");
    }
}
