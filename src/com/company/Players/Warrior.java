package com.company.Players;

import com.company.Ability;
import com.company.boss.Boss;

public class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, Ability.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        if(boss.getHealth()>0){
           boss.setHealth(boss.getHealth() - boss.getDamage());
        //heroes[0].setDamage(boss.getDamage() + heroes[0].getDamage());
        }

    }
}
