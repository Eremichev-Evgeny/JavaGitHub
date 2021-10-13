package ru.geekbrains.Lesson9;

public class HomeWork9 {
    public static void main(String[] args) {
        Sample[] samples = {
                new Human(),
                new Robot(),
                new Cat()
        };
        Obstacle[] obstacles = {
                new Cross(1000),
                new Wall(10)
        };

        for (Sample x : samples) {
            for (Obstacle y : obstacles) {
                if (!y.go(x)) {
                    break;
                }
            }
        }
    }
}
