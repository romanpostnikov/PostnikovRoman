package univer.epam.java.task3.figures.uncolored;

import univer.epam.java.task3.figures.Figure;

import java.util.Arrays;

import static univer.epam.java.task3.service.FigureService.pointsArrayGenerator;

public class Polygon implements Figure {
    private Point[] inputPoints = new Point[20];

    public Polygon(Point[] inputPoints) {
        this.inputPoints = inputPoints;
    }

    public double getPolygonArea(Point[] inputPoints){
        double positiveResult = 0;
        double negativeResult = 0;
        int n = inputPoints.length;

        for (int i = 0; i < n - 1 ; i++) {
            positiveResult += inputPoints[i].getX() * inputPoints[i+1].getY();
            negativeResult -= inputPoints[i+1].getX() * inputPoints[i].getY();
        }

        return 0.5 * Math.abs(positiveResult + negativeResult +
                inputPoints[n-1].getX() * inputPoints[1].getY() -
                inputPoints[1].getX() * inputPoints[n-1].getY());

    }

    public Point[] getInputPoints() {
        return inputPoints;
    }

    public void setInputPoints(Point[] inputPoints) {
        this.inputPoints = inputPoints;
    }

    @Override
    public String toString() {
        if (getPolygonArea(inputPoints) != 0) {
            return "Polygon [Apexes = " + Arrays.toString(inputPoints) + ", Area = " + getPolygonArea(inputPoints) + "]";
        } else {
            return "Polygon [Apexes = " + Arrays.toString(inputPoints) + ", such polygon can't exist]";
        }
    }
}
