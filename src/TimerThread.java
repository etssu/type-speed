import java.time.Instant;
import java.time.Duration;

public class TimerThread implements Runnable {
    private final long seconds;

    public TimerThread(int seconds) {  // set seconds (can be 30 or 60)
        this.seconds = seconds;
    }

    public void run() {
        try{
            Thread.sleep(seconds * 1000); // sleep for (seconds * 1000) seconds
            System.out.println(seconds + " seconds have passed!");
        }
        catch (InterruptedException e){}
    }
}
