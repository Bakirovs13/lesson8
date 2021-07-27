package com.company.players;

public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage,Superability.BOOST);


    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

    }
}
