package com.example.typespeed.service;

public class TimeService implements Runnable{
    private volatile boolean running = true;
    private long elapsedTime = 0;

    public void stop(){ running = false; }
    public long getElapsedTime(){ return elapsedTime; }
    public boolean isRunning(){ return running; }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        while(running){
            elapsedTime = System.currentTimeMillis() - startTime;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        }
    }
}
