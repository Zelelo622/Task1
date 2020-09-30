package com.compan.num14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double volume = readSpeed();
        outputTiming(volume, timing(volume));
    }

    public static double timing(double volume) {
        // g - Acceleration of gravity
        double g = 9.81;
        return 2 * volume / g;
    }

    public static double readSpeed() {
        System.out.print("Enter speed: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void outputTiming (double volume, double time) {
        System.out.printf(
                "With a speed V = %1$.2f, the stone will fall in t = %2$.2f seconds",
                volume, time
        );
    }
}
