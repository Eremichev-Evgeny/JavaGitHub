package ru.geekbrains.Lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("задание 1. метод main");
        System.out.println();
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("задание 2. метод printThreeWords");
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
        System.out.println();
    }
    public static void checkSumSign() {
        System.out.println("задание 3. метод checkSumSign");
        int a = 100;
        int b = 200;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        System.out.println();
    }
    public static void printColor() {
        System.out.println("задание 4. метод printColor");
        int value = 99;
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        else if (value > 100) {
            System.out.println("Зеленый");
        }
        System.out.println();
    }
    public static void compareNumbers() {
        System.out.println("задание 5. метод compareNumbers");
        int a = 350;
        int b = 430;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}

