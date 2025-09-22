package easyProblems;

public class CountElementsWithMaximumFrequency {
    public static void main(String[] args) {
       int[] nums = {1,2,2,3,1,4};
        System.out.println(maxFrequencyElements(nums));
    }
    public static int maxFrequencyElements(int[] nums) {
        int[] count = new int[101];
        int temp =0;
        int max = 0;
        for (int i =0 ; i< nums.length; i++){
            count[nums[i]]++;
            max = Math.max(count[nums[i]], max);
        }
        for (int i=1; i< count.length; i++){
            if(count[i] == max){
                temp++;
            }
        }
        return max * temp;
    }
}
