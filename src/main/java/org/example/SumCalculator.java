package org.example;

    public class SumCalculator {
        public int sum(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("Input should be a non-negative integer.");
            }

            return (n * (n + 1)) / 2;
        }
    }
}