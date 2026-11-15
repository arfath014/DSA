package arrays;

/**
 * Problem: Print all odd numbers from an array.
 *
 * Concept: A number is odd if it is NOT divisible by 2 (number % 2 != 0).
 *
 * Approach:
 *  - Iterate through each element of the array.
 *  - Check if the element has a remainder of 1 when divided by 2.
 *  - If yes, print it.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */
public class OddNumbers {

    public static void main(String[] args) {

        int[] numbers = {10, 15, 22, 33, 40, 51, 60, 75};

        System.out.println("Odd numbers:");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
