package com.narxoz.rpg.enemy.ability.shadow;

import com.narxoz.rpg.enemy.ability.Ability;

public class ShadowStrike implements Ability {
    private final String name = " ShadowStrike ";
    private final int damage = 50;
    private final String description = " High damage + blinds enemy ";


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Ability clone() {
        return new ShadowStrike();
    }
}
