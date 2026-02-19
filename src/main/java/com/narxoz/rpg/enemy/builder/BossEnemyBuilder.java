package com.narxoz.rpg.enemy.builder;

import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.enemy.ability.Ability;
import com.narxoz.rpg.enemy.loot.LootTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BossEnemyBuilder implements EnemyBuilder {
    private String name;
    private int health;
    private int damage;
    private int defense;
    private int speed;
    private String element;
    private List<Ability> abilities = new ArrayList<>();
    private LootTable loot;
    private String ai;
    private Map<Integer, Integer> phases = new HashMap<>();

    @Override
    public BossEnemyBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public BossEnemyBuilder setHealth(int health) {
        this.health = health;
        return this;
    }

    @Override
    public BossEnemyBuilder setDamage(int damage) {
        this.damage = damage;
        return this;
    }

    @Override
    public BossEnemyBuilder setDefense(int defense) {
        this.defense = defense;
        return this;
    }

    @Override
    public BossEnemyBuilder setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    @Override
    public BossEnemyBuilder setElement(String element) {
        this.element = element;
        return this;
    }

    @Override
    public BossEnemyBuilder addAbility(Ability ability) {
        this.abilities.add(ability);
        return this;
    }

    @Override
    public BossEnemyBuilder setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
        return this;
    }

    @Override
    public BossEnemyBuilder addPhase(int phaseNumber, int healthThreshold) {
        this.phases.put(phaseNumber, healthThreshold);
        return this;
    }

    @Override
    public BossEnemyBuilder setLootTable(LootTable loot) {
        this.loot = loot;
        return this;
    }

    @Override
    public BossEnemyBuilder setAI(String ai) {
        this.ai = ai;
        return this;
    }

    @Override
    public Enemy build() {
        if (name == null || name.isEmpty()) {
            throw new IllegalStateException("Name required!");
        }
        if (health <= 0) {
            throw new IllegalStateException("Health must be > 0");
        }
        return new Enemy(name, health, damage, defense,
                speed, element, abilities, loot, ai);
    }
}
