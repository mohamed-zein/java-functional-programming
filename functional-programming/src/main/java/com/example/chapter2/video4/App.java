package com.example.chapter2.video4;

public class App {
    
    public static void main(String[] args) {
        // Production mode
        // final Boolean IS_DEVELOPMENT = false;
        
        // Development mode
        final Boolean IS_DEVELOPMENT = true;

        DataLoader dataLoader = new DataLoader(IS_DEVELOPMENT);
        System.out.println(dataLoader.loadPerson.apply());
    }
}
