package com.example.chapter2.video5;

import java.util.function.BiFunction;

public class MyMath {
    /**
     * Takes 2 integers and add them
     * @param x first integer
     * @param y first integer
     * @return the result of adding x + y
     */
    public static Integer add(Integer x, Integer y) {
        return x + y;
    }

    /**
     * Takes 2 integers and subtract them
     * @param x
     * @param y
     * @return the result of subtracing x - y
     */
    public static Integer subtract(Integer x, Integer y) {
        return x - y;
    }

    /**
     * @param combineFunc a BiFunction to specify what function to apply on numbers 2 and 3
     * @return the result returned from applying the combineFunction
     */
    public static Integer combine2And3(BiFunction<Integer, Integer, Integer> combineFunc) {
        return combineFunc.apply(2, 3);
    }
}
