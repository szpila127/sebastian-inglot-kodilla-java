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
                    "klawisz 4 - zagranie \"Spock\"\n" +
                    "klawisz 5 - zagranie \"jaszczurka\"\n" +
                    "klawisz x - zakończenie gry\n" +
                    "klawisz n - uruchomienie gry od nowa\n");

            int counter = 1;

            do {
                System.out.println("Runda: " + counter);
                System.out.println("Wybierz zagranie: \n" +
                        "1-(Kamień) \n" +
                        "2-(Papier) \n" +
                        "3-(Nożyce) \n" +
                        "4-(Spock) \n" +
                        "5-(Jaszczurka)");
                int gameRPS = Player.rps(Game.intKeyboardTo5(), randomNumberTo5());

                if (gameRPS == 55) {
                    System.out.println(player1.getName() + " - Jaszczurka vs. Jaszczurka - " + computer.getName());
                    System.out.println("Runda " + counter + ": Remis");
                } else if (gameRPS == 54) {
                    System.out.println(player1.getName() + " - Jaszczurka vs. Spock - " + computer.getName());
                    returnRoundWinner(player1, counter);
                } else if (gameRPS == 53) {
                    System.out.println(player1.getName() + " - Jaszczurka vs. Nożyce - " + computer.getName());
                    returnRoundWinner(computer, counter);
                } else if (gameRPS == 52) {
                    System.out.println(player1.getName() + " - Jaszczurka vs. Papier - " + computer.getName());
                    returnRoundWinner(player1, counter);
                } else if (gameRPS == 51) {
                    System.out.println(player1.getName() + " - Jaszczurka vs. Kamień - " + computer.getName());
                    returnRoundWinner(computer, counter);
                } else if (gameRPS == 44) {
                    System.out.println(player1.getName() + " - Spock vs. Spock - " + computer.getName());
                    System.out.println("Runda " + counter + ": Remis");
                } else if (gameRPS == 45) {
                    System.out.println(player1.getName() + " - Spock vs. Jaszczurka - " + computer.getName());
                    returnRoundWinner(computer, counter);
                } else if (gameRPS == 43) {
                    System.out.println(player1.getName() + " - Spock vs. Nożyce - " + computer.getName());
                    returnRoundWinner(player1, counter);
                } else if (gameRPS == 42) {
                    System.out.println(player1.getName() + " - Spock vs. Papier - " + computer.getName());
                    returnRoundWinner(computer, counter);
                } else if (gameRPS == 41) {
                    System.out.println(player1.getName() + " - Spock vs. Kamień - " + computer.getName());
                    returnRoundWinner(player1, counter);
                } else if (gameRPS == 33) {
                    System.out.println(player1.getName() + " - Nożyce vs. Nożyce - " + computer.getName());
                    System.out.println("Runda " + counter + ": Remis");
                } else if (gameRPS == 35) {
                    System.out.println(player1.getName() + " - Nożyce vs. Jaszczurka - " + computer.getName());
                    returnRoundWinner(player1, counter);
                } else if (gameRPS == 34) {
                    System.out.println(player1.getName() + " - Nożyce vs. Spock - " + computer.getName());
                    returnRoundWinner(computer, counter);
                } else if (gameRPS == 32) {
                    System.out.println(player1.getName() + " - Nożyce vs. Papier - " + computer.getName());
                    returnRoundWinner(player1, counter);
                } else if (gameRPS == 31) {
                    System.out.println(player1.getName() + " - Nożyce vs. Kamień - " + computer.getName());
                    returnRoundWinner(computer, counter);
                } else if (gameRPS == 22) {
                    System.out.println(player1.getName() + " - Papier vs. Papier - " + computer.getName());
                    System.out.println("Runda " + counter + ": Remis");
                } else if (gameRPS == 25) {
                    System.out.println(player1.getName() + " - Papier vs. Jaszczurka - " + computer.getName());
                    returnRoundWinner(computer, counter);
                } else if (gameRPS == 24) {
                    System.out.println(player1.getName() + " - Papier vs. Spock - " + computer.getName());
                    returnRoundWinner(player1, counter);
                } else if (gameRPS == 21) {
                    System.out.println(player1.getName() + " - Papier vs. Kamień - " + computer.getName());
                    returnRoundWinner(player1, counter);
                } else if (gameRPS == 23) {
                    System.out.println(player1.getName() + " - Papier vs. Nożyce - " + computer.getName());
                    returnRoundWinner(computer, counter);
                } else if (gameRPS == 11) {
                    System.out.println(player1.getName() + " - Kamień vs. Kamień - " + computer.getName());
                    System.out.println("Runda " + counter + ": Remis");
                } else if (gameRPS == 15) {
                    System.out.println(player1.getName() + " - Kamień vs. Jaszczurka - " + computer.getName());
                    returnRoundWinner(player1, counter);
                } else if (gameRPS == 14) {
                    System.out.println(player1.getName() + " - Kamień vs. Spock - " + computer.getName());
                    returnRoundWinner(computer, counter);
                } else if (gameRPS == 13) {
                    System.out.println(player1.getName() + " - Kamień vs. Nożyce - " + computer.getName());
                    returnRoundWinner(player1, counter);
                } else if (gameRPS == 12) {
                    System.out.println(player1.getName() + " - Kamień vs. Papier - " + computer.getName());
                    returnRoundWinner(computer, counter);
                }

                counter++;
                System.out.println("Gra do " + game.getRound() + " wygranych rund.");
                System.out.println(player1.getName() + ": " + player1.getCount());
                System.out.println(computer.getName() + ": " + computer.getCount());
                System.out.println();

                if (computer.getCount() == game.getRound()) {
                    returnWinner(computer);
                    char set = Game.charKeyboard();
                    if (set == 'n') {
                        player1.setCount(0);
                        computer.setCount(0);
                        break;
                    } else if (set == 'x') return;
                } else if (player1.getCount() == game.getRound()) {
                    returnWinner(player1);
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

    private static int randomNumberTo5() {
        Random theGenerator = new Random();
        return theGenerator.nextInt(5) + 1;
    }

    private static void returnWinner(Player player) {
        System.out.println("Zwycięstwo dla: " + player.getName());
        System.out.println("Wybierz (n) jeśli chcesz zagrać jeszcze raz.\n" +
                "Wybierz (x) jeśli chcesz wyjść z gry");
    }

    private static void returnRoundWinner(Player player, int count) {
        System.out.println("Rundę " + count + " wygrywa " + player.getName());
        player.setCount(player.getCount() + 1);
    }
}