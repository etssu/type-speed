package com.example.typespeed.service;

public class TypingSession {
    private TimeService timeService;
    private int errors = 0;
    private int currentIndex = 0;
    private String text;
    String[] texts = { "Short test text",
                "Another slightly longer test text",
                "Text with punctuation, commas, and dots." };

    public boolean isTypingInProgress() {
        return timeService.isRunning() && currentIndex < text.length();
    }

    public boolean isInputComplete() {
        return currentIndex >= text.length() ? true : false;
    }

    // called when user types a character
    public void typeChar(char c) {
        char expectedChar = getCurrentChar();
        if (c != expectedChar) {
            errors++;
        }
        currentIndex++;
    }

    public char getCurrentChar() {
        return currentIndex < getTotalLength() ? text.charAt(currentIndex) : '\0';
    }

    // for testing
    public String getRandomText() {
        int randomIndex = (int) (Math.random() * texts.length);
        return texts[randomIndex];
    }
    public void setText() {
        text = getRandomText();
    }

    public int getErrors() { return errors;}
    public int getTotalLength() { return text.length(); }
}
