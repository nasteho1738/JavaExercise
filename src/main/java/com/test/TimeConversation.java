package com.test;

public class TimeConversation {
    public static void main(String[] args) {
        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.printf("%02d:%02d", hours, minutes,seconds);
    }
}
