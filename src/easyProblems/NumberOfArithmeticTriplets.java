package easyProblems;

import java.util.HashMap;
import java.util.Map;

public class NumberOfArithmeticTriplets {
    public static void main(String[] args) {
        int[] nums = {0,1,4,6,7,10};
        int diff = 3;
        System.out.println(arithmeticTriplets(nums, diff));
    }
    public static int arithmeticTriplets(int[] nums, int diff) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i=0; i< nums.length; i++){
            int num1= nums[i] - diff;
            if(map.containsKey(num1) && i > map.get(num1)){
                int num2 = num1 - diff;
                if(map.containsKey(num2) && map.get(num1) > map.get(num2)){
                    count++;
                }
            }
            map.put(nums[i], i);

        }
        return count;
    }
}
