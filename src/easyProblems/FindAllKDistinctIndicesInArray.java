package easyProblems;

import java.util.*;

public class FindAllKDistinctIndicesInArray {
    public static void main(String[] args) {
        int[] nums = {3,4,9,1,3,9,5};
        int key = 9, k = 1;
        System.out.println(findKDistantIndices(nums, key, k));
    }
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> result = new ArrayList<>();
        for (int i =0; i< nums.length; i++){
            if(nums[i] == key){
                int j  = i - k;
                while (j < i + k +1){
                    if(j >= 0 && j < nums.length){
                        if(!result.contains(j)){
                            result.add(j);
                        }
                    }
                    j++;
                }
            }
        }
        return result;

    }
}
