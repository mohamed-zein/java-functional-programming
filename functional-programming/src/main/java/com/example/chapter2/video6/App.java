package com.example.chapter2.video6;

import java.util.function.Function;

public class App {
    
    public static void main(String[] args) {
        NoArgFunction<NoArgFunction<String>> createGreeter = () -> {
            return () -> "Hello functional!";
        };

        // Alternative way to write the above
        // NoArgFunction<NoArgFunction<String>> createGreeter = () -> () -> "Hello functional!";

        NoArgFunction<String> greeter = createGreeter.apply();

        System.out.println(greeter.apply());

        Function<Integer, Integer> timesTwo = MyMath.createMultiplier(2);
        Function<Integer, Integer> timesThree = MyMath.createMultiplier(3);
        Function<Integer, Integer> timesFour = MyMath.createMultiplier(4);

        System.out.println(timesTwo.apply(6));
        System.out.println(timesThree.apply(6));
        System.out.println(timesFour.apply(6));
    }
}
