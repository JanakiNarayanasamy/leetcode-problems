import java.util.Arrays;

public class MaximumAreaOfHorizontalAndVerticalCuts {
    public static void main(String[] args) {
        int h = 1000000000; int w = 1000000000;
        int[] horizontalCuts = {2};
        int[] verticalCuts = {2};
        System.out.println(maxArea(h,w,horizontalCuts,verticalCuts));
    }
    public static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        long count=Math.max(horizontalCuts[0],h-horizontalCuts[horizontalCuts.length-1]);
        long count1=Math.max(verticalCuts[0],w-verticalCuts[verticalCuts.length-1]);
        count= compareArray(count,horizontalCuts);
        count1= compareArray(count1,verticalCuts);
        return (int) ((count*count1)%(long)(Math.pow(10,9)+7));
    }
    private static long compareArray(long count, int[] arr){
        for(int i =1; i< arr.length;i++){
            count = Math.max(count, arr[i]-arr[i-1]);
        }
        return count;
    }
}
