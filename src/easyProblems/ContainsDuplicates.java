package easyProblems;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for(int num: nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
}
