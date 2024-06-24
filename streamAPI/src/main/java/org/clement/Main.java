package org.clement;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 3, 4, 5, 6, 7, 8, 2, 4, 5, 6);

        // print out even number of the list.

        // using a native loop
//        for (Integer i : list) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }


        // using stram api

        list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
    }
}