package oop.lab.lab6.ex2_1;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        this.begin = new Point(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    @Override
    public String toString() {
        return "Line[" +
                "begin=" + begin +
                ", end=" + end +
                ']';
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(int beginX) {
        begin.setX(beginX);
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginX(int beginX) {
        begin.setX(beginX);
    }

    public void setBeginY(int beginY) {
        begin.setY(beginY);
    }

    public void setBeginXY(int beginX, int beginY) {
        setBeginX(beginX);
        setBeginY(beginY);
    }

    public void setEndX(int endX) {
        end.setX(endX);
    }

    public void setEndY(int endY) {
        end.setY(endY);
    }

    public void setEndXY(int endX, int endY) {
        setEndX(endX);
        setEndY(endY);
    }

    public int getXDiff() {
        return begin.getX() - end.getX();
    }

    public double getYDiff() {
        return begin.getY() - end.getY();
    }

    public double getLength() {
        return Math.sqrt(getXDiff() * getXDiff() + getYDiff() * getYDiff());
    }

    public double getGradient() {
        return Math.atan2(getBeginY(), getXDiff());
    }
}
