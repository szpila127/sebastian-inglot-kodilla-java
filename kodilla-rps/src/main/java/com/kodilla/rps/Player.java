package com.kodilla.rps;

import java.util.Objects;
import java.util.Scanner;

public class Player {
    private String name;
    private int count;

    static String stringKeyboard() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Set name:");
        return scan.nextLine();
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
