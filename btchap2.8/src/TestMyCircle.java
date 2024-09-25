public class TestMyCircle {
    public static void main(String[] args) {
        // Create instances of MyCircle
        MyCircle circle1 = new MyCircle(1, 1, 5);
        MyCircle circle2 = new MyCircle(new MyPoint(4, 5), 10);
        MyCircle circle3 = new MyCircle();

        // Print the circles
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);

        // Test getters
        System.out.println("Circle1 Center: (" + circle1.getCenterX() + ", " + circle1.getCenterY() + ")");
        System.out.println("Circle1 Radius: " + circle1.getRadius());

        // Test area and circumference
        System.out.println("Circle1 Area: " + circle1.getArea());
        System.out.println("Circle1 Circumference: " + circle1.getCircumference());

        // Test distance between circles
        System.out.println("Distance between Circle1 and Circle2: " + circle1.distance(circle2));
    }
}

