package OOP.Lab5;

public class TestMyPoint{
    public static void main(String[] args) {
		MyPoint point1 = new MyPoint();
		MyPoint point2 = new MyPoint(10,30.5);

		// Display the distance between point1 and point2
		System.out.println("The distance from object method is: " + point1.distance(point2));
	}
}