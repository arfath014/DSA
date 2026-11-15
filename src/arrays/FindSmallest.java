package arrays;

/**
 * Problem: Find the smallest element in an array.
 *
 * Concept:
 *  - Start by assuming the first element is the smallest.
 *  - Compare it with every other element.
 *  - If a smaller element is found, update the smallest.
 *
 * Dry Run with {10, 15, 22, 33, 40, 51, 60, 75}:
 *  smallest = 10
 *  10 vs 15 → 10 is still smaller
 *  10 vs 22 → 10 is still smaller
 *  ... (10 wins every comparison)
 *  Result: 10
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */
public class FindSmallest {

    public static void main(String[] args) {

        int[] numbers = {10, 15, 22, 33, 40, 51, 60, 75};

        int smallest = numbers[0]; // assume first element is smallest

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i]; // update if a smaller number is found
            }
        }

        System.out.println("Smallest element: " + smallest);
    }
}
