public class MyCar {
    public static void main(String[] args){
        Car Toyota = new Car();
        Car Honda = new Car();

        Toyota.color = "red";
        Toyota.setSpeed(200);
        Toyota.setMilage(1345);

        System.out.print("Toyota color: " + Toyota.color);
        System.out.print(" speed: " + (int)Toyota.getSpeed());
        System.out.print(" Milage: " + (int)Toyota.getMilage());

        Honda.color = "blue";
        Honda.setSpeed(300);
        Honda.setMilage(8987);

        System.out.println();
        System.out.print("Honda color: " + Honda.color);
        System.out.print(" speed: " + (int)Honda.getSpeed());
        System.out.print(" milage: " + (int)Honda.getMilage());
    }
}
