package univer.epam.java.task3.figures.colored;

import univer.epam.java.task3.figures.Figure;
import univer.epam.java.task3.figures.uncolored.Triangle;

public class ColorTriangle extends Triangle implements Figure {

    public ColorTriangle(ColorPoint apexA, ColorPoint apexB, ColorPoint apexC) {
        super(apexA, apexB, apexC);
    }

    @Override
    public String toString() {
        if (getTriangleArea(getApexA(), getApexB(), getApexC()) != 0) {
            return "ColorTriangle [ApexA = " + getApexA() + ", ApexB = " + getApexB() + ", ApexC = " + getApexC() +
                    ", Area = " + getTriangleArea(getApexA(), getApexB(), getApexC()) +
                    ", Perimeter = " + getTrianglePerimeter(getApexA(), getApexB(), getApexC()) + "]";
        } else {
            return "ColorTriangle [ApexA = " + getApexA() + ", ApexB = " + getApexB() + ", ApexC = " + getApexC() +
                    ", such triangle can't exist]";
        }

    }
}
