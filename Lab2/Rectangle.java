
public class Rectangle {
    float height;
    float width;

    public Rectangle(float ht,float wt){
        height = ht;
        width = wt;
    }

    public float getHeight(){
        return height;
    }
    public float getWidth(){
        return width;
    }

    float getArea() {
        return height*width;
    }
    float getPerimeter() {
        return 2*(height+width);
    }
}
