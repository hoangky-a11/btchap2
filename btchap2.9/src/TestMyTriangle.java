public class TestMyTriangle {
    public static void main(String[] args) {
        // Create MyTriangle instances
        MyTriangle triangle1 = new MyTriangle(0, 0, 3, 0, 3, 4);
        MyTriangle triangle2 = new MyTriangle(new MyPoint(0, 0), new MyPoint(5, 0), new MyPoint(0, 5));
        MyTriangle triangle3 = new MyTriangle(0, 0, 4, 4, 0, 4); // Isosceles triangle

        // Test the first triangle
        System.out.println(triangle1);
        System.out.println("Perimeter of Triangle 1: " + triangle1.getPerimeter());
        triangle1.printType();

        // Test the second triangle
        System.out.println(triangle2);
        System.out.println("Perimeter of Triangle 2: " + triangle2.getPerimeter());
        triangle2.printType();

        // Test the third triangle
        System.out.println(triangle3);
        System.out.println("Perimeter of Triangle 3: " + triangle3.getPerimeter());
        triangle3.printType();
    }
}

