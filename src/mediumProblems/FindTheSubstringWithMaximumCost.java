package mediumProblems;

import java.util.Arrays;

public class FindTheSubstringWithMaximumCost {
    public static void main(String[] args) {
        String s = "hghhghgghh", chars = "hg";
        int[] vals = {2,3};
        System.out.println(maximumCostSubstring(s,chars,vals));
    }
    public static int maximumCostSubstring(String s, String chars, int[] vals) {
        int[] arr = new int[26];
        Arrays.fill(arr, Integer.MIN_VALUE);
        for (int i=0; i< chars.length();i++){
            arr[chars.charAt(i) - 'a'] = vals[i];
        }
        int curSum = 0;
        int maxSum = 0;
        int j;
        for (int i=0; i< s.length(); i++){
            int z = arr[s.charAt(i) - 'a'];
            if(z != Integer.MIN_VALUE){
                j = z;
            }else {
                j = s.charAt(i) - 'a' +1;
            }
            curSum = Math.max(j , curSum +j);
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;
    }
}
