package mediumProblems;

import java.util.Arrays;

public class SpecialArrayII {
    public static void main(String[] args) {
        int[] nums = {4,3,1,6,5,7,8,10};
        int[][] queries = {{0,2},{1,3}};
        System.out.println(Arrays.toString(isArraySpecial(nums, queries)));
    }

    public static boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] d = new int[n];

        for (int i=1; i< n; i++){
            if(nums[i] % 2 != nums[i-1] % 2){
                d[i] = d[i-1];
            }else {
                d[i] = i;
            }
        }

        System.out.println(Arrays.toString(d));
        int m = queries.length;
        boolean[] ans = new boolean[m];
        for (int i=0; i < m ; i++){
            ans[i] = d[queries[i][1]] <= queries[i][0];
        }
        return ans;
    }
}