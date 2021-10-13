package ru.geekbrains.Lesson7;

public class Bowl {
        public int foodAmount;
        public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

        public void putFood(int amount) {
            this.foodAmount += amount;
        }

        public void decreaseFood(int amount) {
            this.foodAmount -= amount;
        }

        public void info() {
            System.out.println("Total food: " + foodAmount);
        }
}

