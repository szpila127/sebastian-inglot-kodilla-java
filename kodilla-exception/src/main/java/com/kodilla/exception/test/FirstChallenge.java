package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        try {

            if (b == 0) {
                throw new ArithmeticException();
            }

        } catch (ArithmeticException args) {

            System.out.println("Error " + args);

        } finally {

            return a / b;

        }
    }

    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}
