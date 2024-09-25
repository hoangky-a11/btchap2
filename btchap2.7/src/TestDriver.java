public class TestDriver {
    public static void main(String[] args) {
        // Create two points
        MyPoint point1 = new MyPoint(1.0, 2.0);
        MyPoint point2 = new MyPoint(4.0, 6.0);

        // Create a line using those points
        MyLine line = new MyLine(point1, point2);

        // Test methods
        System.out.println("Start Point: (" + line.getStart().getX() + ", " + line.getStart().getY() + ")");
        System.out.println("End Point: (" + line.getEnd().getX() + ", " + line.getEnd().getY() + ")");

        System.out.println("Length of Line: " + line.length());

        System.out.println("Is Horizontal? " + line.isHorizontal());
        System.out.println("Is Vertical? " + line.isVertical());

        // Testing with horizontal and vertical lines
        MyLine horizontalLine = new MyLine(new MyPoint(1.0, 3.0), new MyPoint(4.0, 3.0));
        System.out.println("Horizontal Line Length: " + horizontalLine.length());

        System.out.println("Is Horizontal? " + horizontalLine.isHorizontal());

        MyLine verticalLine = new MyLine(new MyPoint(5.0, 1.0), new MyPoint(5.0, 4.0));
        System.out.println("Vertical Line Length: " + verticalLine.length());

        System.out.println("Is Vertical? " + verticalLine.isVertical());
    }
}
