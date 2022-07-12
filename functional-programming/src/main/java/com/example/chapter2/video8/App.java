package com.example.chapter2.video8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class App {

    public static void main(String[] args) {
        /*
         * This piece of code to validate the function arguments
         * This is bad practice because it clutters our code with extra responsibility
         * to check the arguments
         */
        /*
         * BiFunction<Float, Float, Float> divide = (x, y) -> {
         * if (x == 0f) {
         * System.out.println("Error: Can't divide by zero");
         * return 0f;
         * }
         * 
         * return x / y;
         * };
         */

        BiFunction<Float, Float, Float> divide = (x, y) -> x / y;

        // This function is wrapper around the divide func
        // Its responsibility is to just ensure that the 2nd argument is not zero
        Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> secondArgIsntZero = (
                func) -> (x, y) -> {
                    if (y == 0f) {
                        System.out.println("Error: Second Argument is zero!");
                        return 0f;
                    }
                    return func.apply(x, y);
                };

        // Now we create an instance of the wrapper around the divide function to use it
        BiFunction<Float, Float, Float> divideSafe = secondArgIsntZero.apply(divide);

        System.out.println(divideSafe.apply(10f, 0f));

        System.out.println(divideSafe.apply(10f, 2f));
    }
}
