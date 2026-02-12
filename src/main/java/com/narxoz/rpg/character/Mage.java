package com.narxoz.rpg.character;

public class Mage extends GameCharacter {

    public Mage(String name) {
        super(name, 70, 150, 30, 130);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Special Ability: Fireball!");
    }
}
