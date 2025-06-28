package mediumProblems;

public class MaximumAbsoluteSumOfAnySubArray {
    public static void main(String[] args) {
        int[] nums = {2,-5,1,-4,3,-2};
        System.out.println(maxAbsoluteSum(nums));
    }
    public static int maxAbsoluteSum(int[] nums) {
        int curMax = nums[0];
        int maxSum = nums[0];
        int curMin = nums[0];
        int minSum = nums[0];
        int value;
        for (int i =1; i< nums.length; i++){
            value = nums[i];
            curMax = Math.max(value, value+curMax);
            maxSum = Math.max(maxSum, curMax);

            curMin = Math.min(value, value+curMin);
            minSum = Math.min(minSum, curMin);
        }

        return Math.max(maxSum, Math.abs(minSum));
    }
}
