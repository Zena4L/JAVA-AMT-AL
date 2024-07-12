package com.clement;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

        // Declaring ExecutorService outside try-with-resources block for proper scope
        int nThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(nThreads);

        try {
            // Task to be executed asynchronously
//            Runnable r = () -> System.out.println(":) " + Thread.currentThread().getName()); //method void

//            Callable<Integer> c = () -> 1+2;//implementation is similar to a supplier

            // Execute the task
            // service.execute(r);
//            Future<?> f = service.submit(r);

//            Future<Integer> cf = service.submit(c);

            //do stuffs whiles the task is running

//            f.get(); // get ur task

//            System.out.println(cf.get());

            SummingNumbersCallable sum = new SummingNumbersCallable(2,5);

            Future<Integer> submit = service.submit(sum);
            System.out.println(submit.get());

            // Main thread message
            System.out.println(":( " + Thread.currentThread().getName());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            // Shutdown the ExecutorService to release resources
            service.shutdown();

        }

    }
}