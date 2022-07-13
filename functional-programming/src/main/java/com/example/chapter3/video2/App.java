package com.example.chapter3.video2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // We want to get Only the even numbers from this list
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));

        /*
         * Typical Procedual way to do this is by for loop
         * check each element if it is even or not
         * if even then add it to the list evens
         */
        // List<Integer> evens = new ArrayList<>();
        // for (int i = 0; i < listOfIntegers.size(); i++) {
        // Boolean isEven = listOfIntegers.get(i) % 2 == 0;
        // if (isEven) {
        // evens.add(listOfIntegers.get(i));
        // }
        // }

        /*
         * The functional more simple and readable way to do the same would be
         * create a Predicate which defines even numbers
         * use Stream filter with the predicate
         */
        Predicate<Integer> isEven = (x) -> x % 2 == 0;
        List<Integer> evens = listOfIntegers
                .stream()
                .filter(isEven)
                // Also, we can define the lambda expression directly
                // without seperate Predicate object
                // .filter((x) -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evens);

        /*
         * Another example here
         * For the below list of words, we want find all words that are longer than 5
         * characters
         */
        String[] wordsArr = { "hello", "functional", "programming", "is", "cool" };
        List<String> words = Arrays.asList(wordsArr);

        Predicate<String> isLongerThan5 = (str) -> str.length() > 5;
        List<String> longWords = words
                .stream()
                .filter(isLongerThan5)
                .collect(Collectors.toList());
        
        System.out.println(longWords);

        /*
         * To further improve our code to enable dynamic string length check
         * We create a higher order function 
         * that returns a predicate based on minLength variable.
         */
        Function<Integer, Predicate<String>> createLengthTest = (minLength) -> {
            return (str) -> str.length() > minLength;
        };

        Predicate<String> isLongerThan3 = createLengthTest.apply(3);
        List<String> mediumWords = words
                .stream()
                .filter(isLongerThan3)
                // .filter(createLengthTest.apply(3))
                .collect(Collectors.toList());
        
        System.out.println(mediumWords);
    }
}
