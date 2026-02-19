package com.narxoz.rpg.enemy.ability.ice;

import com.narxoz.rpg.enemy.ability.Ability;

public class IceShield implements Ability{
    private final String name = "Ice Shield";
    private final int shield = 50;
    private final String description = "damage protection";



    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDamage() {
        return shield;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Ability clone() {
        try {
            return (Ability) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
