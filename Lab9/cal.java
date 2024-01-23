import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input:");
        double cel = in.nextDouble();
        double fa = (9 / 5) * cel + 32;
        System.out.println(fa);
    }
}
