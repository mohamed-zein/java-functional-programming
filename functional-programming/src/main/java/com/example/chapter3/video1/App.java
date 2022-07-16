package com.example.chapter3.video1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));

        /*
         * Procedural way to manipulate the list using for loop
         * The main here is readability and conceptual purity
         */
        // List<Integer> doubled = new ArrayList<>();
        // for (int i = 0; i < listOfIntegers.size(); i++) {
        // Integer result = listOfIntegers.get(i) * 2;
        // doubled.add(result);
        // }

        /*
         * Below is code to do the same in declaritive functional way
         */
        // We create a Function to double an integer
        Function<Integer, Integer> timesTwo = (x) -> x * 2;

        // We use the strams and map to apply timesTwo function to all elements of the
        // list.
        // Then we use collect(Collectors.toList()) to convert the stream to a list
        // This code is more readable and maintainable
        List<Integer> doubled = listOfIntegers
                .stream()
                .map(timesTwo)
                .collect(Collectors.toList());

        System.out.println(doubled);
    }
}
