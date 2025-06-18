package mediumProblems;

public class MaximumSumCircularArray {
    public static void main(String[] args) {
        int[] nums = {1,-2,3,-2};
        System.out.println(maxSubarraySumCircular(nums));
    }
    public static int maxSubarraySumCircular(int[] nums) {
        int sum=0;
        int currentMax=0, currentMin =0;
        int maxSum = nums[0];
        int minSum = nums[0];
        for (int num:nums){
            currentMax = Math.max(currentMax+num, num);
            maxSum = Math.max(maxSum, currentMax);
            currentMin = Math.min(currentMin+num, num);
            minSum = Math.min(minSum, currentMin);
            sum += num;
        }
        return currentMax > 0 ? Math.max(maxSum, sum-minSum) : maxSum;
    }
}
