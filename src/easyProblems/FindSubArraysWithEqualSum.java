package easyProblems;

import java.util.HashSet;
import java.util.Set;

public class FindSubArraysWithEqualSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(findSubarrays(nums));
    }
    public static boolean findSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0 ; i< nums.length - 1; i++){
            if(!set.add(nums[i]+nums[i+1])){
                return true;
            }
        }
        return false;
    }
}
