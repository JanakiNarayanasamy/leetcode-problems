package easyProblems;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentEvenElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,4,4,1};
        System.out.println(mostFrequentEven(nums));
    }
    public static int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int maxValue = Integer.MIN_VALUE;
        int result = -1;
        for (int num:nums){
            if(num%2 == 0){
                count.put(num, count.getOrDefault(num, 0)+1);
            }
        }
        if (count.isEmpty()) return -1;
        for (Map.Entry<Integer, Integer> entry:count.entrySet()){
            if(entry.getValue() > maxValue){
                maxValue = entry.getValue();
                result = entry.getKey();
            }else if(entry.getValue() == maxValue){
                if(entry.getKey() < result){
                    result = entry.getKey();
                }
            }
        }
        return result;
        
    }
}
