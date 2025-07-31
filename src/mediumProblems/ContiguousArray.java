package mediumProblems;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,1,1,0,0,0};
        System.out.println(findMaxLength(nums));
    }
    public static int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int maxLength = 0;
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += (nums[i] == 0) ? -1 : 1;

            if (map.containsKey(prefixSum)) {
                int length = i - map.get(prefixSum);
                maxLength = Math.max(maxLength, length);
            } else {
                map.put(prefixSum, i);
            }
        }

        return maxLength;
    }
}
