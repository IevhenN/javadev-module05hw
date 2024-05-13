package org.example;

public class Main {
    public static void main(String[] args) {
        FibonacciIterative fibonacciIterative = new FibonacciIterative();
        System.out.println("fibonacciIterative.get(10) = " + fibonacciIterative.get(10));

        FibonacciRecursive fibonacciRecursive = new FibonacciRecursive();
        System.out.println("fibonacciRecursive.get(10) = " + fibonacciRecursive.get(10));

        FibonacciDynamic fibonacciDynamic = new FibonacciDynamic();
        System.out.println("fibonacciDynamic.get(5) = " + fibonacciDynamic.get(5));
        System.out.println("fibonacciDynamic.get(10) = " + fibonacciDynamic.get(10));
    }
}