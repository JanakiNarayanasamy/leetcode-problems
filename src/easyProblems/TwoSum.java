package easyProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1,2,15,7};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i =0;i< nums.length; i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                return new int[]{map.get(rem), i};
            }
            map.put(nums[i],i);
        }
        return new int[] {-1, -1};
    }
}
