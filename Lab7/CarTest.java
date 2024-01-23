package OOP.Lab7;

public class CarTest {
    public static void main(String[] args){
        Car c1 = new Car("Toyota","Corola",2000);
        Car c2 = new Car("Honda","Jazz",2010);
        
        System.out.println(c1.toString());
        System.out.println("\n" + c2.toString());
    }  
}
