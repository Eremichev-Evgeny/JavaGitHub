package ru.geekbrains.Lesson9;

public class Cat implements Sample {
    private int maxRun;
    private int maxJump;

    public Cat (int maxRun, int maxJump){
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Cat () {
        this (1000, 10);
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

