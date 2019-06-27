package com.kodilla.rps;

import java.util.Objects;
import java.util.Scanner;

public class Player {
    private String name;
    private int count;

    public static String stringKeyboard() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imię i potwierdź ENTER");
        String firstName = scan.nextLine();
        return firstName;
    }

    public static int rps(int player , int comp) {
        if (player == 3) {
            if (comp == 3) {
                return 0;
            } else if (comp == 2) {
                return 1;
            } else {
                return 2;
            }
        } else if (player == 2) {
            if (comp == 2) {
                return 0;
            } else if (comp == 1) {
                return 1;
            } else {
                return 2;
            }
        } else {
            if (comp == 1) {
                return 0;
            } else if (comp == 3) {
                return 1;
            } else {
                return 2;
            }
        }
    }

    public Player(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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
