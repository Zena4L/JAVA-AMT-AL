package org.clement;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

public class Main {
    public static void main(String[] args) {
        //scenario : having a list,
        // print in the console the values from the list doubled

        ForkJoinPool pool = null;
        try {

            pool = new ForkJoinPool();

            List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

//            pool.invoke(new DoubleNumbersRecurisiveAction(input));
            pool.invoke(new SumNumbersRecursiveTask(input));
        } finally {
            if (pool != null) {
                pool.close();
            }
        }

    }
}

class DoubleNumbersRecurisiveAction extends RecursiveAction {

    private final List<Integer> input;

    DoubleNumbersRecurisiveAction(List<Integer> input) {
        this.input = input;
    }

    @Override
    protected void compute() {
        if (input.size() <= 2) {
            input.stream().map(n -> 2 * n).forEach(System.out::println);
        } else {
            int mid = input.size() / 2;
            List<Integer> list1 = input.subList(0, mid);
            List<Integer> list2 = input.subList(mid, input.size());

            DoubleNumbersRecurisiveAction t1 = new DoubleNumbersRecurisiveAction(list1);
            DoubleNumbersRecurisiveAction t2 = new DoubleNumbersRecurisiveAction(list2);

            invokeAll(t1, t2);
        }
    }
}

class SumNumbersRecursiveTask extends RecursiveTask<Integer> {

    private final List<Integer> input;

    SumNumbersRecursiveTask(List<Integer> input) {
        this.input = input;
    }

    @Override
    protected Integer compute() {
        if (input.size() <= 2) {
            return input.stream().mapToInt(x -> x).sum();
        } else {
            int mid = input.size() / 2;
            List<Integer> list1 = input.subList(0, mid);
            List<Integer> list2 = input.subList(mid, input.size());

            SumNumbersRecursiveTask t1 = new SumNumbersRecursiveTask(list1);
            SumNumbersRecursiveTask t2 = new SumNumbersRecursiveTask(list2);

            t1.fork(); //t1 to be exceuted on a seperate thread
            t2.fork(); //t2 to be exceuted on a seperate thread

            return t1.join() + t2.join(); // take t1 and add it to t2 whiles it done
        }

    }
}