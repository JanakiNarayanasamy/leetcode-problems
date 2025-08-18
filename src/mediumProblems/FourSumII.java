package mediumProblems;

import java.util.HashMap;
import java.util.Map;

public class FourSumII {
    public static void main(String[] args) {
        int[] nums1 = {-1, -1}, nums2 = {-1, 1}, nums3 = {-1, 1}, nums4 = {1, -1};
        System.out.println(fourSumCount(nums1, nums2, nums3, nums4));
    }

    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int a : nums1) {
            for (int b : nums2) {
                int sum = a + b;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        for (int c : nums3) {
            for (int d : nums4) {
                int sum = c + d;
                count += map.getOrDefault(-sum, 0);
            }
        }
        return count;
    }
}
