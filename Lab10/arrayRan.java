package OOP.Lab10;

public class arrayRan {
    public static void main(String[] args) {
        java.util.Scanner a = new java.util.Scanner(System.in);
        int[] randomInts = new int[100];
        
        for (int i = 0; i < 100; i++) {
            randomInts[i] = (int)(Math.random() * 101);
        }
        
        System.out.print("Please enter index of array(0-99): ");
        try{
            int val = a.nextInt();
            int valAtIndex = randomInts[val - 1];
            System.out.println("The value at Index  is " + valAtIndex +"\nend nicely!");
        }
        catch (ArrayIndexOutOfBoundsException b) {
            System.out.println("You refer to index that does not exist.");
        }a.close();
    }
}
