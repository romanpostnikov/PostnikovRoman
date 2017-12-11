package univer.epam.java.task3.figures.colored;

import univer.epam.java.task3.figures.Figure;
import univer.epam.java.task3.figures.uncolored.Point;
import univer.epam.java.task3.figures.uncolored.Polygon;

import java.util.Arrays;

public class ColorPolygon extends Polygon implements Figure {

    public ColorPolygon(ColorPoint[] inputPoints) {
        super(inputPoints);
    }

    @Override
    public String toString() {
        if (getPolygonArea(getInputPoints()) != 0) {
            return "ColorPolygon [Apexes = " + Arrays.toString(getInputPoints()) +
                    ", Area = " + getPolygonArea(getInputPoints()) + "]";
        } else {
            return "ColorPolygon [Apexes = " + Arrays.toString(getInputPoints()) + ", such polygon can't exist]";
        }
    }
}
