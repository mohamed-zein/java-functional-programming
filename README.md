# Functional Programming with Java
This is the repository for the LinkedIn Learning course [Functional Programming with Java](https://www.linkedin.com/learning/functional-programming-with-java)

## Inroduction
Functional programming is a way of organizing code that makes applications more scalable and maintainable. By utilizing the core concepts of immutability, data-function separation, and first-class functions, programmers can write better code. In this course, learn about the functional programming paradigm and see how to take advantage of it with Java and object-oriented programming. Apply the learnings to real-world code and examine some of the more advanced and misunderstood concepts such as partial-application, recursion, and composition to become skilled in developing flexible code.

## 1. Introduction to Functional Programming
### Why use functional programming?
* Functional Programming Misconception
    * Functional Programming and Object-Oriented Programming are not opposite. They can be used alongside each other.
    * Basically, there are just a few key places where Object-Oriented programming falls short or doesn't provide much guidance, and it is precisely in these areas that functional programming can step in and help.
* Where exactly does Object-Oriented programming falls short then?
    * When programs get larger and more complex, certain bugs start to show up that are difficult to track down and fix. 
        1. Partly because they are hard to recreate. 
        2. And partly because even when you figure out how to create them, it is next to impossible for you to keep track of all the changes that occur while the program is running.
    * In a typical enterprise-sized program, thousands of different variables are being operated on in thousands of different places at runtime, and the application can get itself into buggy states which can be difficult to recreate.
    * This is exactly the type of situation that functional programming aims to avoid.
    * At its core, functional programming is concerned with helping us take the large number of complex ideas in any large computer program and organize them in a coherent way while at the same time making sure the code remain easy to test and modify.
    * Functional programming brings the precision of mathematical functions into computer programs. 
    * Imagine if we were able to represent all parts of a computer program as simply as a mathematical function such as this one here, $f(x) = x + 1$. Where could a bug possibly be hiding in a function like this? 