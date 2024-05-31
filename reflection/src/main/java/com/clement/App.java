package com.clement;

import com.clement.annotation.Call;
import com.clement.service.ProductService;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        ProductService p = new ProductService();
//
//        p.addProduct();

        String k = "service.ProductService";

        try {
//            Class productService = Class.forName(k);
//
//            Constructor productServiceDeclaredConstructor = productService.getDeclaredConstructor();
//            productServiceDeclaredConstructor.setAccessible(true);  // to access a private constructor
//
//
//            Object o = productServiceDeclaredConstructor.newInstance();
//
//            Method addProduct = productService.getDeclaredMethod("addProduct");

//            addProduct.invoke(o);


//            System.out.println(o);

            // using anotation

            Class productService = Class.forName(k);

            Constructor productServiceDeclaredConstructor = productService.getDeclaredConstructor();
            productServiceDeclaredConstructor.setAccessible(true);  // to access a private constructor


            Object o = productServiceDeclaredConstructor.newInstance();

            Method[] declaredMethods = productService.getDeclaredMethods();

            for (Method m : declaredMethods) {
                if (m.isAnnotationPresent(Call.class)) {
                    m.invoke(o);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
