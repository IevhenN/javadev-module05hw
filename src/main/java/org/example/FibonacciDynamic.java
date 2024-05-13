package org.example;

import java.util.HashMap;
import java.util.Map;

public class FibonacciDynamic {
    Map<Integer, Long> fibonacci = new HashMap<Integer, Long>();

    public long get(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n<0");
        } else if (n <= 1) {
            return n;
        }

        if (fibonacci.containsKey(n)) {
            return fibonacci.get(n);
        }
        fibonacci.put(n, get(n - 1) + get(n - 2));

        return fibonacci.get(n);
    }
}
