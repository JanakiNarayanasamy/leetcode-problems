public class SumOfUniqueElements {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        System.out.println(sumOfUnique(nums));
    }
    public static int sumOfUnique(int[] nums) {
        int count =0;
        int[] arr= new int[101];
        for(int i =0; i< nums.length ; i++ ){
            arr[nums[i]] += 1;
        }
        for (int i =0 ; i < arr.length; i++){
            if(arr[i] == 1){
                count += i;
            }
        }
        return count;
    }
}
