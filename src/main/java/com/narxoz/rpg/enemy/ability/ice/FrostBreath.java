package com.narxoz.rpg.enemy.ability.ice;

import com.narxoz.rpg.enemy.ability.Ability;

public class FrostBreath implements Ability{

        private final String name = "Frost Breath";
        private final int damage = 40;
        private final String description = "Deals damage and slows enemy";



        @Override
        public String getName() {
            return name;
        }

        @Override
        public int getDamage() {
            return damage;
        }

        @Override
        public String getDescription() {
            return description;
        }

        @Override
        public Ability clone() {
            try {
                return (Ability) super.clone();
            }catch (CloneNotSupportedException e){
                throw new RuntimeException(e);
            }
        }
    }

