package mediumProblems;

import java.util.Arrays;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        for (int i=1; i< nums.length; i++){
            res[i] = res[i-1]*nums[i-1];
        }
        int currentValue = 1;
        for (int i = nums.length-1; i >= 0; i--){
            res[i] = res[i]* currentValue;
            currentValue = nums[i] * currentValue;
        }
        return res;
    }

}
