package mediumProblems;

import java.util.Arrays;

public class FindThreeConsecutiveIntegersThatSumToAGivenNumber {
    public static void main(String[] args) {
        long num = 4;
        System.out.println(Arrays.toString(sumOfThree(num)));
    }
    public static long[] sumOfThree(long num) {
        long x = num/3;
        if((x-1)+x+(x+1) == num){
            return new long[]{x-1, x, x+1};
        }else {
            return new long[0];
        }
    }
}
