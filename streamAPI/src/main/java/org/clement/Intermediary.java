package org.clement;


import java.util.List;

public class Intermediary {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 4, 5, 6, 7, 8, 2, 4, 5, 6);

        boolean b1 = list.stream().anyMatch(x -> x % 2 == 0); //true
        boolean b2 = list.stream().allMatch(x -> x % 2 == 0); //false
        boolean b3 = list.stream().noneMatch(x -> x % 2 == 0); // false

    }
}
