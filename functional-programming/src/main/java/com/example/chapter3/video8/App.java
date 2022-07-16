package com.example.chapter3.video8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        /*
         * In this example, we will use parallel streams
         * In the output of the program we can notice that
         * 1. our data is being processed all out of order since there are several
         * different threads working on it
         * 2. in final result, we can see that the original order of our words has been
         * preserved
         */
        String[] wordsArr = { "hello", "apple", "functional", "programming", "is", "cool" };
        List<String> words = Arrays.asList(wordsArr);

        // Create a parallel stream and use typical stream functions
        List<String> processedWords = words
                .parallelStream()
                .map((word) -> {
                    // We added the println to see how Parallel streams works
                    System.out.println("Uppercasing " + word);
                    return word.toUpperCase();
                })
                .map((word) -> {
                    System.out.println("Adding an exclamation point to " + word);
                    return word + "!";
                })
                .collect(Collectors.toList());

        System.out.println(processedWords);
    }
}
