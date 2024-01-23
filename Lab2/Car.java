public class Car {
    public String color;
    public int speed;
    public int milage;

    public Car(String col){
        color = col;
        speed = 0;
        milage = 0;
    }

    public Car() {
    }

    public String getColor(){
        return color;
    }
    public int getSpeed(){
        return speed;
    }
    public int getMilage(){
        return milage;
    }

    public void setSpeed(int sp){
        speed = sp;
    }
    public void setMilage(int ml){
        milage = ml;
    }
}