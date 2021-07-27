package com.company.players;

public class GameEntity {
    private  int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    private int damage;

    public GameEntity(int health,int damage){
        this.damage=damage;
        this.health = health;

    }
}
