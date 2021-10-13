package ru.geekbrains.Lesson6;

public class HomeWork6 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Max"),
                new Dog("Rex", 1500, 10),
        };

        for (Animal x : animals) {
            x.run(300);
            x.swim(10);
            x.run(500);
            x.swim(15);
            x.run(1500);
            x.swim(20);

        }


        System.out.println("final " + Cat.getCounter() + " Cats");
        System.out.println("final " + Dog.getCounter() + " Dogs");
        System.out.println("final " + Animal.getCounter() + " Animals");
        };
}
