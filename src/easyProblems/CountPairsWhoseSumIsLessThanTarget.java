package easyProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountPairsWhoseSumIsLessThanTarget {
    public static void main(String[] args) {
        List<Integer> nums = List.of(-6,2,5,-2,-7,-1,3);
        int target = -2;
        System.out.println(countPairs(nums, target));
    }
    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;int num;

        for (int i =0 ; i < nums.size(); i++){
            num = nums.get(i);
            for (int j = i+1; j < nums.size(); j++ ){
                if(num +nums.get(j) < target){
                    count++;
                }
            }
        }
        return count;

    }
}
