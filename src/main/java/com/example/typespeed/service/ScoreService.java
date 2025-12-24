package com.example.typespeed.service;

public class ScoreService {
    private TypingSession typingSession;
    private TimeService timeService;

    public double getWPM(int charsTyped, int seconds) {
        return (double)charsTyped / 5 / ((double)seconds / 60);
    }
    public double getAccuracy(int correctChars, int totalChars){
        return (double)(correctChars / totalChars) * 100;
    }

}
