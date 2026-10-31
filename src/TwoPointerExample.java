import java.util.Arrays;

public class TwoPointerExample {
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // Keep swapping until the pointers meet in the middle
        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[arr.length - 1 - left] = temp; // dynamically uses right's mirror or just arr[right]

            // Move pointers closer
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("Original: " + Arrays.toString(numbers));
        reverseArray(numbers);
        System.out.println("Reversed: " + Arrays.toString(numbers));
    }
}
