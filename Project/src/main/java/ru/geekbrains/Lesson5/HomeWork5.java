package ru.geekbrains.Lesson5;

public class HomeWork5 {

    public static void main(String[] args) {
        Person[] persons = {
                new Person("Eremichev E.A.", "Manager", "eremichev@mail.ru", "89112432323", 300_500, 28),
                new Person("Sokolov F.N.", "Direktor", "Sokol@mail.ru", "89111232424", 400_000, 46),
                new Person("Boiko D.E.", "Security", "dark@mail.ru", "89112344242", 80_000, 50),
                new Person("Orlov P.E.", "Engineer", "orlovmen@mail.ru", "89112324665", 200_000, 41),
                new Person("Ivanov I.I.", "Seller", "ivanivan@mail.ru", "89223453421", 100_000, 21),
        };
        for (Person person : persons) {
            if (person.getAge() > 40) person.printInfo();
        }
    }
}
