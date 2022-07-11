package com.example.chapter2.video3;

import java.util.function.BiFunction;

public class App {
    
    public static void main(String[] args) {
        // BiFunction is FunctionalInterface that is similar to Function interface
        // BiFunction defines a function that takes 2 argumetns and return single output
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;

        // Similar to Function, we use apply method to execute the function.
        System.out.println(add.apply(32, 32));

        // Now we use our custome TriFunction interface
        TriFunction<Integer, Integer, Integer, Integer> addThree = (x, y, z) -> x + y + z;
        System.out.println(addThree.apply(54, 3, 4));

        // Now we use our custom NoArgsFunction interface
        NoArgFunction<String> sayHello = () -> "Hello!";
        System.out.println(sayHello.apply());

    }
}
