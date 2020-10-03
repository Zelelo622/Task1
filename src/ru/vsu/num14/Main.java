package ru.vsu.num14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double speed = readSpeed();
        outputTimingStone(speed, calculatingTheTimeTheStoneFalls(speed));
    }

    static double calculatingTheTimeTheStoneFalls(double speed) {
        // g - Acceleration of gravity
        double g = 9.81;
        return 2 * speed / g;
    }

    static double readSpeed() {
        System.out.print("Enter speed: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static void outputTimingStone(double speed, double time) {
        System.out.printf(
                "With a speed V = %1$.2f, the stone will fall in t = %2$.2f seconds",
                speed, time
        );
    }
}
