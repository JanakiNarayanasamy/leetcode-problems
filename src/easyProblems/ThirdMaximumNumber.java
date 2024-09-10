package easyProblems;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,2,5,3,5};
        System.out.println(thirdMax(nums));
    }
    public static int thirdMax(int[] nums) {

        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for(int i=0 ;i< nums.length; i++){
            if(first <nums[i]){
                third = second;
                second = first;
                first = nums[i];
            }else if(second < nums[i] && nums[i] != first){
                third = second;
                second = nums[i];
            }else if(third < nums[i] && nums[i] != second && nums[i] != first){
                third = nums[i];
            }
        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        if(third == Long.MIN_VALUE ){
            return (int) first;
        }

        return (int) third;
    }
}
