package com.narxoz.rpg.enemy.prototype;

import com.narxoz.rpg.enemy.Enemy;

public class EnemyCloner implements EnemyPrototype{
    private Enemy enemy;
    public EnemyCloner(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public Enemy cloneEnemy() {
        return enemy.clone();
    }
}
