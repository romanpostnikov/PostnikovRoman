package univer.epam.java.task3.figures.colored;

import univer.epam.java.task3.figures.Figure;
import univer.epam.java.task3.figures.uncolored.Point;

public class ColorPoint extends Point implements Figure {
    private int color;

    public ColorPoint(int x, int y, int color){
        super(x, y);
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorPoint [Color = " + color + ", X = " + getX() + ", Y = " + getY() + "]";
    }
}