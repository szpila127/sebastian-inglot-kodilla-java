package com.kodilla.rps;

import java.util.Scanner;

public class Game {
    private int round;

    public Game(int round) {
        this.round = round;
    }

    public static int intKeyboard() {
        Scanner scan = new Scanner(System.in);
        int round = scan.nextInt();
        return round;
    }



    public static char charKeyboard() {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        return c;
    }


    public int getRound() {
        return round;
    }
}
