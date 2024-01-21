import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {1,3,1,3,100};
        System.out.println(rob(nums));
        System.out.println(rob1(nums));
    }
    public static int rob(int[] nums) {
        int temp = 0;
        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        } else if (nums.length > 2) {

            int[] dp = new int[nums.length];
            dp[0] = nums[0];
            dp[1] = nums[1];
            for (int i = 2; i < nums.length; i++) {
                int j = i - 2;
                while (j >= 0) {
                    temp = Math.max(nums[i] + dp[j], temp);
                    j--;
                }
                dp[i] = temp;
            }
            temp = Arrays.stream(dp).max().getAsInt();
        }
        return temp;
    }

    public static int rob1(int[] nums) {
        int[] f = new int[nums.length + 1];

        f[1] = nums[0];

        for(int i = 2; i < f.length; i++) {
            f[i] = Math.max(nums[i-1] + f[i-2], f[i-1]);
        }

        return f[nums.length];
    }
}
