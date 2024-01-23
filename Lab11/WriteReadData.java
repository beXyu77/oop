package OOP.Lab11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class WriteReadData {
    public static void main(String[] args) throws FileNotFoundException{
        File file1 = new File("Lab20_02.txt");
        Random random1 = new Random();

        if(file1.exists()){
            System.out.println("File already exists. ");
            System.exit(0);
        }

        PrintWriter output = new PrintWriter(file1);

        for (int i=0; i<100; i++){
            output.print(random1.nextInt(101) + " ");
        }output.close();

        File file2 = new File("Lab20_02.txt");
        Scanner input = new Scanner(file2);

        while (input.hasNext()){
            int score = input.nextInt();
            System.out.print(score + " ");
        }input.close();
    }
}
