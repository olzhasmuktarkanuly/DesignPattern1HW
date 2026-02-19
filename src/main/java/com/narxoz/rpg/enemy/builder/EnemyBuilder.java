package com.narxoz.rpg.enemy.builder;


import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.enemy.ability.Ability;
import com.narxoz.rpg.enemy.loot.LootTable;

import java.util.List;

public interface EnemyBuilder {
    EnemyBuilder setName(String name);
    EnemyBuilder setHealth(int health);
    EnemyBuilder setDamage(int damage);
    EnemyBuilder setDefense(int defense);
    EnemyBuilder setSpeed(int speed);
    EnemyBuilder setElement(String element);
    EnemyBuilder addAbility(Ability ability);
    EnemyBuilder setAbilities(List<Ability> abilities);
    EnemyBuilder setLootTable(LootTable loot);
    EnemyBuilder setAI(String ai);

    BossEnemyBuilder addPhase(int phase, int hp);

    Enemy build();

}
