package com.kodilla.rps;

import java.util.Random;

public class RpsRunner {
    public static void main(String[] args) {
        System.out.println("Witamy w Rock-Paper-Scissors!");
        Player player1 = new Player(Player.stringKeyboard(), 0);
        Player computer = new Player(("Komputer"), 0);

        System.out.println("Witaj " + player1.getName());
        System.out.println("Podaj ilość rund i potwierdź ENTER");
        Game game = new Game(Game.intKeyboard());
        System.out.println("Gra ustawiona na " + game.getRound() + " rundy.");
        System.out.println("Kawisze do obsługi gry:\n" +
                "klawisz 1 - zagranie \"kamień\"\n" +
                "klawisz 2 - zagranie \"papier\"\n" +
                "klawisz 3 - zagranie \"nożyce\"\n" +
                "klawisz x - zakończenie gry\n" +
                "klawisz n - uruchomienie gry od nowa\n");

        int counter = 1;

        do {
            System.out.println("Runda: " + counter);
            System.out.println("Wybierz zagranie: 1-(Kamień), 2-(Papier), 3-(Nożyce)");
            if (Player.rps(Game.intKeyboard(), randomNumberTo3()) == 1) {
                System.out.println("Rundę " + counter + " wygrywa " + player1.getName());
                player1.setCount(player1.getCount() + 1);
            } else if (Player.rps(Game.intKeyboard(), randomNumberTo3()) == 2) {
                System.out.println("Rundę " + counter + " wygrywa " + computer.getName());
                computer.setCount(computer.getCount() + 1);
            } else System.out.println("Runda " + counter + ": Remis");
            counter++;
            System.out.println(player1.getName() + ": " + player1.getCount());
            System.out.println(computer.getName() + ": " + computer.getCount());
            System.out.println();
            if (computer.getCount() == game.getRound()) {
                System.out.println("Zwycięstwo dla: " + computer.getName());
                System.out.println("Wybierz (n) jeśli chcesz zagrać jeszcze raz.\n" +
                        "Wybierz (x) jeśli chcesz wyjść z gry");
                return;
            }
            if (player1.getCount() == game.getRound()) {
                System.out.println("Zwycięstwo dla: " + player1.getName());
                System.out.println("Wybierz (n) jeśli chcesz zagrać jeszcze raz.\n" +
                        "Wybierz (x) jeśli chcesz wyjść z gry");
                return;
            }
        } while ((computer.getCount() != game.getRound()) || (player1.getCount() != game.getRound()));
    }

    private static int randomNumberTo3 () {
        Random theGenerator = new Random();
        int random = theGenerator.nextInt(3);
        if (random == 0) {
            return 1;
        } else if (random == 1) {
            return 2;
        } else {
            return 3;
        }
    }
}