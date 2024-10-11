package mediumProblems;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumWidthRamp {
    public static void main(String[] args) {
        int[] nums = {9,8,1,0,1,9,4,0,4,1};
        System.out.println(maxWidthRamp(nums));
    }

    public static int maxWidthRamp(int[] nums) {
        int n = nums.length;
        Deque<Integer> stk = new ArrayDeque<>();
        int max = 0;
        for(int i =0; i < nums.length; i++){
            if(stk.isEmpty() || nums[stk.peek()] > nums[i]){
                stk.push(i);
            }
        }

        for(int i = n-1; i >= 0 ; i--){
            while(!stk.isEmpty() && nums[stk.peek()] <= nums[i]){
                max = Math.max(max, i - stk.pop());
            }
            if(stk.isEmpty()){
                break;
            }

        }
        return max;
    }
}
