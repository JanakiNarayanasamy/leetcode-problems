package easyProblems;

import java.util.HashSet;
import java.util.Set;

public class LargestPositiveIntegerExistsWithItsNegative {
    public static void main(String[] args) {
        int[] nums = {-1,2,-3,3};
        System.out.println(findMaxK(nums));

    }
    public static int findMaxK(int[] nums) {
        int val = -1;
        Set<Integer> set = new HashSet<>();
        for (int num : nums){
            if(set.contains(-num)){
                val = Math.max(val, Math.abs(num));
            }
            set.add(num);
        }
        return val;
    }
}
