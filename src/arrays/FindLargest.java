package arrays;

/**
 * Problem: Find the largest element in an array.
 *
 * Concept:
 *  - Start by assuming the first element is the largest.
 *  - Compare it with every other element.
 *  - If a bigger element is found, update the largest.
 *
 * Dry Run with {10, 15, 22, 33, 40, 51, 60, 75}:
 *  largest = 10
 *  10 vs 15 → largest = 15
 *  15 vs 22 → largest = 22
 *  22 vs 33 → largest = 33
 *  33 vs 40 → largest = 40
 *  40 vs 51 → largest = 51
 *  51 vs 60 → largest = 60
 *  60 vs 75 → largest = 75
 *  Result: 75
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */
public class FindLargest {

    public static void main(String[] args) {

        int[] numbers = {10, 15, 22, 33, 40, 51, 60, 75};

        int largest = numbers[0]; // assume first element is largest

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i]; // update if a bigger number is found
            }
        }

        System.out.println("Largest element: " + largest);
    }
}
