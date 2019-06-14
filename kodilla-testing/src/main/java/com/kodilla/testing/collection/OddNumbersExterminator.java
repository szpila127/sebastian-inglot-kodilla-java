package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 50; i++) {
//            list.add(i);
//        }
//        System.out.println(list);
//        exterminate(list);
//    }

    public static void exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> even = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                even.add(i);
            }
        }
        System.out.println(even);
    }
}
