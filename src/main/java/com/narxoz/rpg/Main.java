package com.narxoz.rpg;

import com.narxoz.rpg.character.GameCharacter;
import com.narxoz.rpg.factory.*;
import com.narxoz.rpg.equipment.*;
import com.narxoz.rpg.equipment.medieval.*;
import com.narxoz.rpg.equipment.magic.*;
import com.narxoz.rpg.equipment.ranger.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== RPG Character Creation System ===\n");

        CharacterFactory warriorFactory = new WarriorFactory();
        GameCharacter warrior = warriorFactory.createCharacter("Thorin");

        warrior.getStats();
        warrior.useSpecialAbility();

        EquipmentFactory medieval = new MedievalFactory();
        Weapon w1 = medieval.createWeapon();
        Armor a1 = medieval.createArmor();

        System.out.println("Weapon: " + w1.getWeaponInfo());
        System.out.println("Armor: " + a1.getArmorInfo());
        System.out.println("\n---\n");

        CharacterFactory mageFactory = new MageFactory();
        GameCharacter mage = mageFactory.createCharacter("Gandalf");

        mage.getStats();
        mage.useSpecialAbility();

        EquipmentFactory magic = new MagicFactory();
        Weapon w2 = magic.createWeapon();
        Armor a2 = magic.createArmor();

        System.out.println("Weapon: " + w2.getWeaponInfo());
        System.out.println("Armor: " + a2.getArmorInfo());
        System.out.println("\n---\n");


        CharacterFactory archerFactory = new ArcherFactory();
        GameCharacter archer = archerFactory.createCharacter("Legolas");

        archer.getStats();
        archer.useSpecialAbility();

        EquipmentFactory ranger = new RangerFactory();
        Weapon w3 = ranger.createWeapon();
        Armor a3 = ranger.createArmor();

        System.out.println("Weapon: " + w3.getWeaponInfo());
        System.out.println("Armor: " + a3.getArmorInfo());
    }
}
