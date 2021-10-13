package ru.geekbrains.Lesson7;

import java.util.Scanner;

public class HomeWork6 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int does;
        Cat [] cats = new Cat [6];
        cats [0] = new Cat("Barsik", 0, true);
        cats [1] = new Cat("Murzik", 15, false);
        cats [2] = new Cat("Max", 20, false);
        cats [3] = new Cat("Tedd", 15, false);
        cats [4] = new Cat("Ford", 0, true);
        cats [5] = new Cat("Milk", 15, false);


        Bowl bowl = new Bowl(70);
        bowl.info();
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].full == false && cats[i].appetite < bowl.foodAmount) {
                cats[i].eat(bowl);
                cats[i].full = true;
                System.out.println("Cat "  + cats[i].name + " - eat");
            } else {
                System.out.println("Cat " + cats[i].name + " - didn't eat");
            }
        }
        bowl.info();
        System.out.println("How much more food to add?");
        does = sc.nextInt();
        bowl.putFood(does);
        bowl.info();

    }
}