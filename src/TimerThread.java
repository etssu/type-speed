
public class TimerThread implements Runnable {
    private final long seconds;
    private boolean timeUp = false;
    private long startTime;
    private long endTime;

    public TimerThread(int seconds) {  // set seconds (can be 30 or 60)
        this.seconds = seconds;
    }

    @Override
    public void run() {
        try{
            Thread.sleep(seconds * 1000); // sleep for (seconds * 1000) seconds
            timeUp = true;
            System.out.println(seconds + " seconds have passed!");
        }
        catch (InterruptedException e){
            System.out.println("Timer thread has been interrupted!");
        }
    }

    public boolean isTimeUp(){
        return timeUp;
    }

    public void startTimer(){
        startTime = System.currentTimeMillis();
    }

    public void stopTimer(){
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return endTime - startTime;
    }
}
