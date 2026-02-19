package com.narxoz.rpg.enemy.factory.fire;

import com.narxoz.rpg.enemy.ability.Ability;
import com.narxoz.rpg.enemy.ability.fire.FireShield;
import com.narxoz.rpg.enemy.ability.fire.FlameBreath;
import com.narxoz.rpg.enemy.factory.EnemyComponentFactory;
import com.narxoz.rpg.enemy.loot.LootTable;
import com.narxoz.rpg.enemy.loot.lootFire.FireLootTable;

import java.util.ArrayList;
import java.util.List;

public class FireComponentFactory implements EnemyComponentFactory {

    @Override
    public List<Ability> createAbilities() {
        List<Ability> abilities = new ArrayList<>();
        abilities.add(new FlameBreath());
        abilities.add(new FireShield());
        return abilities;
    }

    @Override
    public LootTable createLootTable() {
        return new FireLootTable();
    }

    @Override
    public String createAI() {
        return "Aggressive";
    }
}
