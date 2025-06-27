package mediumProblems;

public class LongestTurbulentArray {
    public static void main(String[] args) {
        int[] arr = {9,4,2,10,7,8,8,1,9};
        System.out.println(maxTurbulenceSize(arr));
    }
    public static int maxTurbulenceSize(int[] arr) {
        if (arr.length == 1) return 1;

        int maxLen = 1;
        int start = 0;

        for (int i = 1; i < arr.length; i++) {
            int cmp = Integer.compare(arr[i - 1], arr[i]);
            if (cmp == 0) {
                start = i;
            } else if (i == arr.length - 1 || cmp * Integer.compare(arr[i], arr[i + 1]) != -1) {
                maxLen = Math.max(maxLen, i - start + 1);
                start = i;
            }
        }

        return maxLen;
    }
}
