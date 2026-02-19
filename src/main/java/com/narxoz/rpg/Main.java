package com.narxoz.rpg;

import com.narxoz.rpg.character.GameCharacter;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.enemy.builder.BasicEnemyBuilder;
import com.narxoz.rpg.enemy.builder.EnemyBuilder;
import com.narxoz.rpg.enemy.builder.EnemyDirector;
import com.narxoz.rpg.enemy.factory.EnemyComponentFactory;
import com.narxoz.rpg.enemy.factory.Ice.IceComponentFactory;
import com.narxoz.rpg.enemy.factory.fire.FireComponentFactory;
import com.narxoz.rpg.enemy.factory.shadow.ShadowComponentFactory;
import com.narxoz.rpg.factory.*;
import com.narxoz.rpg.equipment.*;
import com.narxoz.rpg.equipment.medieval.*;
import com.narxoz.rpg.equipment.magic.*;
import com.narxoz.rpg.equipment.ranger.*;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.enemy.builder.BasicEnemyBuilder;
import com.narxoz.rpg.enemy.builder.BossEnemyBuilder;
import com.narxoz.rpg.enemy.builder.EnemyDirector;
import com.narxoz.rpg.enemy.factory.EnemyComponentFactory;
import com.narxoz.rpg.enemy.factory.*;
import com.narxoz.rpg.enemy.prototype.EnemyRegistry;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.enemy.builder.BossEnemyBuilder;
import com.narxoz.rpg.enemy.builder.BasicEnemyBuilder;
import com.narxoz.rpg.enemy.factory.*;


public class Main {

    public static void main(String[] args) {

        /*System.out.println("=== RPG Character Creation System ===\n");

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
        System.out.println("Armor: " + a3.getArmorInfo());*/
        

                FireComponentFactory fireFactory = new FireComponentFactory();
                IceComponentFactory iceFactory = new IceComponentFactory();
                ShadowComponentFactory shadowFactory = new ShadowComponentFactory();

                System.out.println("Fire factory components: " + fireFactory.createAbilities() +
                        " | Loot: " + fireFactory.createLootTable() +
                        " | AI: " + fireFactory.createAI());
                System.out.println("Ice factory components: " + iceFactory.createAbilities() +
                        " | Loot: " + iceFactory.createLootTable() +
                        " | AI: " + iceFactory.createAI());

                System.out.println("Shadow factory components: " + shadowFactory.createAbilities() +
                        " | Loot: " + shadowFactory.createLootTable() +
                        " | AI: " + shadowFactory.createAI());


                  Enemy fireDragon = new BossEnemyBuilder()
                        .setName("Ancient Fire Dragon")
                        .setHealth(50000)
                        .setDamage(500)
                        .setAbilities(fireFactory.createAbilities())
                        .setLootTable(fireFactory.createLootTable())
                        .setAI(fireFactory.createAI())
                        .addPhase(1, 50000)
                        .addPhase(2, 30000)
                        .addPhase(3, 15000)
                        .build();

                fireDragon.show();

                Enemy iceOrc = new BasicEnemyBuilder()
                        .setName("Ice Orc")
                        .setHealth(1000)
                        .setDamage(100)
                        .setAbilities(iceFactory.createAbilities())
                        .setLootTable(iceFactory.createLootTable())
                        .setAI(iceFactory.createAI())
                        .build();
                  iceOrc.show();

                Enemy shadowDemon = new BossEnemyBuilder()
                        .setName("Shadow Demon")
                        .setHealth(8000)
                        .setDamage(300)
                        .setAbilities(shadowFactory.createAbilities())
                        .setLootTable(shadowFactory.createLootTable())
                        .setAI(shadowFactory.createAI())
                        .addPhase(1, 8000)
                        .addPhase(2, 5000)
                        .build();

                shadowDemon.show();

            }
        }






