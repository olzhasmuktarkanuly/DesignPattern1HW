package com.narxoz.rpg.equipment.ranger;

import com.narxoz.rpg.equipment.Armor;

public class LeatherArmor implements Armor {

    @Override
    public String getArmorInfo() {
        return "Leather Armor (Defense: 20, Agility Bonus)";
    }

    @Override
    public int getDefense() {
        return 20;
    }
}
