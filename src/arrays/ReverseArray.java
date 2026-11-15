package arrays;

/**
 * Problem: Reverse an array.
 *
 * Concept:
 *  - Use two pointers: one at the start (left), one at the end (right).
 *  - Swap the elements at both pointers.
 *  - Move left forward and right backward.
 *  - Repeat until the two pointers meet in the middle.
 *
 * Dry Run with {10, 15, 22, 33, 40}:
 *  left=0, right=4 → swap 10 and 40 → {40, 15, 22, 33, 10}
 *  left=1, right=3 → swap 15 and 33 → {40, 33, 22, 15, 10}
 *  left=2, right=2 → pointers met, stop
 *  Result: {40, 33, 22, 15, 10}
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1) — reversed in-place, no extra array needed
 */
public class ReverseArray {

    public static void main(String[] args) {

        int[] numbers = {10, 15, 22, 33, 40, 51, 60, 75};

        System.out.print("Original array: ");
        printArray(numbers);

        // Two-pointer approach to reverse in-place
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            // Swap elements at left and right positions
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            left++;
            right--;
        }

        System.out.print("Reversed array: ");
        printArray(numbers);
    }

    // Helper method to print array elements
    static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
