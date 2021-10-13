package ru.geekbrains.Lesson6;

public class Cat extends Animal{
    private static final int Maximum_RUN = 500;
    private static int counter;

    Cat(String name) {
        super("Cat", name, Maximum_RUN, 0);
        counter++;
    }

    public boolean swim(int distance) {
        System.out.println(getName() + " won't swim!");
        return false;
    }

    public static int getCounter() {
        return counter;
    }
}
