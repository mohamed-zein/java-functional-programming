package com.example.chapter2.video5;

public class App {
    
    public static void main(String[] args) {
        // Here we are using pre-defined functions
        System.out.println(MyMath.combine2And3(MyMath::add));
        System.out.println(MyMath.combine2And3(MyMath::subtract));

        // Also, we can use lambda expression
        System.out.println(MyMath.combine2And3((x, y) -> 2*x + 2*y));
    }
}
