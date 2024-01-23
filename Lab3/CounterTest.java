package OOP.Lab3;

public class CounterTest {
    public static void main(String[] args){
        Counter c1 = new Counter(2);
        System.out.println("c1 current count: " + c1.getCount());
        System.out.println("c1 count after reset: " + c1.reset());

        Counter c2 = new Counter(3);
        System.out.println("c2 current count: " + c2.getCount());
        System.out.println("c2 count after reset: " + c2.reset());
    }
}

class Counter{
    int CountData;
    int CountClick;

    public Counter(){
        CountData = 0;
    }
    public Counter(int newCountData){
        CountData = newCountData;
    }

    public void Click(){
        CountClick++;
    }
    public int getCount(){
        return CountData;
    }

    public int reset(){
        return CountData=0;
    }
}