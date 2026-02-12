package com.narxoz.rpg.equipment.ranger;

import com.narxoz.rpg.equipment.Weapon;

public class Longbow implements Weapon {

    @Override
    public String getWeaponInfo() {
        return "Longbow (Damage: 30, Range: Long)";
    }

    @Override
    public int getDamage() {
        return 30;
    }
}
