package org.example;

public class FibonacciIterative {
    public long get(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n<0");
        } else if (n <= 1) {
            return n;
        }

        long prev1 = 1;
        long prev2 = 0;
        long result = 0;

        for (int i = 2; i <= n; i++) {
            result = prev1 + prev2;
            prev2 = prev1;
            prev1 = result;
        }

        return result;
    }
}
