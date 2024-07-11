package com.clement;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

        // Declaring ExecutorService outside try-with-resources block for proper scope
        int nThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(nThreads);

        try {
            // Task to be executed asynchronously
            Runnable r = () -> System.out.println(":) " + Thread.currentThread().getName());

            // Execute the task
//            service.execute(r);
            service.submit(r);
            // Main thread message
            System.out.println(":( " + Thread.currentThread().getName());
        } finally {
            // Shutdown the ExecutorService to release resources
            service.shutdown();

        }

    }
}