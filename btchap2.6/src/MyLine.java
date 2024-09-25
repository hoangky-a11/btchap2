public class MyLine {
    private MyPoint startPoint;
    private MyPoint endPoint;

    public MyLine(MyPoint startPoint, MyPoint endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double length() {
        return startPoint.distance(endPoint);
    }

    @Override
    public String toString() {
        return "MyLine[start=" + startPoint + ",end=" + endPoint + "]";
    }
}

