public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea1(height));
    }
    public static int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        for (int i =0; i < height.length;i++){
            for (int j =i; j < height.length; j++){
                max= Math.max(max,(j-i)*Math.min(height[j],height[i]));
            }
        }
        return max;
    }

    public static int maxArea1(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            max = Math.max(max, h * w);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}
