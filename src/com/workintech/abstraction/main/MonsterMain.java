package com.workintech.abstraction.main;

import com.workintech.abstraction.game.Monster;
import com.workintech.abstraction.game.Troll;

public class MonsterMain {
    public static void main(String[] args) {
        Monster troll = new Troll("troll", 500, 40);
        System.out.println("Name: " + troll.getName() + " - Attack: " + troll.attack());
    }
}
