package univer.epam.java.task3.figures.uncolored;

import junit.framework.TestCase;

public class TriangleTest extends TestCase {
    public void testGetTriangleArea() throws Exception {
        System.out.println("Testing triangle area method");
        Point a = new Point(2, 1);
        Point b = new Point(4, 5);
        Point c = new Point(7, 8);
        Triangle triangle = new Triangle(a, b, c);
        double expResult = 3.0;
        double result = triangle.getTriangleArea(a, b, c);
        assertEquals(expResult, result);

    }

    public void testGetTrianglePerimeter() throws Exception {
        System.out.println("Testing triangle perimeter method");
        Point a = new Point(2, 1);
        Point b = new Point(4, 5);
        Point c = new Point(7, 8);
        Triangle triangle = new Triangle(a, b, c);
        double expResult = 17.317;
        double result = triangle.getTrianglePerimeter(a, b, c);
        assertEquals(expResult, result, 0.001);
    }

}