public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();  // Default constructor
        System.out.println(p1);      // toString()

        p1.setX(8);
        p1.setY(6);
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());

        MyPoint p2 = new MyPoint(0, 4);  // Another constructor
        System.out.println(p2);

        System.out.println("Distance from p1 to p2: " + p1.distance(p2));
        System.out.println("Distance from p1 to (5, 6): " + p1.distance(5, 6));
        System.out.println("Distance from p1 to origin: " + p1.distance());
    }
}
