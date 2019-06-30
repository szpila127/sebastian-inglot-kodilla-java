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
        if (player == 5) {
            if (comp == 5) {
                return 55;
            } else if (comp == 4) {
                return 54;
            } else if (comp == 3) {
                return 53;
            } else if (comp == 2) {
                return 52;
            } else {
                return 51;
            }
        } else if (player == 4) {
            if (comp == 4) {
                return 44;
            } else if (comp == 5) {
                return 45;
            } else if (comp == 3) {
                return 43;
            } else if (comp == 2) {
                return 42;
            } else {
                return 41;
            }
        } else if (player == 3) {
            if (comp == 3) {
                return 33;
            } else if (comp == 5) {
                return 35;
            } else if (comp == 4) {
                return 34;
            } else if (comp == 2) {
                return 32;
            } else {
                return 31;
            }
        } else if (player == 2) {
            if (comp == 2) {
                return 22;
            } else if (comp == 5) {
                return 25;
            } else if (comp == 4) {
                return 24;
            } else if (comp == 3) {
                return 23;
            } else {
                return 21;
            }
        } else {
            if (comp == 1) {
                return 11;
            } else if (comp == 5) {
                return 15;
            } else if (comp == 4) {
                return 14;
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
