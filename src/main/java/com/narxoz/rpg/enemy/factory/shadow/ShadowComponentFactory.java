package com.narxoz.rpg.enemy.factory.shadow;

import com.narxoz.rpg.enemy.ability.Ability;
import com.narxoz.rpg.enemy.ability.ice.FrostBreath;
import com.narxoz.rpg.enemy.ability.ice.IceShield;
import com.narxoz.rpg.enemy.ability.shadow.ShadowStrike;
import com.narxoz.rpg.enemy.ability.shadow.Vanish;
import com.narxoz.rpg.enemy.factory.EnemyComponentFactory;
import com.narxoz.rpg.enemy.loot.LootTable;
import com.narxoz.rpg.enemy.loot.lootFire.FireLootTable;

import java.util.ArrayList;
import java.util.List;

public class ShadowComponentFactory implements EnemyComponentFactory {



    @Override
    public List<Ability> createAbilities() {
        List<Ability> abilities = new ArrayList<>();
        abilities.add(new ShadowStrike());
        abilities.add(new Vanish());
        return abilities;
    }

    @Override
    public LootTable createLootTable() {
        return new FireLootTable();
    }

    @Override
    public String createAI() {
        return "Tactical";
    }
}
