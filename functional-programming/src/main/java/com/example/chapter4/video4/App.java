package com.example.chapter4.video4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        // We first define 2 simple functions
        Function<Integer, Integer> timesTwo = x -> x * 2;
        Function<Integer, Integer> minusOne = x -> x - 1;

        // Then we compose method
        // compose method apply the argument first
        // in the example, timesTwo is applied first then minusOne
        Function<Integer, Integer> timesTwoMinusOne = minusOne.compose(timesTwo);
        System.out.println(timesTwoMinusOne.apply(10));

        // Also we can ust andThen method which do composition but in reverese order to compose
        Function<Integer, Integer> minusOneTimesTwo = minusOne.andThen(timesTwo);
        System.out.println(minusOneTimesTwo.apply(10));

        Employee[] employeesArr = {
                new Employee("John", 34, "developer", 80000f),
                new Employee("Hannah", 24, "developer", 95000f),
                new Employee("Bert", 50, "sales executive", 100000f),
                new Employee("Sophie", 49, "construction worker", 40000f),
                new Employee("Darren", 38, "writer", 50000f),
                new Employee("Nancy", 29, "developer", 75000f)
        };
        
        List<Employee> employees = Arrays.asList(employeesArr);

        // we want to get a list of all the employees names reversed, and in uppercase
        // We are going to define each individual operation as a function then we will compose them
        Function<Employee, String> getName = employee -> employee.name;
        Function<String, String> reverse = str -> new StringBuilder(str).reverse().toString();
        Function<String, String> uppercase = str -> str.toUpperCase();

        // Now we are going to compose the 3 functions
        Function<Employee, String> getReversedUpperCase = uppercase.compose(reverse).compose(getName);
        // Function<Employee, String> getReversedUpperCase = getName.andThen(reverse).andThen(uppercase);

        List<String> results = employees.stream().map(getReversedUpperCase).collect(Collectors.toList());
        System.out.println(results);
    }
}
