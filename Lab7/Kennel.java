package OOP.Lab7;

public class Kennel {
    public static void main(String[] args){
        Dog a1 = new Dog("Teddy",5);

        System.out.println(a1.toString());
        System.out.println("After 3 years change name and age of first Dog object.");

        Dog a2 = new Dog("Milo", 8);
        System.out.println(a2.toString());
        System.out.println("Display Milo information by getter methods.");

        System.out.println("Dog: " + a2.getName() + "\tAge: " + a2.getAge() + "\tPerson-Years: " +a2.getPersonAge());


        
    }
}
