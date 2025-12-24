package com.example.typespeed.service;

public class ScoreService {
    private TypingSession typingSession;
    private TimeService timeService;

    double getWPM(int charsTyped, int minutes) {
        return charsTyped / minutes;
    }
    double getAccuracy(int correctChars, int totalChars){
        return correctChars / totalChars * 100;
    }

}
