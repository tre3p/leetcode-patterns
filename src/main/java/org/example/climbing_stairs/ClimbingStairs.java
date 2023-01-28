package org.example.climbing_stairs;

public class ClimbingStairs {

    /**
     * Represents implementation of Fibonacci numbers, because to climb stair N - it's the same as
     * climb to stair (n - 1) + (n - 2)
     * @param n
     * @return
     */
    public static int climbingStairs(int n) {
        /**
         * Base case. First fibonacci number = 1
         */
        if (n == 1) {
            return n;
        }

        int n1 = 1;
        int n2 = 2;

        for (int i = 3; i < n + 1; i++) {
            int temp = n1;
            n1 = n2;
            n2 = n2 + temp;
        }

        return n2;
    }
}
