package com.narxoz.rpg.enemy;

import com.narxoz.rpg.enemy.ability.Ability;
import com.narxoz.rpg.enemy.loot.LootTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Enemy implements Cloneable {
    private String name;
    private int health;
    private int damage;
    private int defense;
    private int speed;
    private String element;
    private List<Ability> abilities;
    private LootTable loot;
    private String ai;
    private Map<Integer, Integer> phases = new HashMap<>();

    public Enemy(String name, int health, int damage, int defense,
                 int speed, String element,
                 List<Ability> abilities,
                 LootTable loot,
                 String ai) {

        this.name = name;
        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.speed = speed;
        this.element = element;
        this.abilities = abilities;
        this.loot = loot;
        this.ai = ai;
    }

    public void addPhase(int phaseNumber, int healthThreshold) {
        phases.put(phaseNumber, healthThreshold);
    }

    public void multiplyStats(double factor) {
        health = (int)(health * factor);
        damage = (int)(damage * factor);
        defense = (int)(defense * factor);
        speed = (int)(speed * factor);

    }

    public void show() {
        System.out.println("Enemy: " + name);
        System.out.println("Element: " + element + " | HP: " + health + " | DMG: " + damage + " | DEF: " + defense + " | SPD: " + speed);
        System.out.println("AI: " + ai);
        System.out.println("Abilities:");
        if (abilities != null) {
            for (Ability a : abilities) {
                System.out.println(" - " + a.getName() + ": " + a.getDescription() + " (DMG: " + a.getDamage() + ")");
            }
        }
        System.out.println("Loot: " + loot);
        System.out.println("Phases: " + phases);
        System.out.println("-----------------------------------");
    }

    @Override
    public Enemy clone() {
        try {
            Enemy copy = (Enemy) super.clone();
            if (abilities != null) {
                List<Ability> clonedAbilities = new ArrayList<>();
                for (Ability a : abilities) {
                    clonedAbilities.add(a.clone());
                }
                copy.abilities = clonedAbilities;
            }
            if (loot != null) {
                copy.loot = loot.clone();
            }
            copy.phases = new HashMap<>(phases);
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void setElement(String element) { this.element = element; }
    public void setAbilities(List<Ability> abilities) { this.abilities = abilities; }
}
