package com.narxoz.rpg.equipment.medieval;

import com.narxoz.rpg.equipment.Armor;

public class PlateArmor implements Armor {

    @Override
    public String getArmorInfo() {
        return "Plate Armor (Defense: 30)";
    }

    @Override
    public int getDefense() {
        return 30;
    }
}
