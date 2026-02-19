package com.narxoz.rpg.enemy.factory.Ice;

import com.narxoz.rpg.enemy.ability.Ability;
import com.narxoz.rpg.enemy.ability.fire.FireShield;
import com.narxoz.rpg.enemy.ability.fire.FlameBreath;
import com.narxoz.rpg.enemy.ability.ice.FrostBreath;
import com.narxoz.rpg.enemy.ability.ice.IceShield;
import com.narxoz.rpg.enemy.factory.EnemyComponentFactory;
import com.narxoz.rpg.enemy.loot.LootTable;
import com.narxoz.rpg.enemy.loot.lootFire.FireLootTable;
import com.narxoz.rpg.enemy.loot.lootIce.IceLootTable;

import java.util.ArrayList;
import java.util.List;

public class IceComponentFactory implements EnemyComponentFactory {
    @Override
    public List<Ability> createAbilities() {
        List<Ability> abilities = new ArrayList<>();
        abilities.add(new FrostBreath());
        abilities.add(new IceShield());
        return abilities;
    }

    @Override
    public LootTable createLootTable() {
        return new IceLootTable();
    }

    @Override
    public String createAI() {
        return "Defensive";
    }
}
