import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            // HashSet.add() returns false if the element already exists
            if (!seen.add(num)) {
                return true; // Duplicate found
            }
        }

        return false; // All elements are unique
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 1};
        int[] test2 = {1, 2, 3, 4};

        System.out.println("Test 1 has duplicates: " + hasDuplicate(test1)); // true
        System.out.println("Test 2 has duplicates: " + hasDuplicate(test2)); // false
    }
}
