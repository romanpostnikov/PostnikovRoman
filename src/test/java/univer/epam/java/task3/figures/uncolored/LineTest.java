package univer.epam.java.task3.figures.uncolored;

import junit.framework.TestCase;
import org.junit.Test;

public class LineTest extends TestCase {

    @Test
    public void testGetLineLength() throws Exception {
        System.out.println("Getting line length");
        Point x = new Point(-2, -2);
        Point y = new Point(6, -2);
        Line testLine = new Line(x, y);
        double expResult = 8.0;
        double result = testLine.getLineLength(x, y);
        assertEquals(expResult, result);
    }

}