package com.narxoz.rpg.adapter;

import com.narxoz.rpg.character.GameCharacter;

public class CharacterCombatantAdapter implements Combatant {

    private GameCharacter character;

    public CharacterCombatantAdapter(GameCharacter character) {
        this.character = character;
    }

    public String getName() {
        return character.getName();
    }

    public int getAttackPower() {
        return character.getAttackPower();
    }

    public void takeDamage(int amount) {
        character.takeDamage(amount);
    }

    public boolean isAlive() {
        return character.isAlive();
    }
}