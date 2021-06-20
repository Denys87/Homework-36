package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(899) + 100;
        int first = a / 100;
        int secondBegin = a / 10;
        int second = secondBegin % 10;
        int third = a % 10;
        int maxDigit = 0;

        if (first > second && first > third)
        {
            maxDigit = first;
        } else if (second > first && second > third) {
            maxDigit = second;
        } else {
            maxDigit = third;
        }

        System.out.println ("random number: " + a + ", max digit: " + maxDigit);
    }
}
