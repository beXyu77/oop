package OOP.Lab13;

public class Lab13_2 {
    public static void main(String[] args) {
        Circle a = new Circle(6);
        Circle b = new Circle(6);
        
        int c = a.compareTo(b);
        boolean d = a.equals(b);
        
        System.out.println(c);
        System.out.println(d);
    }
}