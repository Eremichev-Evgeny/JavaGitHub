package ru.geekbrains.Lesson2;

public class HomeWorkTwo {
    public static void main(String[] args) {
        printTask1(8, 9 );
        printTask2(6);
        printTask3(-1);
        printTask4();
        printTask5(2021);
    }

    public static boolean printTask1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public static void printTask2(int a) {
        if (a >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }

    public static boolean printTask3(int x){
        if (x >= 0) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }

    }

    public static void printTask4() {
        for (int y = 0; y < 10; y++) {
            System.out.println("котики");
        }
    }

    public static boolean printTask5(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
        } else if (year % 400 == 0) {
            System.out.println("висакосный");
            return true;
        }
        System.out.println("невисакосный");
        return false;
    }
}