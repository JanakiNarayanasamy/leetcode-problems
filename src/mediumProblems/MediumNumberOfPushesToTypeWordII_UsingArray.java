package mediumProblems;

import java.util.*;
import java.util.stream.Collectors;

public class MediumNumberOfPushesToTypeWordII_UsingArray {
    public static void main(String[] args) {
        String word= "aremgjnptohswfdkyuzvicqxb";
        System.out.println(minimumPushes(word));
    }
    public static int minimumPushes(String word) {
        int[] arr = new int[26];
        Arrays.fill(arr,0);
        for (int i=0; i < word.length(); i++){
            arr[word.charAt(i)- 97] = arr[word.charAt(i)- 97]+1;
        }
        Arrays.sort(arr);
        int count =0;
        int multiplier =1;
        int i = 25;
        int ans =0;
        while ( i > 0 && arr[i] > 0) {
            ans += arr[i]*multiplier;
            count++;
            if(count == 8){
                count =0;
                multiplier++;
            }
            i--;
        }
        return ans;
    }
}
