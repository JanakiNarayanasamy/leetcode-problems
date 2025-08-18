package easyProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberOfDistinctAverages {
    public static void main(String[] args) {
        int[] nums = {4,1,4,0,3,5};
        System.out.println(distinctAverages(nums));
    }
    public static int distinctAverages(int[] nums) {
        Set<Double> set= new HashSet<>();
        Arrays.sort(nums);
        int i =0 , j = nums.length -1;
        while (i < j){
            set.add((nums[i]+nums[j])/2.0);
            i++;
            j--;
        }
        return set.size();
    }

}
