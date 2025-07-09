package mediumProblems;

import java.util.HashMap;
import java.util.Map;

public class SplitArrayIntoConsecutiveSubsequence {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,4,4,5,5};
        System.out.println(isPossible(nums));
    }
    public static boolean isPossible(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        Map<Integer, Integer> endMap = new HashMap<>();

        // Step 1: Count frequency of each number
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Try to place each number
        for (int num : nums) {
            if (countMap.get(num) == 0) continue;

            // Option 1: Extend an existing subsequence
            if (endMap.getOrDefault(num - 1, 0) > 0) {
                endMap.put(num - 1, endMap.get(num - 1) - 1);
                endMap.put(num, endMap.getOrDefault(num, 0) + 1);
            }
            // Option 2: Start a new subsequence
            else if (countMap.getOrDefault(num + 1, 0) > 0 &&
                    countMap.getOrDefault(num + 2, 0) > 0) {
                countMap.put(num + 1, countMap.get(num + 1) - 1);
                countMap.put(num + 2, countMap.get(num + 2) - 1);
                endMap.put(num + 2, endMap.getOrDefault(num + 2, 0) + 1);
            }
            // Option 3: Cannot use this number
            else {
                return false;
            }

            // Use current number
            countMap.put(num, countMap.get(num) - 1);
        }

        return true;
    }
}
