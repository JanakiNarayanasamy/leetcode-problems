import java.util.Arrays;

public class SetMisMatch {
    public static void main(String[] args) {
        int[] nums = {4,8,1,5,2,7,4,6};
        int[] nums1= {1,1};
        System.out.println(Arrays.toString(findErrorNums(nums1)));
    }
    public static int[] findErrorNums(int[] nums) {
        int expSum= nums.length *(nums.length+1)/2;
        int actSum=0;
        int[] res = new int[2];
        int[] arr = new int[nums.length+1];
        for(int i=0; i < nums.length; i++){
            if (arr[nums[i]] == 1) {
                res[0] = nums[i];
                actSum = actSum + nums[i];
            }else {
                arr[nums[i]] = +1;
                actSum = actSum + nums[i];
            }
        }
        res[1] = expSum - (actSum -res[0]);
        return res;
    }
}
