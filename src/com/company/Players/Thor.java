package com.company.Players;

import com.company.Ability;
import com.company.boss.Boss;

import java.util.Random;

public class Thor extends Hero {
    public Thor(int health, int damage) {
        super(health, damage, Ability.BUSH);
    }

    public void useAbility(Hero[] heroes, Boss boss) {
        Random r = new Random();
        if(r.nextInt(1)==1){
            System.out.println("Thor apply");
            boss.setDamage(0);
        } else {
            boss.setDamage(30);
        }
        /*int randomNamber = r.nextInt(2);
        if (randomNamber < 1) {
            boss.setDamage(boss.getDamage() - boss.getDamage());
        }*/


    }

}