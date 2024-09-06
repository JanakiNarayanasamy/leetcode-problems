package mediumProblems;

import java.util.Arrays;

public class FindMissingObservations {
    public static void main(String[] args) {
        int[] rolls = {3,2,4,3};
        int mean = 4;
        int n = 2;
        System.out.println(Arrays.toString(missingRolls(rolls, mean, n)));
    }
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        int sum = (rolls.length + n) * mean;
        for (int roll:rolls){
            sum -= roll;
        }
        if(sum > n * 6 || sum < n){
            return new int[0];
        }
        int[] missingRolls = new int[n];
        Arrays.fill(missingRolls, sum/n);

        for (int i = 0; i < sum % n; ++i) {
            ++missingRolls[i];
        }
        return missingRolls;
    }
}
