package com.company.players;

public abstract class Hero extends GameEntity implements HavingSuperAbility{

    private Superability superability;

    public Hero(int health, int damage, Superability heal) {
        super(health, damage);
        this.superability = superability;
    }

    public Superability getSuperability() {
        return superability;
    }

    public void setSuperability(Superability superability) {
        this.superability = superability;
    }
}
