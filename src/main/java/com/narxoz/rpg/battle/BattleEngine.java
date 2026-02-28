package com.narxoz.rpg.battle;

import com.narxoz.rpg.adapter.Combatant;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class BattleEngine {

    private static BattleEngine instance;
    private Random random = new Random();

    private BattleEngine() {}

    public static BattleEngine getInstance() {
        if (instance == null) {
            instance = new BattleEngine();
        }
        return instance;
    }

    public BattleEngine setRandomSeed(long seed) {
        random.setSeed(seed);
        return this;
    }

    public void reset() {
        random = new Random();
    }

    public EncounterResult runEncounter(List<Combatant> teamA, List<Combatant> teamB) {

        int round = 1;

        while (!teamA.isEmpty() && !teamB.isEmpty()) {
            System.out.println("\n=== ROUND " + round + " ===");

            attackPhase(teamA, teamB);
            removeDead(teamB);

            if (teamB.isEmpty()) break;

            attackPhase(teamB, teamA);
            removeDead(teamA);

            round++;
        }

        String winner = teamA.isEmpty() ? "Team B" : "Team A";
        return new EncounterResult(winner);
    }

    private void attackPhase(List<Combatant> attackers, List<Combatant> defenders) {
        for (Combatant attacker : attackers) {
            if (defenders.isEmpty()) break;

            Combatant target = defenders.get(random.nextInt(defenders.size()));

            int damage = attacker.getAttackPower();

            System.out.println(attacker.getName() +
                    " attacks " + target.getName() +
                    " for " + damage);

            target.takeDamage(damage);
        }
    }
    private void removeDead(List<Combatant> team) {
        Iterator<Combatant> it = team.iterator();

        while (it.hasNext()) {
            Combatant c = it.next();
            if (!c.isAlive()) {
                System.out.println(c.getName() + " died!");
                it.remove();
            }
        }
    }
}
