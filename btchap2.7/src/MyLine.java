public class MyLine {
    private MyPoint start;
    private MyPoint end;

    public MyLine(MyPoint start, MyPoint end) {
        this.start = start;
        this.end = end;
    }

    public MyPoint getStart() {
        return start;
    }

    public MyPoint getEnd() {
        return end;
    }

    public double length() {
        return start.distance(end);
    }

    public boolean isHorizontal() {
        return start.getY() == end.getY();
    }

    public boolean isVertical() {
        return start.getX() == end.getX();
    }
}


