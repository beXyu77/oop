package OOP.Lab5;

public class StopwatchTest {
    public static void main(String[] args){
        int[] numbers = new int[100000];
        
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (100000);
        }

        Stopwatch stopWatch = new Stopwatch();
        stopWatch.stop();

        System.out.println("The processing time is " + stopWatch.getElapsedTime());
    } 
}

class Stopwatch{
    private long startTime;
    private long endTime;

    public void startTime(){
        startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
