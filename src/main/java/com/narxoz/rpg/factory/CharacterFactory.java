package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.GameCharacter;

public abstract class CharacterFactory {
    public abstract GameCharacter createCharacter(String name);
}
