import java.util.Arrays;

public class MinimumOperationsToMakeArrayEmpty {
    public static void main(String[] args) {
        int[] nums = {2,1,2,2,3,3};
        System.out.println(minOperations(nums));
    }
    public static int minOperations(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int[] res = new int[max+1];
        int count =0;
        for (int i =0; i < nums.length; i++){
            res[nums[i]] += 1;
        }
        for (int j =0; j < res.length; j++){
            if(res[j] > 0){
                if(res[j] == 1){
                    return -1;
                }
                if(res[j]%3 == 0){
                    count += res[j]/3;
                }else if(res[j]%3 == 1){
                    count += (res[j]/3) + 1;
                }else if(res[j]%3 == 2){
                    count += (res[j]/3) + 1;
                }
                else if(res[j]%2 == 0){
                    count += res[j]/2;
                }
            }
        }
        return count;
    }
}
