package OOP.Lab4;

public class Random {
    public static void main(String[] args){
        java.util.Random random1 = new java.util.Random(1000);

        for (int i = 0; i < 50; i++){
            System.out.print(random1.nextInt(100) + " ");
        }
    }
}