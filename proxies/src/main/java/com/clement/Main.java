package com.clement;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Aninmal a1 = new Cat();


        Aninmal a2 = (Aninmal) Proxy.newProxyInstance(Main.class.getClassLoader(), new Class[]{Aninmal.class}, new AnimalInvocationHandler(a1));

        a1.sound();

        System.out.println("-------------------------");
        a2.sound();
    }
}