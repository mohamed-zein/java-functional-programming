package com.example.chapter3.video4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        /*
         * For the below list of words, we want find all words that are longer than 5
         * characters
         */
        String[] wordsArr = { "hello", "apple", "functional", "programming", "is", "cool" };
        List<String> words = Arrays.asList(wordsArr);

        /*
         * Here we use the Collectots.toList() to return a List
         */
        List<String> longWordsList = words
                .stream()
                .filter((word) -> word.length() > 5)
                .collect(Collectors.toList());
        
        
        System.out.println(longWordsList);
        
        /*
         * We can also return a Set using the Collectors.toSet()
         */
        Set<String> longWordsSet = words
                .stream()
                .filter((word) -> word.length() > 5)
                .collect(Collectors.toSet());

        System.out.println(longWordsSet);

        /*
         * The joining collector returns a string of all elements joined by a delimiter
         */
        String longWords = words
                .stream()
                .filter((word) -> word.length() > 5)
                .collect(Collectors.joining(", "));
        
        System.out.println(longWords);

        /*
         * The counting collector returns a Long of the count of elements in the stream
         */
        Long longWordsCount = words
                .stream()
                .filter((word) -> word.length() > 5)
                .collect(Collectors.counting());
        
        System.out.println(longWordsCount);


        /*
         * The groupingBy collector divides the elements of the stream into different groups
         * and returns a Map contains those groups
         * The collector takes a function as an argument that defines how we divide/group this elements of the stream
         * The return of the argument function will be groups and also will be the keys of the Map 
         * Below, we define a function that returns the element length
         */
        Map<Integer, List<String>> wordsLengthMap = words
                .stream()
                .collect(Collectors.groupingBy(
                    (word) -> word.length()
                ));
        
        System.out.println(wordsLengthMap);


        /*
         * The partioningBy is very similar to the grouping by collector
         * instead of dividing the stream into multiple parts, it divides only to 2 parts
         * partitioningBy accept a Predicate as an argument
         * Below, we divide the elements as larger that 5 or not
         */
        Map<Boolean, List<String>> wordsLengthPartitionMap = words
                .stream()
                .collect(Collectors.partitioningBy(
                    (word) -> word.length() > 5
                ));
        
        System.out.println(wordsLengthPartitionMap);
    }
}
