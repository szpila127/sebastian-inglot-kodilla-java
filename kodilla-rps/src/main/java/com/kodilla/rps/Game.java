package com.kodilla.rps;

import java.util.Scanner;

class Game {
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

    static char charKeyboard() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            char xn = sc.next().charAt(0);
            if (xn == 'n') {
                return xn;
            } else if (xn == 'x') {
                return xn;
            }
        }
    }

    int getRound() {
        return round;
    }
}