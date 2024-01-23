package OOP.Lab10;

public class TriangleWithException {
    double side1, side2, side3;

    public TriangleWithException(double side1, double side2, double side3) throws IllegalTriangleException{
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1){
            throw new IllegalTriangleException(side1, side2, side3, 
            "The sum of any two sides is greater than the other sides");
        }
    }

    public double getArea(){
        double s = (side1 + side2 + side3)/2;
        return Math.sqrt(s* (s-side1) *(s-side2) *(s-side3));
    }

    public double getPrimeter(){
        return side1 + side2 + side3;
    }
}