package org.clement;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        Eatable e1 = () -> System.out.println("eating");
        e1.eat();

//         consumer
        Consumer<String> c1 = s -> System.out.println(s);
        c1.accept("hello");

        BiConsumer<String, Integer> c2 = (a, b) -> System.out.println(a + " " + b);
        c2.accept("this is", 1);

        Supplier<Integer> s1 = () -> 10;
        System.out.println(s1.get());

        Function<String, Integer> f1 = s -> s.length();
        Integer x = f1.apply("something");
        System.out.println(x);

        BiFunction<Integer,Integer,String> f2 = (a,b) -> a+ "" + b;

        String y = f2.apply(2, 3);
        System.out.println(y);

        Predicate<Integer> p1 = s -> s % 2 == 0;
        boolean m = p1.test(2);

        System.out.println(m);

        BiPredicate<Integer, Integer> x2 = (a, b) -> a > b;
        boolean test = x2.test(5, 3);
        System.out.println(test);

        UnaryOperator<Integer> u1 = u -> u + 1;
        Integer apply = u1.apply(5);
        System.out.println(apply);

    }
}