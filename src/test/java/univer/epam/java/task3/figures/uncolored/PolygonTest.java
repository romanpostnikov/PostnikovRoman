package univer.epam.java.task3.figures.uncolored;

import junit.framework.TestCase;

public class PolygonTest extends TestCase {
    public void testGetPolygonArea() throws Exception {
        System.out.println("Getting polygon area");
        Point[] polyTest = new Point[5];
        polyTest[0] = new Point(3, 4);
        polyTest[1] = new Point(5, 11);
        polyTest[2] = new Point(12, 8);
        polyTest[3] = new Point(9, 5);
        polyTest[4] = new Point(5, 6);
        Polygon testPolygon = new Polygon(polyTest);
        double expResult = 30.0;
        double result = testPolygon.getPolygonArea(polyTest);
        assertEquals(expResult, result);
    }

}