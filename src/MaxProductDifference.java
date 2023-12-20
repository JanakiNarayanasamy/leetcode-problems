import java.util.Arrays;

public class MaxProductDifference {
    public static void main(String[] args) {
    int[] arr = {4,2,5,9,7,4,8};
        System.out.println(maxProductDifference(arr));
        sortArray(arr);
    }
    public static int maxProductDifference(int[] nums) {
        int max=Integer.MIN_VALUE, max1=Integer.MIN_VALUE, min=Integer.MAX_VALUE, min1=Integer.MAX_VALUE;
        for (int num : nums) {
            if (num >= max) {
                max1 = max;
                max = num;
            } else if (num > max1)
                max1 = num;

            if (num <= min) {
                min1 = min;
                min = num;
            } else if (num < min1)
                min1 = num;
        }
        return (max * max1) - (min * min1);
    }

    public static void sortArray(int[] arr){

        int temp;
        for (int i =0; i< arr.length; i++){
            for(int j =i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::print);

    }

}
