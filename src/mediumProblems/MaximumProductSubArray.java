package mediumProblems;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,3,-4};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        int maxProduct =nums[0];
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        for (int i=1; i< nums.length; i++){
            int currentIndex= nums[i];
            if(nums[i] < 0){
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }
            maxSoFar = Math.max(currentIndex , currentIndex*maxSoFar);
            minSoFar = Math.min(currentIndex , currentIndex*minSoFar);
            maxProduct = Math.max(maxProduct, maxSoFar);
        }
        return maxProduct;
    }
}
