import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] findTwoSum(int[] numbers, int target) {
        // Store numbers we have already checked
        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            // Find the missing number needed to reach the target
            int needed = target - numbers[i];

            // If we saw that number before, return both positions
            if (seen.containsKey(needed)) {
                return new int[] { seen.get(needed), i };
            }

            // Remember this number and its position for later
            seen.put(numbers[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] myList = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = findTwoSum(myList, target);
        System.out.println(Arrays.toString(result)); // Output: [0, 1]
    }
}
