package com.example.typespeed;

import com.example.typespeed.service.ScoreService;
import com.example.typespeed.service.TimeService;
import com.example.typespeed.service.TypingSession;

import java.util.Scanner;

public class TypingController {
    TypingSession session =  new TypingSession();
    ScoreService scoreService = new ScoreService();
    TimeService timeService = new TimeService();
    Scanner scanner = new Scanner(System.in);

    TypingController () {
        System.out.println("Hey there! Choose playing mode: ");
        System.out.println("1. 30 seconds test");
        System.out.println("2. 60 seconds test");
        System.out.println("3. 12 seconds test");
        int choice = scanner.nextInt();
        Thread timerThread = new Thread(timeService);

        switch(choice) {
            case 1: // 30 seconds mode
                timerThread.start();
                while (timeService.isRunning()) {
                    if (timeService.getElapsedTime() >= 30 * 1000) {
                        timeService.stop();
                    }
                }
                break;
            case 2: // 60 seconds mode
                timerThread.start();
                while (timeService.isRunning()) {
                    if (timeService.getElapsedTime() >= 60 * 1000) {
                        timeService.stop();
                    }
                }
                break;
            case 3: // 12 seconds mode
                timerThread.start();
                session.setText();
                session.printText();

                while (timeService.isRunning()) {
                    // add reading method here
                    if (timeService.getElapsedTime() >= 12 * 1000) {
                        timeService.stop();
                    }
                }
                System.out.println("Your WPM: "); // add WPM method here
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
