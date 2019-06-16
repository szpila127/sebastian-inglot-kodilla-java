package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(8);
        list.add(5);
        System.out.println(list);
        exterminate(list);
    }

    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> even = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                even.add(numbers.get(i));
            }
        }
        return even;
    }
}
