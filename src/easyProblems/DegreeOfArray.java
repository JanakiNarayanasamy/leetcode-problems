package easyProblems;

import java.util.*;

public class DegreeOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1,4,2};
        System.out.println(findShortestSubArray(nums));
    }
    public static int findShortestSubArray(int[] nums) {
        int maxFrequency = 0;
        int maxDifference = Integer.MAX_VALUE;
        Map<Integer, List<Integer>> map= new HashMap<>();
        for (int i=0; i< nums.length; i++){
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>(Arrays.asList(1, i, i)));
            } else {
                List<Integer> list = map.get(nums[i]);
                list.set(0, list.get(0) + 1);
                list.set(2, i);
            }
        }

        for (Map.Entry<Integer, List<Integer>> entry: map.entrySet()){
            if(entry.getValue().get(0) > maxFrequency){
                maxFrequency = entry.getValue().get(0);
                maxDifference = entry.getValue().get(2) - entry.getValue().get(1)+1;
            }else if(maxFrequency == entry.getValue().get(0)){
                maxDifference = Math.min(maxDifference,entry.getValue().get(2) - entry.getValue().get(1)+1);
            }

        }
        return maxDifference;

    }
}
