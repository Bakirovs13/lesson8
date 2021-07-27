package com.company.players;

public class Tank extends Hero{
    public Tank(int health, int damage) {
        super(health, damage,Superability.SAFE_DAMAGE_AND_REVERT);


    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

    }
}
