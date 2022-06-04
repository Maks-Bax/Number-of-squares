package ru.netology.sqr;

public class SQRService {
    public static int squareCounter(int start, int stop) {
        int count = 0;
        for (int i = 1; i <= 99; i++) {
            if (i * i >= start & i * i <= stop) {
                count++;
            }
        }
        return (count);
    }
}
