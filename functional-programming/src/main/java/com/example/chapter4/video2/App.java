package com.example.chapter4.video2;

import java.util.function.BiFunction;
import java.util.function.Function;

public class App {

    public static void main(String[] args) {
        // Simple add function that takes 3 integers and add them together
        TriFunction<Integer, Integer, Integer, Integer> add = (x, y, z) -> x + y + z;

        // Now we can fix one of the 3 arguments to a certain number so that we only had
        // to pass in the other two arguments later on
        Function<Integer, BiFunction<Integer, Integer, Integer>> addPartial = (x) -> (y, z) -> add.apply(x, y, z);

        // To call the addPartial with argument 5
        BiFunction<Integer, Integer, Integer> add5 = addPartial.apply(5);

        // Now we can call the add5 with the remaining 2 arguments
        System.out.println(add5.apply(6, 7));

        // We can instead fix 2 arguments and call with the 3rd later
        BiFunction<Integer, Integer, Function<Integer, Integer>> addPartial2 = (x, y) -> (z) -> add.apply(x, y, z);

        // To call the addPartial2 with argument 5 and 6
        Function<Integer, Integer> add5And6 = addPartial2.apply(5, 6);

        System.out.println(add5And6.apply(7));

        // we could even go a level deeper with our functions and do something like
        // this, where we have a function that takes the first argument and returns a
        // function that takes a second argument, and returns a function that takes the
        // third argument, and finally, that returns the answer.
        // When we pass argument one at a time, this is called currying
        Function<Integer, Function<Integer, Function<Integer, Integer>>> addPartial3 = 
                (x) -> (y) -> (z) -> add.apply(x, y, z);

        Function<Integer, Function<Integer, Integer>> add5_only = addPartial3.apply(5);
        Function<Integer, Integer> add5And6_only = add5_only.apply(6);
        System.out.println(add5And6_only.apply(7));
        ;
    }
}
