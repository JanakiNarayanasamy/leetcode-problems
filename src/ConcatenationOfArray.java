import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] arr= getConcatenation(nums);
        Arrays.stream(arr).forEach(System.out::print);
    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n*2];
        for(int i =0; i< nums.length; i++){
            arr[i]= nums[i];
            arr[i+n]= nums[i];
        }
        return arr;
    }
}
