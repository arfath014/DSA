package arrays;

/**
 * Problem: Print all even numbers from an array.
 *
 * Concept: A number is even if it is divisible by 2 (number % 2 == 0).
 *
 * Approach:
 *  - Iterate through each element of the array.
 *  - Check if the element is divisible by 2.
 *  - If yes, print it.
 *
 * Time Complexity : O(n) — we visit every element once.
 * Space Complexity: O(1) — no extra storage needed.
 */
public class EvenNumbers {

    public static void main(String[] args) {

        int[] numbers = {10, 15, 22, 33, 40, 51, 60, 75};

        System.out.println("Even numbers:");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
