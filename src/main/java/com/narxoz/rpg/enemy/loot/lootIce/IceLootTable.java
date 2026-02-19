package com.narxoz.rpg.enemy.loot.lootIce;

import com.narxoz.rpg.enemy.loot.LootTable;
import com.narxoz.rpg.enemy.loot.lootFire.FireLootTable;

import java.util.ArrayList;
import java.util.List;

public class IceLootTable implements LootTable {
    private List<String> items;
    private int gold;
    private int experience;

    public IceLootTable(){
        items = new ArrayList<>();
        items.add("Ice Gem");
        items.add("Frost Scale");
        items.add("Flame Rune");
        gold = 80;
        experience = 70;


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
            IceLootTable copy = (IceLootTable) super.clone();
            copy.items = new ArrayList<>(this.items);
            return copy;
        }catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }

    }
}
