package org.clement;

import java.util.List;
import java.util.stream.Collectors;

public class Example2 {

    public static void main(String[] args) {
        List<String> list1 = List.of("aaa", "bbba", "ccc");

        List<Integer> res = list1.stream().map(String::length).collect(Collectors.filtering(
                n -> n % 2 == 0,
                Collectors.toList()
        ));

        System.out.println(res);
    }


}
