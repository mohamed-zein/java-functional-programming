package com.example.chapter2.video1;

import java.util.function.Function;

public class App {

    public static void main(String[] args) {
        // We use the java.util.function.Function interface to create a reference to function triple itself
        // The <Integer, Integer> defines that the function will take Integer as input and returns Integer as output
        // When we assign the myTriple function reference, we use the :: notation 
        // to reference a function member inside the MyMath class (or Object)
        Function<Integer, Integer> myTriple = MyMath::triple;
        
        // Now we can call the triple method using the Function interface reference through calling the apply method
        Integer result = myTriple.apply(5);
        System.out.println(result);    
    }
}
