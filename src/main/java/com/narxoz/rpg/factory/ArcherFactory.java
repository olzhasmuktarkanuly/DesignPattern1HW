package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.GameCharacter;
import com.narxoz.rpg.character.Archer;

public class ArcherFactory extends CharacterFactory {

    @Override
    public GameCharacter createCharacter(String name) {
        return new Archer(name);
    }
}
