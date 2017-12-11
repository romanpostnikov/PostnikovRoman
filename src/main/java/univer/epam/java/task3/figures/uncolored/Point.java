package univer.epam.java.task3.figures.uncolored;

import univer.epam.java.task3.figures.Figure;

public class Point implements Figure {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point [X = " + getX() + ", Y = " + getY() + "]";
    }
}
