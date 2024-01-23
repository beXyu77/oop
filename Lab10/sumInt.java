package OOP.Lab10;

public class sumInt {
    public static void main(String[] args) {
        java.util.Scanner a = new java.util.Scanner(System.in);
       
        int n1 = 0;
        int n2 = 0;
        while(true) {
            System.out.print("Please enter in 2 integers: ");        
            try {
                n1 = a.nextInt();
                n2 = a.nextInt();
                
                break;
            } 
            catch (java.util.InputMismatchException b) {
               System.out.printf("Try again. (Incorrect input: an integer is required)\n");
               a.nextLine(); 
            }
        }a.close();
        System.out.printf("The sum is " + (n1+n2));
    }
}