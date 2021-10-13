package ru.geekbrains.Lesson9;

public class Cross implements Obstacle{
    private int dist;

    public Cross (int dist){
        this.dist = dist;
    }
    @Override
    public boolean go (Sample x) {
        return x.run(dist);
    }
}
