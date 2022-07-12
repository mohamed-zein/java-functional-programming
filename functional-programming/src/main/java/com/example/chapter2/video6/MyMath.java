package com.example.chapter2.video6;

import java.util.function.Function;

public class MyMath {

    // Redundant Code
    public static Integer timesTwo(Integer x) {
        return x * 2;
    }

    public static Integer timesThree(Integer x) {
        return x * 3;
    }

    public static Integer timesFour(Integer x) {
        return x * 4;
    }
    // Redundant Code

    // Refactored code for the above
    public static Function<Integer, Integer> createMultiplier(Integer y) {
        return (Integer x) -> x * y ;
    }
}
