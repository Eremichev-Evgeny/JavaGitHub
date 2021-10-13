package ru.geekbrains.Lesson7;

public class Cat {
    public String name;
    public int appetite;
    public boolean full;


    public Cat(String name, int appetite, boolean full) {
        this.name = name;
        this.appetite = appetite;
        this.full = full;
    }

    public void eat(Bowl x) {x.decreaseFood(appetite);}
}
