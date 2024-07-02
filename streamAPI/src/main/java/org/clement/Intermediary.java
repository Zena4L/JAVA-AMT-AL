package org.clement;


import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Intermediary {
    public static void main(String[] args) {
//        List<String> list = List.of("abc3d", "qwer2t4y", "sof12t");


//        List<Integer> list = List.of(4, 2, 3, 1, 9, 5, 6, 2, 2, 1, 6, 7);
//
//        list.stream().skip(3).forEach(System.out::println);


        // using comparator

//        Stream<Cat> catStream = Stream.of(new Cat(3), new Cat(10), new Cat(4), new Cat(38));
//
//        catStream.sorted().forEach(c -> System.out.println(c.getAge()));

        //distinct values and sorted
//        list.stream()
//                .distinct()
//                .sorted() //natural
//                .forEach(System.out::println);

        // sorting with comparator
//        Comparator<Integer> c = Collections.reverseOrder();
//
//        list.stream()
//                .distinct()
//                .sorted(c) //natural
//                .forEach(System.out::println);

//        boolean b1 = list.stream().anyMatch(x -> x % 2 == 0); //true
//        boolean b2 = list.stream().allMatch(x -> x % 2 == 0); //false
//        boolean b3 = list.stream().noneMatch(x -> x % 2 == 0); // false

        //maps -> it applies a function to transform the data

//        Function<String,Integer> length = String::length;
//
//        Integer x = list.stream().map(length).reduce(0, (a, b) -> a + b);
//        System.out.println(x);

        //reverse a strin
//        Function<String, String> reverseStr = str -> new StringBuilder(str).reverse().toString();
//
//         list.stream().map(reverseStr).forEach(System.out::println);


//        ToIntFunction<String> l = x -> x.length();
//        int sum = list.stream().mapToInt(l).sum();
//        System.out.println(sum);

        //flatMaps: it used when the output should be a string.
//        Integer reduce = list.stream().flatMap(Collection::stream).reduce(0, Integer::sum);
//        System.out.println(reduce);


        // count only digits in the string
//        String digits = "1234567890";
//        long count = list.stream().flatMap(s -> Arrays.stream(s.split(""))).filter(digits::contains).count();
//
//        System.out.println(count);

    }
}
