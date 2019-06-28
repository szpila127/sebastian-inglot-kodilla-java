package com.kodilla.rps;

import java.util.Objects;
import java.util.Scanner;

public class Player {
    private String name;
    private int count;

    static String stringKeyboard() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imię i potwierdź ENTER");
        return scan.nextLine();
    }

    static int rps(int player, int comp) {
        if (player == 3) {
            if (comp == 3) {
                return 33;
            } else if (comp == 2) {
                return 32;
            } else {
                return 31;
            }
        } else if (player == 2) {
            if (comp == 2) {
                return 22;
            } else if (comp == 1) {
                return 21;
            } else {
                return 23;
            }
        } else {
            if (comp == 1) {
                return 11;
            } else if (comp == 3) {
                return 13;
            } else {
                return 12;
            }
        }
    }

    Player(String name, int count) {
        this.name = name;
        this.count = count;
    }

    String getName() {
        return name;
    }

    int getCount() {
        return count;
    }

    void setCount(int count) {
        this.count = count;
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return getCount() == player.getCount() &&
                Objects.equals(getName(), player.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCount());
    }
}
