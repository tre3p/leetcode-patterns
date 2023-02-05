package org.example.find_smallest_lette_greater_than_target;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c');
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (letters[middle] > target) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }

        return letters[low % letters.length];
    }
}
