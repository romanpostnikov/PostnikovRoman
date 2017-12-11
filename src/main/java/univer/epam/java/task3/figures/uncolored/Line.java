package univer.epam.java.task3.figures.uncolored;

import univer.epam.java.task3.figures.Figure;

public class Line implements Figure {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public double getLineLength(Point begin, Point end){
        return Math.sqrt((begin.getX() - end.getX()) * (begin.getX() - end.getX())
                + (begin.getY() - end.getY()) * (begin.getY() - end.getY()));
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line [Begin = " + getBegin() + ", End = " + getEnd() + ", Length = " + getLineLength(begin, end) + "]";
    }
}
