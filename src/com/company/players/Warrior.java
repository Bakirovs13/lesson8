package com.company.players;

public class Warrior extends Hero {

    public Warrior(int health, int damage) {
        super(health, damage,Superability.CRITICAL_DAMAGE);


    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

    }
}
