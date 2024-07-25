package com.clement;

import java.util.concurrent.Callable;

public class SummingNumbersCallable implements Callable<Integer> {

    private Integer a;
    private Integer b;

    public SummingNumbersCallable(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() throws Exception {
        return this.a + this.b;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }
}



