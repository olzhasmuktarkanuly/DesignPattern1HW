package com.narxoz.rpg.enemy.builder;

import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.enemy.factory.EnemyComponentFactory;

public class EnemyDirector {
    private EnemyBuilder builder;

    public EnemyDirector(EnemyBuilder builder) {
        this.builder = builder;
    }

    public Enemy createMinion(EnemyComponentFactory factory) {
        return builder
                .setName("Minion")
                .setHealth(50)
                .setDamage(10)
                .setAbilities(factory.createAbilities())
                .setLootTable(factory.createLootTable())
                .setAI(factory.createAI())
                .addPhase(1, 50)
                .build();
    }

    public Enemy createElite(EnemyComponentFactory factory) {
        return builder
                .setName("Elite")
                .setHealth(200)
                .setDamage(50)
                .setAbilities(factory.createAbilities())
                .setLootTable(factory.createLootTable())
                .setAI(factory.createAI())
                .addPhase(1, 200)
                .addPhase(2, 100)
                .build();
    }

    public Enemy createMiniBoss(EnemyComponentFactory factory) {
        return builder
                .setName("MiniBoss")
                .setHealth(1000)
                .setDamage(150)
                .setAbilities(factory.createAbilities())
                .setLootTable(factory.createLootTable())
                .setAI(factory.createAI())
                .addPhase(1, 1000)
                .addPhase(2, 500)
                .build();
    }

    public Enemy createRaidBoss(EnemyComponentFactory factory) {
        return builder
                .setName("RaidBoss")
                .setHealth(5000)
                .setDamage(500)
                .setAbilities(factory.createAbilities())
                .setLootTable(factory.createLootTable())
                .setAI(factory.createAI())
                .addPhase(1, 5000)
                .addPhase(2, 3000)
                .addPhase(3, 1000)
                .build();
    }
}
