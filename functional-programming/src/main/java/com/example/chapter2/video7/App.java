package com.example.chapter2.video7;

public class App {
    
    public static void main(String[] args) {
        NoArgFunction<NoArgFunction<String>> createGreeter = () -> {
            String name = "Shaun";
            // The returned function still has access to the variable name
            return () -> "Hello, " + name ;
        };

        NoArgFunction<String> greeter = createGreeter.apply();
        System.out.println(greeter.apply());

        // While the greeter function has access to variable name, we don't can't directly access name
        // System.out.println(name);
    }
}
