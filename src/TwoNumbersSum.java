import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class TwoNumbersSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map1 = new HashMap<>();
        int[] result = new int[2];
        int num1 = 0;
        for (int i =0; i< nums.length ; i++){
            map1.put(nums[i],i);
        }
        for (int i =0; i< nums.length ; i++){
            num1 = target - nums[i];
            if (map1.containsKey(num1) && map1.get(num1) != i){
                result[0] = i;
                 result[1]= map1.get(num1);
                 break;
            }
        }
    return result;
    }

    public static void main(String[] args) {
      int[] arr = {3,3};
      TwoNumbersSum twoNumbersSum = new TwoNumbersSum();
        System.out.println(Arrays.toString(twoNumbersSum.twoSum(arr, 6)));

    }
}
