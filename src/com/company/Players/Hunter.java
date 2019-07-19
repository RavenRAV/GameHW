package com.company.Players;

import com.company.Ability;
import com.company.boss.Boss;

import java.util.Random;

public class Hunter extends Hero {
    public Hunter(int health, int damage) {
        super(health, damage, Ability.CRITICAL_DAMAGE);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        Random r = new Random();
        setDamage(getDamage()*r.nextInt(2)+2);}
        /*for (Hero hero:heroes) {
            if(hero.getAbility() == Ability.CRITICAL_DAMAGE){
                hero.setDamage(hero.getDamage() * (r.nextInt(2)+2));
            }

        }
    }


    /*{
        Random r = new Random();
        int randomNamber = r.nextInt(4 - 1) + 1;
        heroes[3].setDamage(heroes[3].getDamage() * randomNamber);


    }*/
}
