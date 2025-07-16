package mediumProblems;

import java.util.Arrays;

public class MaximumConsecutiveFloorsWIthoutSpecialFloors {
    public static void main(String[] args) {
        int bottom = 6, top = 8;
        int[] special = {7,6,8};
        System.out.println(maxConsecutive(bottom, top, special));
    }
    public static int maxConsecutive(int bottom, int top, int[] special) {
        int max = Integer.MIN_VALUE;
        Arrays.sort(special);
        max = Math.max(max, special[0] - bottom);
        max = Math.max(max, top - special[special.length -1]);
        for (int i=1; i< special.length; i++){
            max = Math.max(max, special[i] - special[i-1] -1);
        }
        return max;
    }
}
