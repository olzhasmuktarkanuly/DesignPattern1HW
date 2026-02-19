package com.narxoz.rpg.enemy.ability.fire;

import com.narxoz.rpg.enemy.ability.Ability;

public class FlameBreath implements Ability {
    private final String name = "Flame Breath";
    private final int damage = 50;
    private final String description = "AoE fire damage + burn effect";



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
        try {
            return (Ability) super.clone();
        }catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }
}
