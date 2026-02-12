package com.narxoz.rpg.character;

public class Archer extends GameCharacter {

    public Archer(String name) {
        super(name, 100, 60, 80, 70);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Special Ability: Precision Shot!");
    }
}
