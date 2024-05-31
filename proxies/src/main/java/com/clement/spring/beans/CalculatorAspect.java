package com.clement.spring.beans;

import com.clement.spring.Around;
import com.clement.spring.Aspect;
import com.clement.spring.Component;

@Component
@Aspect
public class CalculatorAspect {

    @Around
    public Object m() {
        return 100;
    }
}
