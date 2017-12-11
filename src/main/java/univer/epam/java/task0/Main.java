package univer.epam.java.task0;


import univer.epam.java.task0.figures.Rectangle;
import univer.epam.java.task0.figures.Rhombus;
import univer.epam.java.task0.figures.Triangle;

public class Main {
    public static void main(String[] args) {
        Rectangle.rectangleDraw(3, 6);
        Rectangle.rectangleDraw(5, 10);
        Triangle.triangleDraw(3);
        Triangle.triangleDraw(5);
        Rhombus.rhombusDraw(3);
        Rhombus.rhombusDraw(5);
    }
}
