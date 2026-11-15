package arrays;

/**
 * Problem: Find the Sum and Average of all elements in an array.
 *
 * What it does:
 *  - Adds up all the numbers in the array → Sum
 *  - Divides the sum by the total count of numbers → Average
 *
 * Concepts used:
 *  - Accumulator variable (sum starts at 0, keeps adding)
 *  - Enhanced for-each loop (cleaner way to loop through an array)
 *  - Type casting: (double) converts int to double BEFORE division
 *    so we don't lose the decimal part
 *
 * Why (double) cast is important:
 *  - In Java, int / int always gives an int (decimal is chopped off)
 *  - Example: 306 / 8 = 38 (wrong!)
 *  - Fix:  (double) 306 / 8 = 38.25 (correct!)
 *
 * Dry Run with {10, 15, 22, 33, 40, 51, 60, 75}:
 *  sum = 0
 *  sum = 0  + 10 = 10
 *  sum = 10 + 15 = 25
 *  sum = 25 + 22 = 47
 *  sum = 47 + 33 = 80
 *  sum = 80 + 40 = 120
 *  sum = 120 + 51 = 171
 *  sum = 171 + 60 = 231
 *  sum = 231 + 75 = 306
 *
 *  length  = 8
 *  average = (double) 306 / 8 = 38.25
 *
 * Expected Output:
 *  Array:   [10, 15, 22, 33, 40, 51, 60, 75]
 *  Sum:     306
 *  Average: 38.25
 *
 * Time Complexity : O(n) — we visit every element once
 * Space Complexity: O(1) — only two extra variables (sum, average)
 */
public class SumAndAverage {

    public static void main(String[] args) {

        int[] numbers = {10, 15, 22, 33, 40, 51, 60, 75};

        // Print the array so the reader knows what we are working with
        System.out.print("Array: [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", "); // print comma after every element except the last
            }
        }
        System.out.println("]");

        // Step 1: Calculate Sum
        // Start with 0 and keep adding each element (this is called an accumulator)
        int sum = 0;
        for (int number : numbers) {  // enhanced for-each loop — no index needed
            sum += number;            // same as: sum = sum + number
        }

        System.out.println("Sum: " + sum);

        // Step 2: Calculate Average
        // Store length in a variable for clarity
        int length = numbers.length;

        // IMPORTANT: Cast sum to double BEFORE dividing
        // Without cast → 306 / 8 = 38   (integer division, decimal lost!)
        // With cast    → 306.0 / 8 = 38.25 (correct decimal result)
        double average = (double) sum / length;

        System.out.println("Average: " + average);
    }
}
