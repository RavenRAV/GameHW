package com.company.Players;

import com.company.Ability;
import com.company.GameEntity;

public abstract class Hero extends GameEntity implements HavingAbility{

    private Ability ability;

    public Hero(int health, int damage, Ability ability) {
        super(health, damage);
        this.ability=ability;
    }

    public Ability getAbility() {
        return ability;
    }

}
