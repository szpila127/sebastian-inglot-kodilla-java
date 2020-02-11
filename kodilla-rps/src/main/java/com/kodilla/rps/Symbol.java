package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;

public enum Symbol {

    ROCK,
    PAPER,
    SCISSORS,
    SPOCK,
    LIZARD;

    public static Symbol getSymbol(int number) {
        if (number == 1) {
            return Symbol.ROCK;
        } else if (number == 2) {
            return Symbol.PAPER;
        } else if (number == 3) {
            return Symbol.SCISSORS;
        } else if (number == 4) {
            return Symbol.SPOCK;
        } else return Symbol.LIZARD;
    }

    public static List<Symbol> getWinningSymbols(Symbol symbol) {
        List<Symbol> winning = new ArrayList<>();
        if (symbol == Symbol.ROCK) {
            winning.add(Symbol.PAPER);
            winning.add(Symbol.SPOCK);
        } else if (symbol == Symbol.PAPER) {
            winning.add(Symbol.SCISSORS);
            winning.add(Symbol.LIZARD);
        } else if (symbol == Symbol.SCISSORS) {
            winning.add(Symbol.ROCK);
            winning.add(Symbol.SPOCK);
        } else if (symbol == Symbol.SPOCK) {
            winning.add(Symbol.PAPER);
            winning.add(Symbol.LIZARD);
        } else {
            winning.add(Symbol.ROCK);
            winning.add(Symbol.SCISSORS);
        }
        return winning;
    }

    public static List<Symbol> getLosingSymbols(Symbol symbol) {
        List<Symbol> losing = new ArrayList<>();
        if (symbol == Symbol.ROCK) {
            losing.add(Symbol.LIZARD);
            losing.add(Symbol.SCISSORS);
        } else if (symbol == Symbol.PAPER) {
            losing.add(Symbol.ROCK);
            losing.add(Symbol.SPOCK);
        } else if (symbol == Symbol.SCISSORS) {
            losing.add(Symbol.PAPER);
            losing.add(Symbol.LIZARD);
        } else if (symbol == Symbol.SPOCK) {
            losing.add(Symbol.ROCK);
            losing.add(Symbol.SCISSORS);
        } else {
            losing.add(Symbol.SCISSORS);
            losing.add(Symbol.PAPER);
        }
        return losing;
    }
}
