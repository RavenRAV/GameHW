package com.company.Players;

import com.company.Ability;
import com.company.boss.Boss;

public class Magical extends Hero {
    public Magical(int health, int damage) {
        super(health, damage, Ability.BOOST);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {

        for (Hero hero : heroes) {
            hero.setDamage(hero.getDamage() + 7);

        }

    }
}
