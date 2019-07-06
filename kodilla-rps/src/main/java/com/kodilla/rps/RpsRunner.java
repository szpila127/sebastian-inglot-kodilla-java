package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class RpsRunner {
    public static void main(String[] args) {

        System.out.println("Welcome in Rock-Paper-Scissors-Spock-Lizard!");
        Player player1 = new Player(Player.stringKeyboard(), 0);
        player1.setName(player1.getName().toUpperCase());
        Player computer = new Player(("COMPUTER"), 0);

        while (true) {
            System.out.println("Welcome " + player1.getName());
            System.out.println("Enter the number of rounds:");
            Game game = new Game(Game.intKeyboard());
            System.out.println("Game set to " + game.getRound() + " rounds.");
            System.out.println("Keys to play game:\n" +
                    "[1] - play " + Symbol.ROCK + "\n" +
                    "[2] - play " + Symbol.PAPER + "\n" +
                    "[3] - play " + Symbol.SCISSORS + "\n" +
                    "[4] - play " + Symbol.SPOCK + "\n" +
                    "[5] - play " + Symbol.LIZARD + "\n" +
                    "[n] - NEW GAME\n" +
                    "[x] - EXIT GAME\n");

            int counter = 1;

            do {
                System.out.println("Round: " + counter);
                System.out.println("Choose a play: \n" +
                        "[1] - play " + Symbol.ROCK + "\n" +
                        "[2] - play " + Symbol.PAPER + "\n" +
                        "[3] - play " + Symbol.SCISSORS + "\n" +
                        "[4] - play " + Symbol.SPOCK + "\n" +
                        "[5] - play " + Symbol.LIZARD);

                int move = Game.intKeyboardTo5();
                Symbol playerMove = Symbol.getSymbol(move);
                PlayerScore score = findWinner();
                if (score == PlayerScore.WIN) {
                    Set<Symbol> losing = Symbol.getLosingSymbols(playerMove);
                    System.out.println(player1.getName() + " [" + playerMove + "] vs. ["
                            + "] " + computer.getName());
                    System.out.println("Round " + counter + " for " + player1.getName());
                    player1.setCount(player1.getCount() + 1);
                } else if (score == PlayerScore.LOOSE) {
                    Set<Symbol> winning = Symbol.getWinningSymbols(playerMove);
                    System.out.println(player1.getName() + " [" + playerMove + "] vs. ["
                            + "] " + computer.getName());
                    System.out.println("Round " + counter + " for " + computer.getName());
                    computer.setCount(computer.getCount() + 1);
                } else {
                    System.out.println(player1.getName() + " [" + playerMove + "] vs. ["
                            + playerMove + "] " + computer.getName());
                    System.out.println("DRAW!");
                }

                counter++;
                System.out.println("Game up to " + game.getRound() + " won rounds.");
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

    private static PlayerScore findWinner() {
        Random theGenerator = new Random();
        int score = theGenerator.nextInt(4) + 1;
        if (score <= 2) {
            return PlayerScore.LOOSE;
        } else if (score == 3) {
            return PlayerScore.DRAW;
        } else return PlayerScore.WIN;
    }

    private static void returnWinner(Player player) {
        System.out.println("Victory for: " + player.getName());
        System.out.println("Choose [n] for new game\n" +
                "Choose [x] for exit the game");
    }
}