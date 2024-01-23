public class Lab12_02 {
    public static void main(String[] args) {
        GeometricObject1[] object = {new square(2),new square(3),new square(4)};

        for(int i=0; i<object.length; i++){
            System.out.println("Area is " + object[i].getArea());
            if(object[i] instanceof Colorable)
                ((Colorable)object[i]).howToColor();
        }
    }
}
