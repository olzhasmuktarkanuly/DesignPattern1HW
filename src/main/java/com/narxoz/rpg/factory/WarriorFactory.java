package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.GameCharacter;
import com.narxoz.rpg.character.Warrior;

public class WarriorFactory extends CharacterFactory {

    @Override
    public GameCharacter createCharacter(String name) {
        return new Warrior(name);
    }
}
