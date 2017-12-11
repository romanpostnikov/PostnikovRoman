package univer.epam.java.task3.figures.uncolored;

import univer.epam.java.task3.figures.Figure;

public class Triangle implements Figure {
    private Point apexA, apexB, apexC;

    public Triangle(Point apexA, Point apexB, Point apexC) {
        {
            this.apexA = apexA;
            this.apexB = apexB;
            this.apexC = apexC;
        }
    }

    public double getTriangleArea(Point apexA, Point apexB, Point apexC) {
        return 0.5 * Math.abs(apexA.getX() * apexB.getY() + apexB.getX() * apexC.getY() +
                apexC.getX() * apexA.getY() - apexB.getX() * apexA.getY() - apexC.getX() * apexB.getY() -
                apexA.getX() * apexC.getY());
    }

    public double getTrianglePerimeter(Point apexA, Point apexB, Point apexC) {
        return Math.sqrt((apexA.getX() - apexB.getX()) * (apexA.getX() - apexB.getX())
                + (apexA.getY() - apexB.getY()) * (apexA.getY() - apexB.getY())) +
                Math.sqrt((apexB.getX() - apexC.getX()) * (apexB.getX() - apexC.getX())
                        + (apexB.getY() - apexC.getY()) * (apexB.getY() - apexC.getY())) +
                Math.sqrt((apexC.getX() - apexA.getX()) * (apexC.getX() - apexA.getX())
                        + (apexC.getY() - apexA.getY()) * (apexC.getY() - apexA.getY()));
    }

    public Point getApexA() {
        return apexA;
    }

    public void setApexA(Point apexA) {
        this.apexA = apexA;
    }

    public Point getApexB() {
        return apexB;
    }

    public void setApexB(Point apexB) {
        this.apexB = apexB;
    }

    public Point getApexC() {
        return apexC;
    }

    public void setApexC(Point apexC) {
        this.apexC = apexC;
    }

    @Override
    public String toString() {
        if (getTriangleArea(apexA, apexB, apexC) != 0) {
            return "Triangle [ApexA = " + apexA + ", ApexB = " + apexB + ", ApexC = " + apexC +
                    ", Area = " + getTriangleArea(apexA, apexB, apexC) +
                    ", Perimeter = " + getTrianglePerimeter(apexA, apexB, apexC) + "]";
        } else {
            return "Triangle [ApexA = " + apexA + ", ApexB = " + apexB + ", ApexC = " + apexC +
                    ", such triangle can't exist]";
        }

    }
}
