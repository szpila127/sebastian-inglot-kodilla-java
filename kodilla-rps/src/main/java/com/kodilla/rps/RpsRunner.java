package com.kodilla.rps;

import java.util.Random;

public class RpsRunner {
    public static void main(String[] args) {

        System.out.println("Witamy w Rock-Paper-Scissors!");
        Player player1 = new Player(Player.stringKeyboard(), 0);
        player1.setName(player1.getName().toUpperCase());
        Player computer = new Player(("KOMPUTER"), 0);

        while (true) {
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
                int gameRPS = Player.rps(Game.intKeyboardTo3(), randomNumberTo3());
                if (gameRPS == 33) {
                    System.out.println(player1.getName() + " - Nożyce vs. Nożyce - " + computer.getName());
                    System.out.println("Runda " + counter + ": Remis");
                } else if (gameRPS == 32) {
                    System.out.println(player1.getName() + " - Nożyce vs. Papier - " + computer.getName());
                    System.out.println("Rundę " + counter + " wygrywa " + player1.getName());
                    player1.setCount(player1.getCount() + 1);
                } else if (gameRPS == 31) {
                    System.out.println(player1.getName() + " - Nożyce vs. Kamień - " + computer.getName());
                    System.out.println("Rundę " + counter + " wygrywa " + computer.getName());
                    computer.setCount(computer.getCount() + 1);
                } else if (gameRPS == 22) {
                    System.out.println(player1.getName() + " - Papier vs. Papier - " + computer.getName());
                    System.out.println("Runda " + counter + ": Remis");
                } else if (gameRPS == 21) {
                    System.out.println(player1.getName() + " - Papier vs. Kamień - " + computer.getName());
                    System.out.println("Rundę " + counter + " wygrywa " + player1.getName());
                    player1.setCount(player1.getCount() + 1);
                } else if (gameRPS == 23) {
                    System.out.println(player1.getName() + " - Papier vs. Nożyce - " + computer.getName());
                    System.out.println("Rundę " + counter + " wygrywa " + computer.getName());
                    computer.setCount(computer.getCount() + 1);
                } else if (gameRPS == 11) {
                    System.out.println(player1.getName() + " - Kamień vs. Kamień - " + computer.getName());
                    System.out.println("Runda " + counter + ": Remis");
                } else if (gameRPS == 13) {
                    System.out.println(player1.getName() + " - Kamień vs. Nożyce - " + computer.getName());
                    System.out.println("Rundę " + counter + " wygrywa " + player1.getName());
                    player1.setCount(player1.getCount() + 1);
                } else if (gameRPS == 12) {
                    System.out.println(player1.getName() + " - Kamień vs. Papier - " + computer.getName());
                    System.out.println("Rundę " + counter + " wygrywa " + computer.getName());
                    computer.setCount(computer.getCount() + 1);
                }

                counter++;
                System.out.println("Gra do " + game.getRound() + " wygranych rund.");
                System.out.println(player1.getName() + ": " + player1.getCount());
                System.out.println(computer.getName() + ": " + computer.getCount());
                System.out.println();
                if (computer.getCount() == game.getRound()) {
                    System.out.println("Zwycięstwo dla: " + computer.getName());
                    System.out.println("Wybierz (n) jeśli chcesz zagrać jeszcze raz.\n" +
                            "Wybierz (x) jeśli chcesz wyjść z gry");
                    char set = Game.charKeyboard();
                    if (set == 'n') {
                        player1.setCount(0);
                        computer.setCount(0);
                        break;
                    } else if (set == 'x') return;
                }
                if (player1.getCount() == game.getRound()) {
                    System.out.println("Zwycięstwo dla: " + player1.getName());
                    System.out.println("Wybierz (n) jeśli chcesz zagrać jeszcze raz.\n" +
                            "Wybierz (x) jeśli chcesz wyjść z gry");
                    char set = Game.charKeyboard();
                    if (set == 'n') {
                        player1.setCount(0);
                        computer.setCount(0);
                        break;
                    } else if (set == 'x') return;
                }
            } while ((computer.getCount() != game.getRound()) || (player1.getCount() != game.getRound()));
        }
    }

    private static int randomNumberTo3() {
        Random theGenerator = new Random();
        return theGenerator.nextInt(3) + 1;
    }
}