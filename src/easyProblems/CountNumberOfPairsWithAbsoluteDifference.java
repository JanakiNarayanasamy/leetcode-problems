package easyProblems;

public class CountNumberOfPairsWithAbsoluteDifference {
    public static void main(String[] args) {
        int[] nums = {1,3};
        int k = 3;
        System.out.println(countKDifference(nums, k));
    }
    public static int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i=0; i< nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if(Math.abs(nums[i]- nums[j]) == k){
                    count++;
                }
            }
        }
        return count;
    }
}
