package ru.geekbrains.Lesson9;

import java.util.concurrent.locks.Condition;

public class Human implements Sample {
    private int maxRun;
    private int maxJump;

    public Human (int maxRun, int maxJump){
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Human () {
        this (10000, 20);
    }
    @Override
    public boolean run (int dist){
        if (dist < maxRun){
            System.out.println("Cмог пробежать" + dist + " метров ");
            return true;
        } else {
            System.out.println("Не смог пробежать" + dist + " метров ");
            return false;
        }
    }
    @Override
    public boolean jump (int dist) {
        if (dist < maxJump) {
            System.out.println("Cмог пробежать" + dist + " метров ");
            return true;
        } else {
            System.out.println("Не смог пробежать" + dist + " метров ");
            return false;
        }
    }
}
