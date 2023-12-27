import java.util.ArrayList;
import java.util.List;

public class MinimumTimeToMakeRopeColorful {
    public static void main(String[] args) {

    String colors = "aabaa";
    int[] neededTime= {1,2,3,4,1};
        //System.out.println(minCost(colors,neededTime));
        System.out.println(minCost1(colors,neededTime));
    }
    public static int minCost(String colors, int[] neededTime) {
        int count=0;
        int temp=0;
        int i=0;
        int sum=0;
        int n = colors.length();
        char[] charArray = colors.toCharArray();
        while (i < n-1){
            sum = sum + neededTime[i];
            temp = Math.max(temp,neededTime[i]);
            int j =i;
            while (j < n-1 && charArray[j] == charArray[j+1]){
                sum = sum + neededTime[j+1];
                temp = Math.max(temp,neededTime[j+1]);
                j++;
            }
            count = count + (sum - temp);
            sum =0; temp =0;
            if(i  != j){
                i =j;
            }else {
                i++;
            }
        }

        return count;
    }
    public static int minCost1(String colors, int[] neededTime) {
        int minTime = 0;
        int n = colors.length();
        char[] colorsArray = colors.toCharArray();
        for (int i = 1; i < n; i++) {
            if (colorsArray[i] == (colorsArray[i-1])) {
                minTime += Math.min(neededTime[i],neededTime[i-1]);
                neededTime[i] = Math.max(neededTime[i],neededTime[i-1]);

            }
        }
        return minTime;
    }
}
