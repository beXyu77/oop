public class MyRectangle {
    public static void main(String[] args){
        Rectangle square = new Rectangle(5,5);

        System.out.println("square " + (int)square.getHeight() + " x " + (int)square.getWidth());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println();

        Rectangle non_square = new Rectangle(8,5);
        System.out.println("square " + (int)non_square.getHeight() + " x " + (int)non_square.getWidth());
        System.out.println("Area: " + non_square.getArea());
        System.out.println("Perimeter: " + non_square.getPerimeter());
    }
}