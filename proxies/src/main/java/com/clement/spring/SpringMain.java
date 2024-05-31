package com.clement.spring;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

public class SpringMain {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class c1 = Class.forName("beans.CalculatorService");
        Class a1 = Class.forName("beans.CalculatorAspect");
        Class a2 = Class.forName("beans.Calculator");

        if(c1.isAnnotationPresent(Component.class)){
            Constructor constructor = c1.getDeclaredConstructor();
            constructor.newInstance();
        }

        if(a1.isAnnotationPresent(Aspect.class)){
            Proxy.newProxyInstance(SpringMain.class, new Class[]{c1},)
        }
    }
}
