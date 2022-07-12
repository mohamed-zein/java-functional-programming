package com.example.chapter2.video2;

import java.util.function.Function;

public class App {

    public static void main(String[] args) {
        // Define a single line lambda expression
        Function<Integer, Integer> absoluteValue = (x) -> x < 0 ? -x : x;

        // Defien a Multi-Line lambda expression
        Function<Integer, Integer> absoluteValueMulti = (x) -> {
            if (x < 0) {
                return -x;
            } else {
                return x;
            }
        };

        System.out.println(absoluteValue.apply(-100));

        System.out.println(absoluteValueMulti.apply(200));

    }
}
