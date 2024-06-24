package org.clement;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Sources {
    // creating a source
    List<Integer> s0 = List.of(1,2,4,5);
    Stream<Integer> s1 = Stream.empty();
    Stream<String> s2 = Stream.of("one","two");

    Supplier<Integer> sup = () -> new Random().nextInt();
    Stream<Integer> s3 = Stream.generate(sup);

}
