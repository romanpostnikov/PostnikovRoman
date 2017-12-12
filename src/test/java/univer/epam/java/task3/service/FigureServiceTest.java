package univer.epam.java.task3.service;

import junit.framework.TestCase;
import univer.epam.java.task3.figures.Figure;
import univer.epam.java.task3.figures.colored.ColorPoint;
import univer.epam.java.task3.figures.uncolored.Point;

public class FigureServiceTest extends TestCase {
    public void testFigureGenerator() throws Exception {
        Figure[] testFigures = FigureService.figureGenerator(10);
        for(Figure figure : testFigures){
            assertNotNull(figure);
        }
    }

    public void testPointsArrayGenerator() throws Exception {
        Point[] testPoints = FigureService.pointsArrayGenerator(10);
        for(Point point : testPoints){
            assertNotNull(point);
        }
    }

    public void testColorPointsArrayGenerator() throws Exception {
        ColorPoint[] testColorPoints = FigureService.colorPointsArrayGenerator(10);
        for(ColorPoint colorPoint : testColorPoints){
            assertNotNull(colorPoint);
        }
    }

}