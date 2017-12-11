package univer.epam.java.task3.service;

import univer.epam.java.task3.figures.Figure;
import univer.epam.java.task3.figures.colored.ColorLine;
import univer.epam.java.task3.figures.colored.ColorPoint;
import univer.epam.java.task3.figures.colored.ColorPolygon;
import univer.epam.java.task3.figures.colored.ColorTriangle;
import univer.epam.java.task3.figures.uncolored.Line;
import univer.epam.java.task3.figures.uncolored.Point;
import univer.epam.java.task3.figures.uncolored.Polygon;
import univer.epam.java.task3.figures.uncolored.Triangle;

import java.util.Random;

public class FigureService {
    public static Figure[] figureGenerator(int n) {
        Figure[] figures = new Figure[n];
        Random r = new Random();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = nextFigure(r.nextInt(8));
        }
        return figures;
    }

    private static Figure nextFigure(int key) {
        switch (key) {
            case 0:
                return new Point(rand(-30, 30), rand(-30, 30));
            case 1:
                return new ColorPoint(rand(-30, 30), rand(-30, 30), rand(0, 16777215));
            case 2:
                return new Line(new Point(rand(-30, 30), rand(-30, 30)),
                        new Point(rand(-30, 30), rand(-30, 30)));
            case 3:
                return new ColorLine(new ColorPoint(rand(-30, 30), rand(-30, 30), rand(0, 16777215)),
                        new ColorPoint(rand(-30, 30), rand(-30, 30), rand(0, 16777215)));
            case 4:
                return new Triangle(new Point(rand(-30, 30), rand(-30, 30)),
                        new Point(rand(-30, 30), rand(-30, 30)),
                        new Point(rand(-30, 30), rand(-30, 30)));
            case 5:
                return new ColorTriangle(new ColorPoint(rand(-30, 30), rand(-30, 30), rand(0, 16777215)),
                        new ColorPoint(rand(-30, 30), rand(-30, 30), rand(0, 16777215)),
                        new ColorPoint(rand(-30, 30), rand(-30, 30), rand(0, 16777215)));
            case 6:
                return new Polygon(pointsArrayGenerator(rand(4, 20)));
            case 7:
                return new ColorPolygon(colorPointsArrayGenerator(rand(4, 20)));
            default:
                return null;
        }
    }

    private static int rand(int min, int max) {
        return (int) (min + Math.random() * (max - min));
    }

    public static Point[] pointsArrayGenerator(int n) {
        Point[] pointsArray = new Point[n];

        for (int i = 0; i < pointsArray.length; i++) {
            pointsArray[i] = new Point(rand(-30, 30), rand(-30, 30));

        }

        return pointsArray;
    }

    public static ColorPoint[] colorPointsArrayGenerator(int n) {
        ColorPoint[] colorPointsArray = new ColorPoint[n];

        for (int i = 0; i < colorPointsArray.length; i++) {
            colorPointsArray[i] = new ColorPoint(rand(-30, 30), rand(-30, 30), rand(0, 16777215));

        }

        return colorPointsArray;
    }

    public static void figuresSortByClass(Figure[] figures) {
        int pointCounter = 0;
        int colorPointCounter = 0;
        int lineCounter = 0;
        int colorLineCounter = 0;
        int triangleCounter = 0;
        int colorTriangleCounter = 0;
        int polygonCounter = 0;
        int colorPolygonCounter = 0;

        Figure[] point = new Point[figures.length];
        Figure[] colorPoint = new ColorPoint[figures.length];
        Figure[] line = new Line[figures.length];
        Figure[] colorLine = new ColorLine[figures.length];
        Figure[] triangle = new Triangle[figures.length];
        Figure[] colorTriangle = new ColorTriangle[figures.length];
        Figure[] polygon = new Polygon[figures.length];
        Figure[] colorPolygon = new ColorPolygon[figures.length];


        for (Figure figure : figures) {
            if (figure.getClass().equals(Point.class)) {
                point[pointCounter++] = figure;
            } else if (figure.getClass().equals(ColorPoint.class)) {
                colorPoint[colorPointCounter++] = figure;
            } else if (figure.getClass().equals(Line.class)) {
                line[lineCounter++] = figure;
            } else if (figure.getClass().equals(ColorLine.class)) {
                colorLine[colorLineCounter++] = figure;
            } else if (figure.getClass().equals(Triangle.class)) {
                triangle[triangleCounter++] = figure;
            } else if (figure.getClass().equals(ColorTriangle.class)) {
                colorTriangle[colorTriangleCounter++] = figure;
            } else if (figure.getClass().equals(Polygon.class)) {
                polygon[polygonCounter++] = figure;
            } else if (figure.getClass().equals(ColorPolygon.class)) {
                colorPolygon[colorPolygonCounter++] = figure;
            }
        }

        System.out.println("\nPoint array");
        printArray(point);
        System.out.println("\nColorPoint array");
        printArray(colorPoint);
        System.out.println("\nLine array");
        printArray(line);
        System.out.println("\nColorLine array");
        printArray(colorLine);
        System.out.println("\nTriangle array");
        printArray(triangle);
        System.out.println("\nColorTriangle array");
        printArray(colorTriangle);
        System.out.println("\nPolygon array");
        printArray(polygon);
        System.out.println("\nColorPolygon array");
        printArray(colorPolygon);
    }

    public static void printArray(Figure[] figures) {
        for (Figure figure : figures) {
            if (figure != null)
                System.out.println(figure);
        }

    }
}