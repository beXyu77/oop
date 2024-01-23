package OOP.Lab7;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }

    public void setMake(String make){
    }
    public void setModel(String model){
    }
    public void setYear(int year){
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public String toString(){
        return "Car: " + getMake() +"\nModel: " + getModel() + "\nYear: " + getYear();
    }

    public boolean isAntique(){
        if(year>45){
            return true;
        }
        return false;
    }
    
}
