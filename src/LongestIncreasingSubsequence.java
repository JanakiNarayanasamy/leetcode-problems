import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,2,3};
        System.out.println(lengthOfLIS(nums));
    }
    public static int lengthOfLIS(int[] nums) {
        int maxLIS = 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        for (int i = nums.length-1; i >= 0; i--){
            for (int j = i-1; j >= 0 ; j--){
                if(nums[i] > nums[j]){
                    dp[j] = Math.max(dp[j], 1+dp[i]);
                }
            }
            maxLIS = Math.max(maxLIS, dp[i]);
        }
        return maxLIS;
    }
}
