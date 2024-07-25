package org.clement;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {

    private final Semaphore semaphore = new Semaphore(4); // max of 4 threads to be allowed in a thread.

    public static void main(String[] args) {
      //
    }

    public  void m() {
        // other thread will wait until the max number is reduced
      try {
          semaphore.acquire();

          // only max of 4 threads will be active here

      }catch (InterruptedException e){
          e.printStackTrace();
      }finally {
          semaphore.release();
      }



    }
}