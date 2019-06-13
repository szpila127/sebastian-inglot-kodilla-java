package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator(5,2);

        int add = calculator.add();
        int substract = calculator.substract();

        if (add == 5 + 2) {
            System.out.println("Addiction OK");
        } else {
            System.out.println("Addiction Error!");
        }

        if(substract == 5 - 2) {
            System.out.println("Substraction OK");
        } else {
            System.out.println("Substraction Error!");
        }
    }
}
