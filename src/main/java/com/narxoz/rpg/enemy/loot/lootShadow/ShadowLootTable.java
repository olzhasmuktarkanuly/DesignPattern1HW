package com.narxoz.rpg.enemy.loot.lootShadow;

import com.narxoz.rpg.enemy.loot.LootTable;
import com.narxoz.rpg.enemy.loot.lootIce.IceLootTable;

import java.util.ArrayList;
import java.util.List;

public class ShadowLootTable implements LootTable {
    private List<String> items;
    private int gold;
    private int experience;

    public ShadowLootTable(){
        items = new ArrayList<>();
        items.add("Shadow Gem");
        items.add("Dark Essence");
        items.add("Shadow Rune");
        gold = 120;
        experience = 150;


    }


    @Override
    public List<String> getItems() {
        return new ArrayList<>(items);
    }

    @Override
    public int getGoldDrop() {
        return gold;
    }

    @Override
    public int getExperienceDrop() {
        return experience;
    }

    @Override
    public LootTable clone() {
        try{
            ShadowLootTable copy = (ShadowLootTable) super.clone();
            copy.items = new ArrayList<>(this.items);
            return copy;
        }catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }

    }
}
