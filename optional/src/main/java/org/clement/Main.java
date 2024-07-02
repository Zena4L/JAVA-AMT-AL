package org.clement;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {


        Optional<Integer> op1 = Optional.of(10);

        Optional<Integer> s = Optional.ofNullable(m1());

        boolean present = s.isPresent();
        boolean present1 = op1.isPresent();

        System.out.println(present1);
        System.out.println(present);



    }

    static Integer m1() {
        return null;
    }
}