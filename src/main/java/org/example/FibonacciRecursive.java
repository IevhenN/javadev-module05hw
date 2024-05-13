package org.example;

public class FibonacciRecursive {
    public long get(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n<0");
        } else if (n <= 1) {
            return n;
        }
        return get(n - 1) + get(n - 2);
    }
}
