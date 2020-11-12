package ru.vsu.num14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double speed = readInteger("speed --> ");
        printTimingStone(speed, calculateTheTimeTheStoneFalls(speed));
    }

    private static double calculateTheTimeTheStoneFalls(double speed) {
        // g - Acceleration of gravity
        double g = 9.81;
        return 2 * speed / g;
    }

    private static int readInteger(String phrase) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter %s", phrase);
        return scanner.nextInt();
    }

    private static void printTimingStone(double speed, double time) {
        System.out.printf(
                "With a speed V = %1$.2f, the stone will fall in t = %2$.2f seconds",
                speed, time
        );
    }
}
