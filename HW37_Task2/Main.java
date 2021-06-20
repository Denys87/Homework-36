package com.company;

public class Main {
    public static void main(String[] args) {
        double n = 8.1d;
        double m = 9.3d;
        double d = 10d;
        double diffM = Math.abs(m - d);
        double diffN = Math.abs(n - d);

        if (diffM < diffN) {
            System.out.println(m + " closest to ten");
        } else if (diffN < diffM) {
            System.out.println(n + " closest to ten");
        } else {
            System.out.println("distance from " + m + " do 10 is equal to distance from " + n + " do 10");
        }
    }
}
