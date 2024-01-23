package OOP.Lab9;

import java.util.ArrayList;
import java.util.Date;

public class ArrExercise {
    public static void main(String[] args) {
        ArrayList<Object> o = new ArrayList<Object>();
        o.add(new Loan());
        o.add(new String("ABC"));	
        o.add(new Date());

        for (int i = 0; i < o.size(); i++) {
            System.out.println((o.get(i)).toString());
        }
    }
}
