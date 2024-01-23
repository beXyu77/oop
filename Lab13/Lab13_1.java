/*
 * (Sort ArrayList) Write the following method that sorts an ArrayList of numbers:
    public static void sort(ArrayList<Number> list)
*/

package OOP.Lab13;

import java.util.*;

public class Lab13_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Number> list = new ArrayList<Number>();
        System.out.print("Enter five integer and five doubles: ");
        for(int i = 0; i<5; i++){
            list.add(input.nextInt());
        }

        for(int i = 0; i<5; i++){
            list.add(input.nextDouble());
        }

        sort(list);

        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

        input.close();
    }


    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) { 
            Number currentMin = list.get(i); 
            int currentMinIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (currentMin.doubleValue() > list.get(j).doubleValue()) {
                    currentMin = list.get(j);
                    currentMinIndex = j;
                }
            }   

            if (currentMinIndex != i) {
                list.set(currentMinIndex, list.get(i));
                list.set(i, currentMin);
            }
        }
    }
}
