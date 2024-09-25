public class MyCircle {
    private MyPoint center;
    private int radius;

    // Constructor with (x, y) coordinates and radius
    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    // Overloaded constructor with MyPoint and radius
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    // Default constructor
    public MyCircle() {
        this.center = new MyPoint(0, 0);
        this.radius = 1;
    }

    // Getter for center's x-coordinate
    public int getCenterX() {
        return center.getX();
    }

    // Getter for center's y-coordinate
    public int getCenterY() {
        return center.getY();
    }

    // Getter for radius
    public int getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Distance between centers
    public double distance(MyCircle another) {
        return center.distance(another.center);
    }

    @Override
    public String toString() {
        return "MyCircle[radius=" + radius + ",center=" + center.toString() + "]";
    }
}
