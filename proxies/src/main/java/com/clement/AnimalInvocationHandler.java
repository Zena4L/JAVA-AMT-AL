package com.clement;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AnimalInvocationHandler implements InvocationHandler {

    private final Aninmal aninmal;

    public AnimalInvocationHandler(Aninmal aninmal) {
        this.aninmal = aninmal;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("hello");
        aninmal.sound();
        System.out.println("proxie");
        return null;
    }
}
