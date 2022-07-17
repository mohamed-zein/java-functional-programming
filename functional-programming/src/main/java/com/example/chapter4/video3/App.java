package com.example.chapter4.video3;

public class App {

    static void countDown(Integer x) {
        // Stop condition
        if (x < 0) {
            System.out.println("Done");
            return;
        }
        System.out.println(x);
        countDown(x - 1);
    }

    static void countUp(Integer x, Integer end) {
        // Stop condition
        if (x > end) {
            System.out.println("Done");
            return;
        }
        System.out.println(x);
        countUp(x + 1, end);
    }
    
    public static void main(String[] args) {
        // Notice when we use this function, there is no a foor loop or mutation
        countDown(10);

        countUp(0, 10);;
    }
}
