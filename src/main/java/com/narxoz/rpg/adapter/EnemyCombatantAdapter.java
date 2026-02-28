package com.narxoz.rpg.adapter;

import com.narxoz.rpg.enemy.Enemy;

public class EnemyCombatantAdapter implements Combatant {
    private Enemy enemy;

    public EnemyCombatantAdapter(Enemy enemy) {
        this.enemy = enemy;
    }

    public String getName() {
        return enemy.getName();
    }

    public int getAttackPower() {
        return enemy.getDamage();
    }

    public void takeDamage(int amount) {
        enemy.applyDamage(amount);
    }

    public boolean isAlive() {
        return enemy.isAlive();
    }
}