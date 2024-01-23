package OOP.Lab10;

public class testTriangle {
    public static void main(String[] args) {
        try{
            TriangleWithException t1 = new TriangleWithException(3, 4, 5);
            System.out.println("Perimeter for t1: " + t1.getPrimeter());
            System.out.println("Area for t1: " + t1.getArea());

            TriangleWithException t2 = new TriangleWithException(1, 2, 3);
            System.out.println("Perimeter for t2: " + t2.getPrimeter());
            System.out.println("Area for t2: " + t2.getArea());
        }
        catch(IllegalTriangleException a){
            System.out.println("\nIllegal triangle");
            System.out.println("Side1: " + a.getSide1());
            System.out.println("Side2: " + a.getSide2());
            System.out.println("Side3: " + a.getSide3());
        }
    }
}
