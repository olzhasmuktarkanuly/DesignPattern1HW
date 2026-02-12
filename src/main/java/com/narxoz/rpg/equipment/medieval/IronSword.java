package com.narxoz.rpg.equipment.medieval;

import com.narxoz.rpg.equipment.Weapon;

public class IronSword implements Weapon {

    @Override
    public String getWeaponInfo() {
        return "Iron Sword (Damage: 25)";
    }

    @Override
    public int getDamage() {
        return 25;
    }
}
