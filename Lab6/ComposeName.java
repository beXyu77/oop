package OOP.Lab6;

import java.util.Scanner;
import java.util.Random;

public class ComposeName {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);

        System.out.print("Enter your First Name: ");
        String firstName = a.next();
        System.out.print("Enter your Last Name: ");
        String lastName = a.next();

        a.close();

        char firstLetter = firstName.charAt(0);
        String FirstFiveLetter = lastName.substring(0,5);

        System.out.print("Username: " + firstLetter + FirstFiveLetter);

        Random num = new Random();
        int randomNum = num.nextInt(10,100);
        System.out.print(randomNum);
    }
}
