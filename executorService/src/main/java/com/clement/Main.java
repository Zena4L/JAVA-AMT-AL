package com.clement;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

        ExecutorService service = null;

        try {
            int n = Runtime.getRuntime().availableProcessors();
            service = Executors.newFixedThreadPool(n); //Threads

//            Runnable r = () -> System.out.println("hello" + " " + Thread.currentThread().getName()); // balls
            Callable<String> c = () -> "Hello";
//            service.execute(r); //throwing the balls into the pool
            Future<String> f = service.submit(c);//recommended

            try {
                String value = f.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }


            System.out.println("Another one" + " " + Thread.currentThread().getName());
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }


    }
}