package com.narxoz.rpg.enemy.loot.lootFire;

import com.narxoz.rpg.enemy.loot.LootTable;

import java.util.ArrayList;
import java.util.List;


public class FireLootTable implements LootTable {
    private List<String> items;
    private int gold;
    private int experience;

    public FireLootTable(){
        items = new ArrayList<>();
        items.add("Fire Gem");
        items.add("Dragon Scale");
        items.add("Flame Rune");
        gold = 100;
        experience = 50;


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
            FireLootTable copy = (FireLootTable) super.clone();
            copy.items = new ArrayList<>(this.items);
            return copy;
        }catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }
}
