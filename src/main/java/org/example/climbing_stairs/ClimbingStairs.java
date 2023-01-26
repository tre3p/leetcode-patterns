package org.example.climbing_stairs;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbingStairs(23));
    }


    public static int climbingStairs(int n) {
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
