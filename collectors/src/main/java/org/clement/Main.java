package org.clement;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<String> list = List.of("ab", "aass", "jds", "asjkd","aass");

//        // list collectors
//        List<String> stringList = list.stream()
//                // intermidiary
//                .collect(Collectors.toList());
//
//        Set<String> stringSet = list.stream().
//                // intermidiary
//                        collect(Collectors.toSet());
//
//        TreeSet<String> stringTreeSet = list.stream().
//                // intermidiary
//                        collect(Collectors.toCollection(TreeSet::new));
//
//        // map collectors
//        Map<String, Integer> map1 = list.stream()
//                .collect(Collectors.toMap(s -> s, s -> s.length()));
//
//        // removing duplicates
//        Map<String, Integer> map2 = list.stream()
//                .collect(Collectors.toMap(s -> s, s -> s.length(), (a,b) -> a+b));
//
//
//        Map<String, Integer> map3 =   list.stream()
//                .collect(Collectors.toMap(s -> s, s -> s.length() , (a,b) -> a+b , TreeMap::new));

        // join collectors.
//        String s = list.stream().collect(Collectors.joining());
//
//        String s1 = list.stream().collect(Collectors.joining(","));
//
//        String s2 = list.stream().collect(Collectors.joining(",", "A", "B"));

//        List<? extends Serializable> collected = list.stream().collect(Collectors.teeing(
//                Collectors.counting(),
//                Collectors.joining(),
//                (a, b) -> {
//                    return List.of(a, b);
//                }
//        ));

//        System.out.println(collected);

    }

}