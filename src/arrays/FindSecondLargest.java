package arrays;

/**
 * Problem: Find the second largest element in an array.
 *
 * Concept:
 *  - Track two variables: largest and secondLargest.
 *  - If current element > largest, update secondLargest = largest, then largest = current.
 *  - Else if current element > secondLargest (and not equal to largest), update secondLargest.
 *
 * Dry Run with {10, 75, 22, 33, 40, 51, 60, 75}:
 *  largest = MIN_VALUE, secondLargest = MIN_VALUE
 *  10  → largest=10, secondLargest=MIN
 *  75  → largest=75, secondLargest=10
 *  22  → 22 < 75, 22 > 10 → secondLargest=22
 *  33  → 33 > 22 → secondLargest=33
 *  40  → 40 > 33 → secondLargest=40
 *  51  → 51 > 40 → secondLargest=51
 *  60  → 60 > 51 → secondLargest=60
 *  75  → 75 == largest, skip (avoid duplicate)
 *  Result: secondLargest = 60
 *
 * Time Complexity : O(n) — single pass
 * Space Complexity: O(1)
 */
public class FindSecondLargest {

    public static void main(String[] args) {

        int[] numbers = {10, 75, 22, 33, 40, 51, 60, 75};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest; // old largest becomes second largest
                largest = numbers[i];   // update largest
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i]; // update second largest
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (all elements are the same).");
        } else {
            System.out.println("Largest: " + largest);
            System.out.println("Second Largest: " + secondLargest);
        }
    }
}
