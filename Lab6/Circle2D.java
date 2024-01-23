package OOP.Lab6;

public class Circle2D {
    double x;
    double y;
    double radius;
    
    public Circle2D(){
        this(0,0,1);
    }

    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
}
