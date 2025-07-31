package mediumProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfKSumPairs {
    public static void main(String[] args) {
        int[] nums = {2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2};
        int k = 3;
        System.out.println(maxOperations(nums, k));
    }
    public static int maxOperations(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> map= new HashMap<>();
        for (int i =0; i<nums.length; i++ ){
            if(nums[i] <= k){
                int num = k - nums[i];
                if (map.getOrDefault(num,0) >= 1){
                    map.put(num, map.get(num)-1);
                    count++;
                    continue;
                }
                map.put(nums[i], map.getOrDefault(nums[i],0)+1 );
            }
        }
        return count;
    }
}
