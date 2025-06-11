package easyProblems;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicatesII {
    public static void main(String[] args) {
        int[] nums = {1,2,3,0};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i< nums.length; i++){
            Integer z = map.get(nums[i]);
            if(z != null && i - z <= k){
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
