package mediumProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinDiffBWMaxAndSmallNumIn3Moves {
    public static void main(String[] args) {
        int[] nums = {6,6,0,1,1,4,6};
        System.out.println(minDifference(nums));
    }

    public static int minDifference(int[] nums) {
        if(nums.length <= 4){
            return 0;
        }else {
            Arrays.sort(nums);
            int a = nums.length;
            List<Integer> arr = new ArrayList<>();
            arr.add(nums[a-4] - nums[0]);
            arr.add(nums[a-3] - nums[1]);
            arr.add( nums[a-2] - nums[2]);
            arr.add( nums[a-1] - nums[3]);
            return Collections.min(arr);
        }
    }
    public static int minDifference1(int[] nums) {
        if(nums.length <= 4){
            return 0;
        }else {
            Arrays.sort(nums);
            int a = nums.length;
            int minDiff = Integer.MAX_VALUE;
            minDiff = Math.min(minDiff, nums[a - 4] - nums[0]);
            minDiff = Math.min(minDiff, nums[a - 3] - nums[1]);
            minDiff = Math.min(minDiff, nums[a - 2] - nums[2]);
            minDiff = Math.min(minDiff, nums[a - 1] - nums[3]);
            return minDiff;
        }
    }

}
