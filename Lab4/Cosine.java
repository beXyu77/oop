package OOP.Lab4;

public class Cosine {
    public static void main(String[] args){
        java.util.Random random2 = new java.util.Random();

        int a = random2.nextInt(20,40);

        System.out.println("The sine of " + a + " is " + Math.sin(a));
        System.out.println("The cosine of " + a + " is " + Math.cos(a));
        System.out.println("The tangent of " + a + " is " + Math.tan(a));
    }
}
