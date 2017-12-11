package univer.epam.java.task3.figures.colored;

import univer.epam.java.task3.figures.Figure;
import univer.epam.java.task3.figures.uncolored.Line;

public class ColorLine extends Line implements Figure {

    public ColorLine(ColorPoint begin, ColorPoint end) {
        super(begin, end);
    }

    @Override
    public String toString() {
        return "ColorLine [Begin = " + getBegin() + ", End = " + getEnd() +
                ", Length = " + getLineLength(getBegin(), getEnd()) + "]";
    }
}