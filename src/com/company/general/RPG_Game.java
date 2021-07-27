package com.company.general;

import com.company.players.*;

public class RPG_Game {

    Boss boss = new Boss(400,50);
    Warrior warrior = new Warrior(250,10);
    Medic medic = new Medic(250,10,15);
    Tank tank = new Tank(250,10);
    Magic magic = new Magic(250,10);

    Hero[] heroes = {warrior,medic,magic,tank};

    private static boolean isFinished(Boss boss ,Hero[] heroes){
        if (boss.getHealth()<=0){
            System.out.println("Hero won!");
            return true;

        }
        boolean allHeroesdead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() >0){
                allHeroesdead = false;
                break;
            }

        }
        if(allHeroesdead){
            System.out.println("Boss won!");
        }
        return allHeroesdead;

    }
}
