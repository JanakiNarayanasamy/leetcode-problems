package mediumProblems;

import java.util.HashMap;

public class ContinuousSubArraySum {
    public static void main(String[] args) {
        int[] nums = {5,0,0,0};
        int k = 3;
        System.out.println(checkSubarraySum(nums, k));
    }
    public static boolean checkSubarraySum(int[] nums, int k) {
        int prefixMod = 0;
        HashMap<Integer, Integer> modSeen = new HashMap<>();
        modSeen.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            prefixMod = (prefixMod + nums[i]) % k;
            if (modSeen.containsKey(prefixMod)) {
                if (i - modSeen.get(prefixMod) > 1) {
                    return true;
                }
            } else {
                modSeen.put(prefixMod, i);
            }
        }
        return false;
    }
}
