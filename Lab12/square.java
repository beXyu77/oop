public class square extends GeometricObject1 implements Colorable {
    private double side;

    public square(double side){
        this.side=side;
    }

    square(){
        this(0);
    }

    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side=side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}