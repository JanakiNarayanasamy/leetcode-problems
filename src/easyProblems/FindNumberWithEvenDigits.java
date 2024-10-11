package easyProblems;

public class FindNumberWithEvenDigits {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count =0;
        for(int i: nums){
             if(check(i)%2 == 0){
                 count++;
             }
        }
        return count;
    }

    public static int check(int i){
        System.out.println(Math.log10(i));
        return (int) (Math.log10(i)+1);
    }
}
