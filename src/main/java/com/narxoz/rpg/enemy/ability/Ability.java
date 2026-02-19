package com.narxoz.rpg.enemy.ability;

public interface Ability extends Cloneable {
    String getName();
    int getDamage();
    String getDescription();
    Ability clone();

}
