package com.kodilla.rps;

import java.util.Scanner;

public class Game {
    private int round;

    Game(int round) {
        this.round = round;
    }

    static int intKeyboardTo3() {
        int counter = 0;
        while (counter < 1000) {
            Scanner scan = new Scanner(System.in);
            int intKey = scan.nextInt();
            if (intKey <= 3 && intKey != 0) {
                return intKey;
            }
        }
        counter++;
        return counter;
    }

    static int intKeyboard() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static char charKeyboard() {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        return c;
    }

    int getRound() {
        return round;
    }
}
