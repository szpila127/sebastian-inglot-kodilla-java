package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {

        try {

            SecondChallenge secondChallenge = new SecondChallenge();
            secondChallenge.probablyIWillThrowException(1.5, 3);

        } catch (Exception e) {
            System.out.println("Błąd");

        }
    }
}
