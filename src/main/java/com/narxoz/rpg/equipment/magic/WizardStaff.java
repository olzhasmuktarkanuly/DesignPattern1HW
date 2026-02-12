package com.narxoz.rpg.equipment.magic;

import com.narxoz.rpg.equipment.Weapon;

public class WizardStaff implements Weapon {

    @Override
    public String getWeaponInfo() {
        return "Wizard Staff (Damage: 15, Mana Boost: 20)";
    }

    @Override
    public int getDamage() {
        return 15;
    }
}
