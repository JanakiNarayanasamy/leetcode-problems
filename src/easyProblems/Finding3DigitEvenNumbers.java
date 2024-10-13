package easyProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Finding3DigitEvenNumbers {
    public static void main(String[] args) {
        int[] digits = {2,1,3,0};
        System.out.println(Arrays.toString(findEvenNumbers(digits)));
    }
    public static int[] findEvenNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        int value = 0;
        for(int i =0; i< digits.length; i++){
            for(int j =0; j < digits.length; j++){
                for(int k=0; k < digits.length; k++){
                    if(i != j && j != k && k != i){
                        value = digits[i]*100+ digits[j]*10 + digits[k];
                        if(value >= 100 && value <= 999){
                            if(value %2 == 0){
                                set.add(value);
                            }
                        }
                    }
                }
            }
        }
        return set.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}
