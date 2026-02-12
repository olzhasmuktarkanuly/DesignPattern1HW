package com.narxoz.rpg.equipment.magic;

import com.narxoz.rpg.equipment.Armor;

public class EnchantedRobe implements Armor {

    @Override
    public String getArmorInfo() {
        return "Enchanted Robe (Defense: 10, Mana Boost: 25)";
    }

    @Override
    public int getDefense() {
        return 10;
    }
}
