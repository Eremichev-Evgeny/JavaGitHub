package ru.geekbrains.Lesson9;

public class Wall implements Obstacle {
    private int height;

    public Wall (int height) {
        this.height = height;
    }
    @Override
    public boolean go (Sample x){
        return x.jump(height);
    }

}
